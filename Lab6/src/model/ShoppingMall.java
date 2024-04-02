package model;

import java.util.ArrayList;

public class ShoppingMall {
    private static final ArrayList<Magazin> magazine = new ArrayList<>();

    public void adaugaMagazin(Magazin magazin) {
        magazine.add(magazin);
    }

    public ArrayList<Magazin> getMagazine() {
        return magazine;
    }

    public  ArrayList<Magazin> getMagazineByProprietar(Proprietar proprietar){
        ArrayList<Magazin> magazineByProprietar = new ArrayList<>();
        for (Magazin magazin : magazine) {
            if (magazin.getProprietar().equals(proprietar)) {
                magazineByProprietar.add(magazin);
            }
        }
        return magazineByProprietar;
    }

}
