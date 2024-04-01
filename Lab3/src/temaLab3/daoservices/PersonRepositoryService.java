package temaLab3.daoservices;

import temaLab3.model.Person;
import temaLab3.dao.ProfessorDao;
import temaLab3.dao.StudentDao;
import temaLab3.model.Professor;
import temaLab3.model.Student;

import static temaLab3.utils.Constants.PROFESSOR;

public class PersonRepositoryService {

    private ProfessorDao professorDao;
    private StudentDao studentDao;

    public PersonRepositoryService() {
        this.professorDao = new ProfessorDao();
        this.studentDao = new StudentDao();
    }

    public Student getStudentByName(String name){
        Student student = studentDao.read(name);
        if(student != null){
            System.out.println(student);
        }else {
            System.out.println("No student having this name");
        }

        return student;
    }

    public Professor getProfessorByName(String name){
        Professor professor = professorDao.read(name);
        if(professor != null){
            System.out.println(professor);
        }else {
            System.out.println("No professor having this name");
        }
        return professor;
    }

    public void removePerson(String typeOfPerson, String name) {
        Person person = getPerson(typeOfPerson, name);
        if (person == null) return;

        switch (person){
                case Professor professor -> professorDao.delete(professor);
                case Student student -> studentDao.delete(student);
                default -> throw new IllegalStateException("Unexpected value: " + person);
        }

        System.out.println("Removed " + person);
    }

    public void addPerson(Person person) {
        if(person != null){
            switch (person){
                case Professor professor-> professorDao.create(professor);
                case Student student -> studentDao.create(student);
                default -> throw new IllegalStateException("Unexpected value: " + person);
            }
        }
    }

    public Person getPerson(String typeOfPerson, String name) {
        Person person;
        if(typeOfPerson.equals(PROFESSOR)){
            person = getProfessorByName(name);
        }else{
            person = getStudentByName(name);
        }
        if(person == null) {
            System.out.println("No person having name " + name);
            return null;
        }
        return person;
    }
}
