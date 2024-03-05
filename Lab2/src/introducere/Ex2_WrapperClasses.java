package introducere;


/**
 * Clasele Wrapper sunt folosite pentru a folosi primitivele pe post de obiecte, atunci cand este necesar
 *
 * Primitive Data Type  |  Wrapper Class  | default value
 * - byte                   Byte          | 0
 * - short                  Short         | 0
 * - int                    Integer       | 0
 * - long                   Long          | 0
 * - float                  Float         | 0.0
 * - double                 Double        | 0.0
 * - boolean                Boolean       | false
 * - char                   Character     | '\u0000'

 */
public class Ex2_WrapperClasses {
    // variabilele globale apartin clasei. Acestea au valori default, in cazul in care nu le initializam
    static byte globalByte;
    static short globalShort;
    static int globalInt;
    static long globalLong;
    static float globalFloat;
    static double globalDouble;
    static boolean globalBoolean;
    static char globalChar;
    static String globalString;

    public static void main(String[] args) {
        byte b1 = 3;
        Byte b2 = b1;
        byte b3 = b2;
        System.out.println("byte format = " + b1 + " Byte format = " + b2 + " byte format = " + b3);

        int i1 = 5;
        Integer i2 = i1;
        int i3 = i2;
        System.out.println("int format = " + i1 + " Integer format = " + i2 + " int format = " + i3);

        long l1 = 2L; // se pune L sau l
        Long l2 = l1;
        long l3 = l2;
        System.out.println("long format = " + l1 + " Long format = " + l2 + " long format = " + l3);

        float f1 = 2.3f; //se pune f sau F
        Float f2 = f1;
        float f3 = f2;
        System.out.println("float format = " + f1 + " Float format = " + f2 + " float format = " + f3);

        double d1 = 2;
        Double d2 = d1;
        double d3 = d2;
        System.out.println("double format = " + d1 + " Double format = " + d2 + " double format = " + d3);

        boolean bool1 = false;
        Boolean bool2 = bool1;
        boolean bool3 = bool2;
        System.out.println("boolean format = " + bool1 + " Boolean format = " + bool2 + " boolean format = " + bool3);

        char c1 = '\u0041';
        Character c2 = c1;
        char c3 = c2;
        System.out.println("char format = " + c1 + " Character format = " + c2 + " char format = " + c3);

        char c4 = 'a';
        System.out.println("c4 = " + c4);

        System.out.println("globalByte = " + globalByte);
        System.out.println("globalShort = " + globalShort);
        System.out.println("globalInt = " + globalInt);
        System.out.println("globalLong = " + globalLong);
        System.out.println("globalFloat = " + globalFloat);
        System.out.println("globalDouble = " + globalDouble);
        System.out.println("globalBoolean = " + globalBoolean);
        System.out.println("globalChar = " + globalChar);
        System.out.println("globalString = " + globalString);
    }


}
