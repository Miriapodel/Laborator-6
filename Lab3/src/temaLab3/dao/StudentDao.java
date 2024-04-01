package temaLab3.dao;

import temaLab3.model.Person;
import temaLab3.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {


    //se face static pentru a apartine clasei; odata initializat
    // nu se initializeaza iar in cazul utilizarii in mai multe clase
    private static List<Student> students = new ArrayList<>();

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
