import model.Proprietar;
import model.ShoppingMall;

import java.util.*;

import model.Magazin;
import util.MagazinAlimentar;
import util.MagazinChimicale;
import util.MagazinHaine;

public class Main {
    public static void main(String[] args) {
//        List<Persoana> persoanaList = new ArrayList<>();
//        Persoana persoana1 = new Persoana("Ioan", "Popa", 24);
//        Persoana persoana2 = new Persoana("Mirela", "Ionescu", 30);
//        Persoana persoana3 = new Persoana("Adrian", "Popa", 10);
//        Persoana persoana4 = new Persoana("Mircea", "Popa", 12);
//        Persoana persoana5 = new Persoana("Mircea", "Popa", 11);
//        persoanaList.add(persoana1);
//        persoanaList.add(persoana2);
//        persoanaList.add(persoana3);
//        persoanaList.add(persoana4);
//        persoanaList.add(persoana5);
//        System.out.println("Nesortat qList = " + persoanaList);
//
//        //sortare prin intermediul utilitarului Collections
//        // acest utilitar are metoda sort care poate primi si parametru in care se defineste Comparatorul dorit
//        Collections.sort(persoanaList, new PersoanaComparatorNume());
//        System.out.println("PersoanaComparatorNume -> Sortat qList = " + persoanaList);
//
//        Collections.sort(persoanaList, new PersoanaComparatorVarsta());
//        System.out.println("PersoanaComparatorVarsta -> Sortat qList = " + persoanaList);
//
//        Collections.sort(persoanaList, new PersoanaComparatorMultiple());
//        System.out.println("PersoanaComparatorMultiple [Nume, Prenume, Varsta] -> Sortat qList = " + persoanaList);
//
//        //adaugat din java 8
//        Collections.sort(persoanaList,
//                Comparator.comparing(Persoana::getNume)
//                .thenComparing(Persoana::getPrenume)
//                .thenComparing(Persoana::getVarsta));
//        System.out.println("incepand cu java8 comparator -> Sortat qList = " + persoanaList);

       // System.out.println("test".equals(null));
      //  System.out.println(persoanaList.get(0).getNume().compareTo(null)); //arunca null pointer exception

        Proprietar proprietar = new Proprietar("Popescu", "Ion", 30);
        Proprietar proprietar1 = new Proprietar("Marinescu", "Mihai", 40);
        ShoppingMall shoppingMall = new ShoppingMall();

        Magazin magazin = new Magazin(1, 1000, 100, "Magazin1", proprietar);
        magazin.setChirie(new MagazinAlimentar());

        Magazin magazin1 = new Magazin(2, 2000, 200, "Magazin2", proprietar1);
        magazin1.setChirie(new MagazinHaine());

        Magazin magazin2 = new Magazin(3, 3000, 300, "Magazin3", proprietar);
        magazin2.setChirie(new MagazinChimicale());

        shoppingMall.adaugaMagazin(magazin1);
        shoppingMall.adaugaMagazin(magazin2);
        shoppingMall.adaugaMagazin(magazin);


        shoppingMall.getMagazine().sort(Comparator.comparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume))
                .thenComparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getPrenume))
                .thenComparing(Magazin::getChirie));

        System.out.println("Magazinele sortate: ");

        System.out.println(shoppingMall.getMagazine());

        System.out.println();
        System.out.println();

        System.out.println("Informatii despre primul proprietar: ");

        ArrayList<Magazin> magazineProprietar = shoppingMall.getMagazineByProprietar(proprietar);

        System.out.println("Magazinele proprietarului sortate: ");

        magazineProprietar.sort(Comparator.comparing(Magazin::getNumeMagazin).thenComparing(Magazin::getVenit).thenComparing(Magazin::getChirie).thenComparing(Magazin::getSuprafata));

        System.out.println(magazineProprietar);

        double chirieTotala = 0;
        double venitTotal = 0;

        for(Magazin magazinProp : magazineProprietar){
            chirieTotala += magazinProp.getChirie();
            venitTotal += magazinProp.getVenit();
        }

        System.out.println("Chirie totala: " + chirieTotala);
        System.out.println("Venit total: " + venitTotal);


    }
}