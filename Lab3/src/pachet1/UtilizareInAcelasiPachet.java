package pachet1;

import pachet2.Child;

public class UtilizareInAcelasiPachet {
    public static void main(String[] args) {
        Parinte parinte = new Parinte();
        //metoda nu are modificator de acces, deci e default. Este accesibila in acelasi pachet
        System.out.println("Suma = " + parinte.addValues(1, 2));

        Child childClass = new Child("4", 5, 6);
        childClass.multiplyValues(5, 6);
        //childClass.addValues(1, 2); // compilation err; nu este vizibil

    }
}
