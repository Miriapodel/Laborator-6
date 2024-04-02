import java.util.Comparator;

public class PersoanaComparatorNume implements Comparator<Persoana> {
    @Override
    public int compare(Persoana persoana1, Persoana persoana2){
        return persoana1.getNume().compareTo(persoana2.getNume());
    }
}
