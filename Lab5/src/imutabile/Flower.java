package imutabile;

public class Flower {
    private String color;
    private int nmbPetals;
    private String name;

    public Flower(String color, int nmbPetals, String name) {
        this.color = color;
        this.nmbPetals = nmbPetals;
        this.name = name;
    }

    public Flower (Flower flower){
        this.color = flower.getColor();
        this.name = flower.getName();
        this.nmbPetals = flower.nmbPetals;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNmbPetals() {
        return nmbPetals;
    }

    public void setNmbPetals(int nmbPetals) {
        this.nmbPetals = nmbPetals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", nmbPetals=" + nmbPetals +
                ", name='" + name + '\'' +
                '}';
    }
}
