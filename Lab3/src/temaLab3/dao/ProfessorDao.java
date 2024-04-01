package temaLab3.dao;

import temaLab3.model.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDao {

    //se face static pentru a apartine clasei; odata initializat
    // nu se initializeaza iar in cazul utilizarii in mai multe clase
    private static List<Professor> professors = new ArrayList<>();

    public Professor read(String name) {
        if(!professors.isEmpty()){
            for(Professor p : professors){
                if(p.getName().equals(name)){
                    return p;
                }
            }
        }
        return null;
    }

    public void delete(Professor professor) {
        professors.remove(professor);
    }

    public void create(Professor professor) {
        professors.add(professor);
    }

}
