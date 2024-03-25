package imutabile;

public class Bouquet {
    private int nmbOfFlowers;
    private Flower flower;

    public Bouquet(int nmbOfFlowers, Flower flower) {
        this.nmbOfFlowers = nmbOfFlowers;
        this.flower = flower;
    }

    public int getNmbOfFlowers() {
        return nmbOfFlowers;
    }

    public void setNmbOfFlowers(int nmbOfFlowers) {
        this.nmbOfFlowers = nmbOfFlowers;
    }

    public Flower getFlower() {
        return flower; // returneaza referinta la obiect
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }

}
