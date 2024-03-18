package interfete;

public class Sofer implements Angajat, Program{
    @Override
    public double calculSalariu(int spor) {
        return spor;
    }

    @Override
    public double calculVechime(int ani) {
        return Angajat.super.calculVechime(ani);
    }

    @Override
    public int programLucru() {
        return 0;
    }
}
