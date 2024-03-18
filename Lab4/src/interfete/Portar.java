package interfete;

public class Portar implements Angajat, Program{
    @Override
    public double calculSalariu(int spor) {
        return spor *3;
    }

    @Override
    public double calculVechime(int ani) {
        return Angajat.super.calculVechime(ani);
    }

    @Override
    public int programLucru() {
        System.out.println("8 ore");
        return 0;
    }
}
