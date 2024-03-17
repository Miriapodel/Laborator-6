package service;

import model.Person;
import model.Professor;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorageService {

    private final String STUDENT = "student";
    private final String PROFESSOR = "profesor";

    private List<Student> students;
    private List<Professor> professors;

    public StorageService(){
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
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
        Person person = validationStudentName(name);
        if(person != null){
            System.out.println(person);
        }
        person = validationProfessorName(name);
        if(person != null){
            System.out.println(person);
            return;
        }
        System.out.println("No person having name " + name);
    }

    public void delete(Scanner scanner) {
        System.out.println("name:");
        String name = scanner.nextLine();
        System.out.println("typeOfPerson:");
        String typeOfPerson = scanner.nextLine();
        if(!typeOfPersonValidation(typeOfPerson)) { return; }

        Person person;
        if(typeOfPerson.equals(PROFESSOR)){
            person = validationProfessorName(name);
            if(person != null){
                professors.remove(person);
            }
        }else {
            person = validationStudentName(name);
            if (person != null) {
                students.remove(person);
            }
        }
        if (person == null) {
            System.out.println("No person having name " + name);
            return;
        }
        System.out.println("Removed " + person);
    }

    public void update(Scanner scanner) {
        System.out.println("typeOfPerson:");
        String typeOfPerson = scanner.nextLine();
        if(!typeOfPersonValidation(typeOfPerson)) { return; }
        System.out.println("name:");
        String name = scanner.nextLine();

        Person person;
        if(typeOfPerson.equals(PROFESSOR)){
            person = validationProfessorName(name);
        }else{
            person = validationStudentName(name);
        }
        if(person == null) {
            System.out.println("No person having name " + name);
            return;
        }
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

        if (typeOfPerson.equals(PROFESSOR) && validationProfessorName(name) != null) {return;}
        if (typeOfPerson.equals(STUDENT) && validationStudentName(name) != null) {return;}

        Person person = setGeneralInfo(name, scanner);
        if(typeOfPerson.equals(PROFESSOR)){
            Professor professor = new Professor(person);
            professorInit(scanner, professor);
            professors.add(professor);
            System.out.println("Created " + professor);
        } else {
            Student student = new Student(person);
            studentInit(scanner, student);
            students.add(student);
            System.out.println("Created " + student);
        }
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
        student.setStudentNumber(studentNumber);

        System.out.println("averageMark:");
        float averageMark = scanner.nextFloat();
        student.setAverageMark(averageMark);
        scanner.nextLine();

        System.out.println("clasa:");
        String clasa = scanner.nextLine();
        student.setClasa(clasa);
    }

    private void professorInit(Scanner scanner, Professor professor) {
        System.out.println("course:");
        String course = scanner.nextLine();
        professor.setCourse(course);

        System.out.println("year:");
        int year = scanner.nextInt();
        professor.setYear(year);
        scanner.nextLine(); // asta va citi \n care nu este preluat de nextInt.
        // Daca nu e folosit, \n ramane in scanner si produce reluarea comenzii
    }

    private Student validationStudentName(String name) {
        if(!students.isEmpty()){
            for(Student s : students){
                if(s.getName().equals(name)){
                    return s;
                }
            }
        }
        return null;
    }

    private Professor validationProfessorName(String name) {
        if(!professors.isEmpty()){
            for(Professor p : professors){
                if(p.getName().equals(name)){
                    return p;
                }
            }
        }
        return null;
    }
}