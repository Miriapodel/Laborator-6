package model;

import calcul.CalculChirie;

import java.util.Objects;

public class Magazin {
    int id;
    double venit;
    double suprafata;
    double chirie;
    String numeMagazin;
    Proprietar proprietar;

    public Magazin(int id, double venit, double suprafata,String numeMagazin, Proprietar proprietar) {
        this.id = id;
        this.venit = venit;
        this.suprafata = suprafata;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazin magazin = (Magazin) o;
        return id == magazin.id && Double.compare(venit, magazin.venit) == 0 && Double.compare(suprafata, magazin.suprafata) == 0 && Double.compare(chirie, magazin.chirie) == 0 && Objects.equals(numeMagazin, magazin.numeMagazin) && Objects.equals(proprietar, magazin.proprietar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, venit, suprafata, chirie, numeMagazin, proprietar);
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "id=" + id +
                ", venit=" + venit +
                ", suprafata=" + suprafata +
                ", chirie=" + chirie +
                ", numeMagazin='" + numeMagazin + '\'' +
                ", proprietar=" + proprietar +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVenit() {
        return venit;
    }

    public void setVenit(double venit) {
        this.venit = venit;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(double suprafata) {
        this.suprafata = suprafata;
    }

    public double getChirie() {
        return chirie;
    }

    public void setChirie(CalculChirie c) {
        this.chirie = c.calculeazaChirie(suprafata);
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public void setProprietar(Proprietar proprietar) {
        this.proprietar = proprietar;
    }
}
