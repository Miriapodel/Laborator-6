package introducere;

/*
  Pentru a lucra cu date avem nevoie de zone de memorie, iar pentru a lucra cu zone dememorie în limbajul Java trebuie
  sa ne gandim la tipul de date stocat: numere, valori de adevărat sau fals, caractere sau obiecte.
  Numerele, valorile de adevărat sau fals și caracterele sunt numite tipuri primitive.
  =>byte, short, int, long, float, double, char, boolean
  Sirul de caractere (String) nu este tip primitiv!
  Primitivele sunt tipuri de date din java care nu sunt obiecte! (obiect = instanta a unei clase)

  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

   Primitivele au valori default
   Data Type | Default Value (for fields)
         byte |	0                        ->  byte are valori [-128;127] , size este 1 byte
                                             valorile sunt afisate cu Byte.MIN_VALUE, Byte.MAX_VALUE
         short | 0                       -> short are valori [-32 768; 32 767] adica [-2^15;2^15-1], size 2 bytes
                                            valorile sunt afisate cu Short.MIN_VALUE, Short.MAX_VALUE
           int | 0                       -> int are valori [-2^31;2^31-1] , size 4 bytes
                                            valorile sunt afisate cu Integer.MIN_VALUE, Integer.MAX_VALUE
          long | 0                      -> long are valori [-2^63;2^63-1], size 8 bytes;
                                               valorile sunt afisate cu Long.MIN_VALUE, Long.MAX_VALUE
         float | 0.0                    -> size 4 bytes
                                            valorile sunt afisate cu Float.MIN_VALUE, Float.MAX_VALUE
         double | 0.0                      -> size 8 bytes
                                           valorile sunt afisate cu Double.MIN_VALUE, Double.MAX_VALUE
          char | '\u0000'                -> stocheaza un singur caracter in format ASCII
                                            valorile sunt afisate cu Character.MIN_VALUE, Character.MAX_VALUE
          boolean | false                -> are valori true sau false, size 1 byte
 String (or any object) |	null

Daca atunci cand sunt declarate nu sunt initializate, vor primi valorile default

Intervalul de valori ale primitivelor:
https://programming.guide/java/primitive-ranges.html

Caractere: https://www.sciencebuddies.org/science-fair-projects/references/ascii-table
 se iau valorile din table, coloana hex.
 Exemplu:
     litera a este '\u0061'
     A este '\u0041'

     pentru caractere se pot da si explicit
     'a' 'B'
 */
public class Ex1_Primitive {

    public static void main(String[] args) {

        System.out.println("Interval byte [" + Byte.MIN_VALUE + ";" + Byte.MAX_VALUE + "]");
        System.out.println("Interval short [" + Short.MIN_VALUE + ";" + Short.MAX_VALUE + "]");
        System.out.println("Interval int [" + Integer.MIN_VALUE + ";" + Integer.MAX_VALUE + "]");
        System.out.println("Interval long [" + Long.MIN_VALUE + ";" + Long.MAX_VALUE + "]");
        System.out.println("Interval float [" + Float.MIN_VALUE + ";" + Float.MAX_VALUE + "]");
        System.out.println("Interval double [" + Double.MIN_VALUE + ";" + Double.MAX_VALUE + "]");
        // tip identificator
        // byte, short, int, long, float, double, char, boolean
        // String --- nu este primitiv

        byte q1; // declarare zona memorie
        // 8-bit signed integer. Can hold values from -128 to 127
        q1 = 10; // pentru a da o valoare zonei de memorie se foloseste operatorul "="

        short s1 = 10;  //16-bit signed integer. Can hold values from -32,768 to 32,767
        int i = 10;     //32-bit signed integer. Can hold values from -2,147,483,648 to 2,147,483,647
        long a = 10;    //64-bit integer. Can hold really big numbers (-2^63 to 2^63–1)

        // Octal declaration starts with 0 and possible chars are [0-7]
        int i2 = 054; // baza 8
        // HexaDecimal declaration starts with 0X or 0x and possible chars are [0-9A-Fa-f]
        int i3 = 0XFF; // baza 16
        int i4 = 0xFF; // baza 16
        // Binary representation starts with 0B or 0b and possible chars are [0-1]
        int i5 = 0b10110;

        long b = 9999999999999L; // L = literal

        double d1 = 10.5;   //64 bit

        float f1 = 10.5F; // diferenta dintre double si float este de precizie (nr zecimale dupa virgula); 32 bit
        float f2 = (float) 10.5; // In Java orice valoare cu virgula este considerata de tip double => folosim un literal (f,F) sau operatorul de conversie

        int f3 = (int) 10.5;

        boolean k1 = false;     //1 bit
        boolean k2 = true;
        // true, false = cuvinte cheie (keywords)

        char w1 = 'a'; // caracterele in Java se pun intre ghilimele simple ''; 16-bit Unicode character.
        char w2 = '\n'; // new line
        char w3 = '\u1011';
        System.out.print("w3 = " + w3); //print tipareste pe aceiasi linie; println scrie pe linie noua
        System.out.print(w2);
        System.out.print("w3 = " + w3); //va tipari pe linie noua deoarece w2 semnifica new line
        int r1, r2, r3; // se pot declara mai multe zone de memorie cu virgula intre ele
        int r4, r5 = 10, r6;


    }
}
