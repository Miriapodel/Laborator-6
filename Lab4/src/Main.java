import interfete.impl.Portar;
import polimorfism.Animal;
import polimorfism.extensie.Papagal;
import polimorfism.extensie.Pasare;

public class Main {
    public static void main(String[] args) {

        utilizareStatice();

        //utilizarea mostenirii
        mostenire();

        //polimorfism
        polimorfism();

        //casting
        casting();

        uilizareSwitch();

        //equals
        utilizareEquals();

        interfete();
    }

    private static void uilizareSwitch() {
        Animal animal = new Animal("urs" , 4);
        Papagal papagal = new Papagal("coco","galben");
        Animal lebada = new Pasare("lebada");
        testSwitchBreakByDefault(animal);
        testSwitchBreakByDefault(papagal);
        testSwitchBreakByDefault(lebada);

    }

    private static void casting() {
        Animal lebada = new Pasare("lebada");
        Animal animal5 = new Papagal();

        Pasare p2 = (Pasare) lebada;//nu da err

        Animal animal6 =  new Animal();
        //Pasare pasare2 = (Pasare) animal6; //da err la compilare

    }

    private static void utilizareStatice() {
        //diverse apeluri ale constructorilor
        Animal animal1 = new Animal(); //constuctor default;
        // Variabilele clasei vor trebui setate prin set-eri
        Animal animal = new Animal("urs" , 4);

        //este metoda nestatica apelata in context static; se face prin instantierea clasei cu new ..
        animal.eats(); // -> "Animal eats meat"
        //animal.habitat(); //err de compilare;
        // nu e vizibil deoarece e protected si incerc sa il apelez din alt pachet
        animal.getLegs(); //se poate apela deoarece si metoda main si getLegs sunt ambele statice

        Papagal papagal = new Papagal("coco","galben");
        //metodele statice pot fi accesate in 2 moduri
        //1) folosind instanta la obiect
        papagal.getLegs();

        //2) folosind numele clasei
        Papagal.getLegs();

        papagal.cover();
    }

    private static void utilizareEquals() {
        Animal animal3 = new Animal("lup", 4);
        Animal animal4 = new Animal("lup", 4);
        System.out.println(animal4 == animal3 );//false deoarece sunt 2 obiecte diferite

        System.out.println(animal4.equals(animal3)); //va fi true deoarece va utiliza metoda equals definita in clasa Animal

    }

    private static void polimorfism() {
        System.out.println("Polimorfism: ");
        Animal animal3 = new Animal("lup", 4);
        Pasare pasare1 = new Pasare("egreta");
        Papagal papagal1 = new Papagal("coco", "verde");
        animal3.cover();
        pasare1.cover();
        papagal1.cover();

        pasare1.habitat();//vizibil deoarece modificatorul de acces este public
        // iar utilizarea se face direct dn clasa Pasare


    }

    private static void mostenire() {
        System.out.println("utilizarea mostenirii");
        Animal animal2 =  new Pasare();
        animal2.eats();
        animal2.getLegs(); // -> afiseaza Animal are 4 picioare deoarece metoda este statica
        // metodele statice nu se suprascriu, deci se va executa metoda din parinte
        //metoda statica getLegs din Pasare este disponibila doar cand instantierea nu este pin mostenire
        Pasare pasare = new Pasare();
        pasare.getLegs(); // -> afiseaza Pasarea are 2 picioare

        Animal papagal2 = new Papagal();
        papagal2.cover();
        papagal2.eats();
        // papagal2.habitat(); //in Animal habitat este protected;
        // la utilizarea prin mostenire acesta nu mai este vizibil

        //papagal2.descriere(); //descriere este protected in parinte. Este vizibil doar in interiorul obiectului Papagal
    }

    //tip de switch aparut la java 17
    //face cast automat la tipul obiectului
    // face instanceof
    private static void testSwitchBreakByDefault(Animal animal){
        switch (animal){
            case Papagal a -> System.out.println("Papagal " + a);
            case Pasare b -> System.out.println("Pasare " + b);
            default -> System.out.println("Animal " + animal);
        }
    }

    private static void testSwitchCuBreak(Animal animal){
        switch (animal){
            case Papagal a : System.out.println("Papagal " + a); break;
            case Pasare b : System.out.println("Pasare " + b); break;
            default : System.out.println("Animal " + animal);
        }
    }

    private static void testSwitchByInstanceOf(Object object){
        switch (object){
            case Integer a -> System.out.println("integer " + a);
            case Float f -> System.out.println("float " + f);
            case Byte b -> System.out.println("byte " + b);
            case String s -> System.out.println("String " + s);
            case Long l -> System.out.println("Long " + l);
            case Double d -> System.out.println("Double " + d);
            default -> System.out.println(object);
        }
    }

    private static void interfete(){
        Portar portar = new Portar();
        portar.calculVechime(2);
        portar.programLucru();
    }

}