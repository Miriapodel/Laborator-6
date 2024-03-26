package temaLab3.service;

import temaLab3.model.Person;
import temaLab3.repository.ProfessorRepository;
import temaLab3.repository.StudentRepository;
import temaLab3.model.Professor;
import temaLab3.model.Student;

import static temaLab3.utils.Constants.PROFESSOR;

public class DatabaseService {

    private ProfessorRepository professorRepository;
    private StudentRepository studentRepository;

    public DatabaseService() {
        this.professorRepository = new ProfessorRepository();
        this.studentRepository = new StudentRepository();
    }

    public Student getStudentByName(String name){
        Student student = studentRepository.read(name);
        if(student != null){
            System.out.println(student);
        }else {
            System.out.println("No student having this name");
        }

        return student;
    }

    public Professor getProfessorByName(String name){
        Professor professor = professorRepository.read(name);
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
                case Professor professor -> professorRepository.delete(professor);
                case Student student -> studentRepository.delete(student);
                default -> throw new IllegalStateException("Unexpected value: " + person);
        }

        System.out.println("Removed " + person);
    }

    public void addPerson(Person person) {
        if(person != null){
            switch (person){
                case Professor professor-> professorRepository.create(professor);
                case Student student -> studentRepository.create(student);
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
