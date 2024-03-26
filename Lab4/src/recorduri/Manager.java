package recorduri;

/*
introdus din java 15

un Record este o clasa finala
nu poate fi extinsa
nicio inregistrare nu poate fi abstracta
poate implementa una sau mai multe interfete
Este utilizata pt stocarea si transportarea datelor

au by default  implementate toString, hashCode, equals
se genereaza automat getere settere pt variablilele nestatice

variabilele statice nu mai au generate automata de get, nu mai sunt finale
si nici nu sunt adaugate automat in toString
 */

import interfete.Interfata1;
import interfete.Interfata2;

public record Manager(String nume, String departament, int vechime) implements Interfata2, Interfata1 {

    private static String institutie = "Facultate";

    //constructorul canonic, adica cel cu toi parametrii se poate scrie daca dorim prelucrari speciale in el

    //constructorul se poate redefini cu mai putini parametri dar el va utiliza constructorul canonic
    public Manager(String nume, String departament) {
        this(nume, departament, 0);
    }

    public Manager{
        if(vechime <2){
           vechime = vechime + f;
        }
    }

    /*
    implementari ale metodelor din interfete
     */
    @Override
    public int programLucru() {
        return 0;
    }

    @Override
    public double calculSalariu(int spor) {
        return 0;
    }

    @Override
    public double calculVechime(int ani) {
        return Interfata1.super.calculVechime(ani);
    }

    //get set tr create manual; nu sunt denerate automat
    public static String getInstitutie() {
        return institutie;
    }

    public static void setInstitutie(String institutie) {
        Manager.institutie = institutie; //se face referire in context static cu Manager. ...
    }

/*    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", departament='" + departament + '\'' +
                ", vechime=" + vechime +
                ", institutie=" + institutie +
                '}';
    }*/
}
