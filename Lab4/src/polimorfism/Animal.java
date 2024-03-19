package polimorfism;

import java.util.Objects;

public class Animal {

    private String name;
    private int legs;
    public Animal(){}

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    //nu poate fi final daca vrem extindere
    public void eats(){
        System.out.println("Animal eats meat");
    }

    protected void habitat(){
        System.out.println("Animal sta pe sol");
    }

    public static void getLegs(){
        System.out.println("Animal are 4 picioare");
    }

    public void cover(){
        System.out.println("Animalul are blana");
    }

    protected void descriere(){
        System.out.println("descriere");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return legs == animal.legs && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, legs);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
