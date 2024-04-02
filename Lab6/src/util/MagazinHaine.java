package util;

import calcul.CalculChirie;

public class MagazinHaine implements CalculChirie {
    public double calculeazaChirie(double suprafata) {
        return suprafata * 3;
    }
}
