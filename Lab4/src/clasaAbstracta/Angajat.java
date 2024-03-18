package clasaAbstracta;

/*
clasa este marcata abstract
clasa abstracta are cel putin o metoda abstracta, neimplementata
 */
public abstract class Angajat {
    private double salariu;

    //este by default public; nu trebuie scris public
    abstract int calculSalariu(int spor);
}
