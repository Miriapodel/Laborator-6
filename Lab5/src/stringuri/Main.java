package stringuri;

public class Main {
    public static void main(String[] args) {

        String text1 = "sir";
        String text2 = "sir";
        String text3 = new String("sir");
        String text4 = new String("sir");

        System.out.println("Comparare string simplu cu string obiect " + (text1 == text3)); //false
        //folosind equals
        System.out.println("Comparare string simplu cu string obiect " + text1.equals(text3));//true

        System.out.println("Comparare string simplu cu string simplu " + (text1 == text2)); //true
        //folosind equals
        System.out.println("Comparare string simplu cu string simplu " + text1.equals(text2)); //true

        System.out.println("Comparare string obiect cu string obiect " + (text3 == text4)); //false
        //folosind equals
        System.out.println("Comparare string obiect cu string obiect " + text3.equals(text4)); //true

        text1.toUpperCase();
        System.out.println("text1 toUpperCase = " + text1);

        text1 = text1 + " adaos";
        System.out.println(text1);
        text1.concat("concatenare1");
        System.out.println(text1);
        text1 = text1.concat("concatenare");
        System.out.println(text1);

        String sir1 = "programare";
        sir1.toUpperCase(); // nu se actualizeaza sir1
        System.out.println(sir1);
        //ca se actualizeze valoarea trebuie atribuit
        sir1 = sir1.toUpperCase();
        System.out.println("sir1 = " + sir1);
    }
}