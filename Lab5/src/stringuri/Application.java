package stringuri;
public class Application {

    public static void main(String[] args) {

        //sirul este format doar din o litera tys
        System.out.println("t".matches("[tys]"));

        //sirul este format din orice caracter mai putin literele efj
        System.out.println("a".matches("[^efj]"));

        //sirul este format din o singura litera mica
        System.out.println("r".matches("[a-z]"));

        //sirul este format din o singura litera mica sau mare
        System.out.println("O".matches("[a-zA-Z]"));

        //sirul este format din o litera mica urmata de o litera mare
        System.out.println("bS".matches("[a-z][A-Z]"));

        //sirul este format din orice combinatie a literelor anca si lungimea este de cel putin 1
        System.out.println("ana".matches("[an]+"));

        //sirul este format din orice combinatie a literelor abc si lungimea poate fi chiar si 0
        System.out.println("AlAl".matches("[Al]*"));

        //sirul este format de oricare dintre combinatiile literelor abc iar lungimea sa este exact 5
        System.out.println("abcab".matches("[abc]{5}"));

        //sirul este format de oricare dintre combinatiile literelor abc iar lungimea sa este cel putin 5
        System.out.println("abcabc".matches("[abc]{5,}"));

        //sirul este format din orice combinatie a literelor abc si lungimea sa trebuie sa fie cel putin 5, maxim 10
        System.out.println("abcacbabccc".matches("[abc]{5,11}"));

        String text = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";

        System.out.println(text.length());

        System.out.println((text.replaceAll("[ .]", "")).matches("[A-Za-z]+"));
        StringBuilder stringBuilder = new StringBuilder(text);
        System.out.println(stringBuilder.reverse());

    }
}
