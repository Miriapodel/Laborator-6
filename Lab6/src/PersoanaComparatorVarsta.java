import java.util.Comparator;

public class PersoanaComparatorVarsta implements Comparator<Persoana> {
    @Override
    public int compare(Persoana persoana1, Persoana persoana2){
        return persoana1.getVarsta() - persoana2. getVarsta();
    }
}
