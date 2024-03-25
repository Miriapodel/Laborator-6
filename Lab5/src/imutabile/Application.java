package imutabile;

public class Application {
    public static void main(String[] args) {
        Flower flower = new Flower("white", 10, "margareta");

        Bouquet bouquet = new Bouquet(5, flower);
        System.out.println("mutabil  Buchet: " + bouquet.getFlower());

        BouquetImmutable bouquetImmutable = new BouquetImmutable(5, flower);

        //schimb numele florii folosita de bouquet si bouquetImmutable
        flower.setName("rose");

        //bouquet a preluat numele schimbat
        System.out.println("Bouquet mutable: " + bouquet.getFlower());

        //nu are setteri
        //bouquetImmutable nu a luat noul nume. A ramas margareta
        Flower flower2 = bouquetImmutable.getFlower();
        Flower flower3 = bouquetImmutable.getFlower();
        System.out.println("Bouquet imutable: " + flower2);
        System.out.println("Bouquet imutable: " + flower3);

    }
}
