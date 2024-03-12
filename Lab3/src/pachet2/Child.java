package pachet2;

import pachet1.Parinte;

/*
Mostenirea

in java se poate extinde o singura clasa
se pot implementa mai multe interfete
*/
public class Child extends Parinte {
    private int a1;

    public Child() {
    }

    public Child(int a1) {
        this.a1 = a1;
    }

    public Child(String a, int b, int a1) {
        super(a, b);
        this.a1 = a1;
    }

    public Child(Parinte p, int a1) {
        super(p.getA(), p.getB());
        this.a1 = a1;
    }


    @Override
    public String toString() {

        return "ChildClass{" +
                "a1=" + a1 +
                " a=" + super.getA() +
                " b=" + super.getB() +
                " c=" + super.getC() +
                '}'
                ;
    }
}
