package util;

import calcul.CalculChirie;

public class MagazinAlimentar implements CalculChirie {
    public double calculeazaChirie(double suprafata) {
        return suprafata * 2;
    }
}
