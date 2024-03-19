package polimorfism.extensie;

import polimorfism.Animal;

public class Pasare extends Animal {

    public Pasare(){}

    public Pasare(String name) {
        super(name, 2);
    }

    /*
        OVERRIDE sau suprascriere
        numele metodei este identic cu al unei metode existente in parinte
        modificatorul de acces este cel putin la nivelul parintelui
         */
    public void eats() {
        System.out.println("Pasarea mananca graunte");
    }
    //modificatorul de acces este mai puternic decat la Animal
    //nu se poate face mai slab, de exemplu private
    public void habitat(){
        System.out.println("Pasarea sta in copac");
    }

    public void cover(){
        System.out.println("Pasarea are pene");
    }

    /*OVERLOAD sau supraincarcare
     numele metodei este ca al uneia existenta in parinte
     difera parametrii
     */
    public void eats(String tipGraunte){
        System.out.println("Pasarea mananca " + tipGraunte);
    }

    //public String eats(String tipGraunte) nu se putea sa
    // aiba nume si parametri identici cu cea de mai sus
    //da erroare
    /*
    public String eats(String tipGraunte){
        System.out.println("Pasarea mananca " + tipGraunte);
        return tipGraunte;
    }*/

    public static void getLegs(){
        System.out.println("Pasarea are 2 picioare");
    }
}
