package interfete.impl;

import interfete.Interfata1;
import interfete.Interfata2;

public class Sofer implements Interfata1, Interfata2 {
    @Override
    public double calculSalariu(int spor) {
        return spor;
    }

    @Override
    public double calculVechime(int ani) {
        return ani *4;
    }

    @Override
    public int programLucru() {
        System.out.println("5 ore");
        return 5;
    }
}
