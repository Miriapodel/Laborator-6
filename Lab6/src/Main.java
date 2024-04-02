import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persoana> persoanaList = new ArrayList<>();
        Persoana persoana1 = new Persoana("Ioan", "Popa", 24);
        Persoana persoana2 = new Persoana("Mirela", "Ionescu", 30);
        Persoana persoana3 = new Persoana("Adrian", "Popa", 10);
        Persoana persoana4 = new Persoana("Mircea", "Popa", 12);
        Persoana persoana5 = new Persoana("Mircea", "Popa", 11);
        persoanaList.add(persoana1);
        persoanaList.add(persoana2);
        persoanaList.add(persoana3);
        persoanaList.add(persoana4);
        persoanaList.add(persoana5);
        System.out.println("Nesortat qList = " + persoanaList);

        //sortare prin intermediul utilitarului Collections
        // acest utilitar are metoda sort care poate primi si parametru in care se defineste Comparatorul dorit
        Collections.sort(persoanaList, new PersoanaComparatorNume());
        System.out.println("PersoanaComparatorNume -> Sortat qList = " + persoanaList);

        Collections.sort(persoanaList, new PersoanaComparatorVarsta());
        System.out.println("PersoanaComparatorVarsta -> Sortat qList = " + persoanaList);

        Collections.sort(persoanaList, new PersoanaComparatorMultiple());
        System.out.println("PersoanaComparatorMultiple [Nume, Prenume, Varsta] -> Sortat qList = " + persoanaList);

        //adaugat din java 8
        Collections.sort(persoanaList,
                Comparator.comparing(Persoana::getNume)
                .thenComparing(Persoana::getPrenume)
                .thenComparing(Persoana::getVarsta));
        System.out.println("incepand cu java8 comparator -> Sortat qList = " + persoanaList);

       // System.out.println("test".equals(null));
      //  System.out.println(persoanaList.get(0).getNume().compareTo(null)); //arunca null pointer exception
    }
}