package interfete.impl;

import interfete.Interfata1;
import interfete.Interfata2;

public class Portar implements Interfata1, Interfata2 {
    @Override
    public double calculSalariu(int spor) {
        return spor *3;
    }

    @Override
    public double calculVechime(int ani) {
        return Interfata1.super.calculVechime(ani);
    }

    @Override
    public int programLucru() {
        System.out.println("8 ore");
        return 0;
    }
}
