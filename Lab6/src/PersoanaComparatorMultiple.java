import java.util.Comparator;

public class PersoanaComparatorMultiple implements Comparator<Persoana> {
    @Override
    public int compare(Persoana persoana1, Persoana persoana2) {
        int comparareNume = persoana1.getNume().compareTo(persoana2.getNume());
        int compararePrenume = persoana1.getPrenume().compareTo(persoana2.getPrenume());
        int comparareVarsta = persoana1.getVarsta() - persoana2.getVarsta();
        return (comparareNume == 0)?
                (compararePrenume == 0) ? comparareVarsta: compararePrenume
                : comparareNume;
    }
}
