package service;

import model.Person;
import model.Professor;
import model.Student;
import java.util.Scanner;
import static utils.Constants.PROFESSOR;
import static utils.Constants.STUDENT;

public class StorageService {
    private DatabaseService databaseService;

    public StorageService(){
       this.databaseService = new DatabaseService();
    }

    public void create(Scanner scanner) {
        System.out.println("Enter type of person [student/profesor]:");
        String typeOfPerson = scanner.nextLine().toLowerCase();
        if(!typeOfPersonValidation(typeOfPerson)) { return; }
        personInit(scanner, typeOfPerson);
    }

    public void read(Scanner scanner) {
        System.out.println("name:");
        String name = scanner.nextLine();
        databaseService.getStudentByName(name);
        databaseService.getProfessorByName(name);
    }

    public void delete(Scanner scanner) {
        System.out.println("name:");
        String name = scanner.nextLine();
        System.out.println("typeOfPerson:");
        String typeOfPerson = scanner.nextLine();
        if(!typeOfPersonValidation(typeOfPerson)) { return; }
        databaseService.removePerson(typeOfPerson, name);
    }

    public void update(Scanner scanner) {
        System.out.println("typeOfPerson:");
        String typeOfPerson = scanner.nextLine();
        if(!typeOfPersonValidation(typeOfPerson)) { return; }
        System.out.println("name:");
        String name = scanner.nextLine();
        Person person = databaseService.getPerson(typeOfPerson, name);
        if (person == null) { return;}

        Person personGeneralInfo = setGeneralInfo(name, scanner);
        person.setName(name);
        person.setPhoneNumber(personGeneralInfo.getPhoneNumber());
        person.setEmailAddress(personGeneralInfo.getEmailAddress());
        if(typeOfPerson.equals(PROFESSOR)){
            professorInit(scanner, (Professor) person);
        }else{
            studentInit(scanner, (Student) person);
        }
    }

    public boolean typeOfPersonValidation(String typeOfPerson) {

        if(! typeOfPerson.equals(PROFESSOR) && !typeOfPerson.equals(STUDENT)){
            System.out.println("Wrong type");
            return false;
        }
        return true;
    }

    private void personInit(Scanner scanner, String typeOfPerson) {
        System.out.println("name:");
        String name = scanner.nextLine();

        if (typeOfPerson.equals(PROFESSOR) && databaseService.getProfessorByName(name) != null) {return;}
        if (typeOfPerson.equals(STUDENT) && databaseService.getStudentByName(name) != null) {return;}

        Person person = setGeneralInfo(name, scanner);
        if(typeOfPerson.equals(PROFESSOR)){
            Professor professor = new Professor(person);
            professorInit(scanner, professor);
            person = professor;
        } else {
            Student student = new Student(person);
            studentInit(scanner, student);
            person = student;
        }

        databaseService.addPerson(person);
        System.out.println("Created " + person);
    }

    private Person setGeneralInfo(String name, Scanner scanner) {
        System.out.println("phone number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("email:");
        String email = scanner.nextLine();
        return new Person(name, phoneNumber, email);
    }

    private void studentInit(Scanner scanner, Student student) {
        System.out.println("student number:");
        int studentNumber = scanner.nextInt();
        System.out.println("averageMark:");
        float averageMark = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("clasa:");
        String clasa = scanner.nextLine();

        student.setStudentNumber(studentNumber);
        student.setAverageMark(averageMark);
        student.setClasa(clasa);
    }

    private void professorInit(Scanner scanner, Professor professor) {
        System.out.println("course:");
        String course = scanner.nextLine();
        System.out.println("year:");
        int year = scanner.nextInt();
        scanner.nextLine(); // asta va citi \n care nu este preluat de nextInt.
        // Daca nu e folosit, \n ramane in scanner si produce reluarea comenzii
        professor.setCourse(course);
        professor.setYear(year);
    }
}