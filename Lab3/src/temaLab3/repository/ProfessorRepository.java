package temaLab3.repository;

import temaLab3.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository {

    private List<Professor> professors;

    public ProfessorRepository() {
        this.professors = new ArrayList<>();
    }

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
