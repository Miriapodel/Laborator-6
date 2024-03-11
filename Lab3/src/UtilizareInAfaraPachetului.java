import pachet1.Parinte;
import pachet2.Child;

public class UtilizareInAfaraPachetului {
    public static void main(String[] args) {
        Parinte parinte1 = new Parinte();
        System.out.println("Initial parinte1 = " + parinte1);

        Parinte parinte2 = new Parinte("1", 2);
        parinte2.setC(3);
        System.out.println("Initial parinte2 = " + parinte2);

        //se observa ca c a fost setat cad s-a definit demoClass1
        //valoare se pastreaza deoarece este static
        System.out.println("Final parinte1 = " + parinte1);

        //aceasta metoda nu se poate folosi deoarece nu este accesibila; default =  la nivel de pachet
        //parinte2.addValues(1,2);

        Child childClass = new Child("7", 8, 9);
        System.out.println("childClass = " + childClass.toString());

        //definire child al unui parinte existent
        Child child1 = new Child(parinte2, 77);
        System.out.println("Child1 = " + child1);

        Child child2 = new Child(parinte2, 79);
        System.out.println("Child2 = " + child2);

    }
}
