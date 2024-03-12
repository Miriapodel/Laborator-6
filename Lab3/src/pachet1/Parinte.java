package pachet1;


/*
 o clasa poate fi
 publica : in acest caz da si numele fisierului
 abstract : daca are cel putin o metoda abstracta
 finala: nu mai poate fi extinsa

 Accesul la variabilele clasei se face doar prin intermediul metodelor.
 Variabilele clasei vor fi intotdeauna private

Modifier    | Class | Package | Subclass | World
public      |  Y    |    Y    |    Y     |   Y
protected   |  Y    |    Y    |    Y     |   N
no modifier |  Y    |    Y    |    N     |   N
(default)
private     |  Y    |    N    |    N     |   N
 */
public class Parinte {
    //date membre de instanta. Sunt non statice si se initializeaza prin constructori
    private String a;

    private int b;

    //membre ale clasei
    private static int c;


    //Date statice. Au cuvantul static
    //se aloca o singura data si sunt partajate de toate clasele
    //datele statice nu se aloca prin constructor
    private static String nume = "test";
    private String street;

    private static int nr;
    //constante
    private static final String OS_WINDOWS = "WINDOWS"; //final -> nu mai poate fi schimbata

    //bloc de initializare
    //se va incarca inainte de fiecare initializare a constructorului
    {
        this.nr++;
        street = "Magheru";
    }

    //bloc static de initializare
    static {
        //OS_WINDOWS = "MAC"; //da err de compilare pt ca variabila este final

        nume = "pao242";
     //   street = "Magheru"; //err de compilare; Non-static field 'street' cannot be referenced from a static context
    }

    public static String getNume(){
        return nume;
    }

    //constructor public; constructor default
    public Parinte(){
    }

    public Parinte(String a, int b){
        this.a = a;
        this.b = b;
    }


    /*accesul la variabile se face prin intermediul metodelor
     metodele pot fi:
     public: acces de oriunde
     protected: acces la nivel de pachet plus mostenire
     default:  daca nu se scrie niciun modificator de acces. Accesul va fi la nivel de pachet
     private: acces doar din clasa care are metoda
     */
    public String getOsWindows(){
        return OS_WINDOWS;
    }

    public void setC(int c){
        this.c = c;
    }

    int addValues(int b, int c){
        return b + c;
    }

    protected int multiplyValues(int b, int c){
        return b + c;
    }

    public int getB(){
        return b;
    }

    public String getA(){
        return a;
    }

    public static int getC() {
        return c;
    }

    @Override
    public String toString() {
        return "Parinte{" +
                "a = " + a +
                ", b = " + b +
                ", c = " + c +
                ", nume = " + nume +
                ", street = " + street +
                ", nr = " + nr +
                '}';
    }
}
