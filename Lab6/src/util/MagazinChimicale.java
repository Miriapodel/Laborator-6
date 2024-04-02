package util;

import calcul.CalculChirie;

public class MagazinChimicale implements CalculChirie {
    public double calculeazaChirie(double suprafata) {
        return suprafata * 4;
    }
}
