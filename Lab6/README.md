Interfete / Curs 5

keyword : interface

definite pentru CAN_DO

public interface MyInterface{

   constante //public static final ; sunt constante by default deci trebuie initializate in interfata
  
   metode implicitte (default) cu implementare
  
   metode statice cu implementare
  
   metode private cu implementare //folosite in cazul in 
                       //care metodele anterioare au mneoie de prelucrari suplimantare

}

-  interfetele pot extinde alte interfete (keyword extends)
-  o clasa poate implementa mai multe interfete (keyword implements) enumerate cu virgula intre ele
-  o interfata nu poate fi instantiata.


class A implements I1, I2, I3{
}

nu se poate instantia : I1 vari = new I1();

Instantiere clasa A:
- direct prin instantiere clasa
    A inst1 = new A();
- prin utilizarea interfetei:
    I1 inst2 = new A(); -> are acces doar la metodele puse la dispozitie de interfata I1

O clasa care implementeaza mai multe interfete:
- trebuie sa implementeze toate metodele cu semnaturi diferite
- daca metoda implementata are aceiasi semnatura si tip pt valoarea returnata se implementeaza o singura data
- daca metoda implementata are aceiasi semnatura si alt tip pt valoarea returnata => eroare de compilare

La utilizarea interfetelor exista mecanismul de callback=> in clasa curenta exista metoda care are ca parametri o interfata

Daca o interfata nu are implementare, se va face definire prin clasa anonima (exemplu curs 8, pag 9)


Interfete utilitare
1) Comparable -> contine metoda compareTo care primeste 1 obiect de comparat

   Aceasta interfata va fi implementata de clasa pe care dorim sa facem compararile

class Persoana implements Comparable<Persoana>{

   private String nume;

   private String prenume;

   private int varsta;

   //alfabetic

   public int compareTo(Persoana obiectDeComparat){

       return this.nume.compareTo(obiectDeComparat.nume);

   }

}

2) Comparator -> contine metoda compare care primeste cele 2 obiecte de comparat

   Aceasta interfata va fi implementata pe o clasa utilitara (nu este clasa care defineste obiectul de comparat)

  class PersoanaComparatorVarsta implements Comparator<Persoana>{
   
      public int compare(Persoana persoana1, Persoana persoana2){

           return persoana1.getVarsta() + persoana2. getVarsta(); 

      }     
}

class PersoanaComparatorNume implements Comparator<Persoana>{

      public int compare(Persoana persoana1, Persoana persoana2){

           return persoana1.nume.compareTo(persoana2.nume);

      }     
}

