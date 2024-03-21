package repository;

import model.Person;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public void create(Student student) {
        students.add(student);
    }

    public Student read(String name) {
        if(!students.isEmpty()){
            for(Student s : students){
                if(s.getName().equals(name)){
                    return s;
                }
            }
        }
        return null;
    }

    public void delete(Person person) {
        students.remove(person);
    }



}
