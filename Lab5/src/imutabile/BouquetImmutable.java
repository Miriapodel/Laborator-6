package imutabile;

//regula 1 - clasa este marcata ca final; nu exista seteri
public final class BouquetImmutable {
    private final int nmbOfFlowers; // regula 2 - variabilele clasei sunt final
    private final Flower flower;

    public BouquetImmutable(int nmbOfFlowers, Flower flower) {
        this.nmbOfFlowers = nmbOfFlowers;
        this.flower = new Flower(flower); // regula 3 - se creaza obiect nou; vezi new
    }

    public int getNmbOfFlowers() {
        return nmbOfFlowers;
    }


    public Flower getFlower() {
        return new Flower(flower); // regula 4 - get returneaza referinta catre o copie a obiectului
    }


}
