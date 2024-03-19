package polimorfism.extensie;

import java.util.Objects;

public class Papagal extends Pasare {
    private String culoare;

    public Papagal(){}

    public Papagal(String name, String culoare) {
        super(name);
        this.culoare = culoare;
    }

    public void cover(){
        super.descriere(); //este vizibil deoarece este protected in parinte
        System.out.println("Penele papagalului sunt de culoare " + culoare);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Papagal papagal)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(culoare, papagal.culoare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), culoare);
    }

    @Override
    public String toString() {
        return "{" +
                super.toString() +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
