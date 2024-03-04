package tablouri;

import java.util.Arrays;

/*
  sunt variabile de tip referinta, deci trebuie alocate inainte de utilizare

  definire tablouri si uitilizare clasa Arrays(un utilitar care are metode pentru tablouri)
  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html
 */
public class Tablouri {

    public static void main(String[] args) {

        tablouriUnidimensionale();

        tablouriBidimensionale();
    }

    private static void tablouriUnidimensionale() {
        System.out.println("**** Tablouri unidimensionale ****");
        //exemple de alocare
        int[] a = {1, 2, 3, 4, 5}, b = {20, 30, 40};
        int c[] = {1, 2 , 3}, d[] = { 1, 2 , 3}, m[] = { 1, 3 , 2};

        //Alocare dinamica. Se foloseste operatorul new
        // toate tablourile alocate dinamic vor fi initialozate cu valori nule de tip
        int e[];
        e = new int[5];

        int[] f = null;
        f = new int[7];

        int g[] = new int[7];
        int []h = new int[5];

        boolean[] bb = new boolean[2];
        bb[0] = true;
        System.out.println(bb[0]);
        //accesarea unui element care nu exista arunca exceptia ArrayIndexOutOfBoundsException
        //System.out.println(bb[2]);

        //afisarea elementelor unui array, 2 variante
        System.out.println("for cu iteratie pe indecsi");
        for (int i = 0 ; i< bb.length; i++){
            System.out.println(bb[i]);
        }

        System.out.println("for cu iteratie pe elemente");
        for(boolean i : bb){
            System.out.println(i);
        }

        //Folosire Arrays
        System.out.println("utilizare Arrays pt afisare tablou unidimensional bb = " + Arrays.toString(bb));

        System.out.println("Arrays compare c with d = " + Arrays.equals(c, d));
        //comopara elementele aflate pe aceleasi pozitii
        System.out.println("Arrays compare c with m = " + Arrays.equals(c, m));

        //utilizare binary search fara sortare prealabila
        System.out.println("Arrays, binarysearch, on not sorted yet m = " + Arrays.binarySearch(m, 2));
        //sortare array
        Arrays.sort(m);
        System.out.println("Arrays, binarysearch, on sorted m  = " + Arrays.binarySearch(m, 2));


        //copiere
        int[] copie1 = Arrays.copyOf(m, 2);
        System.out.println("copie1 = " + Arrays.toString(copie1));
        System.out.println("m = " + Arrays.toString(m));
        System.out.println("Arrays mimatch = " + Arrays.mismatch(m, copie1));

        System.out.println("Arrays comparare m si copie1 = " + Arrays.compare(m, copie1));
        System.out.println();
    }

    private static void tablouriBidimensionale() {
        System.out.println("**** Tablouri unidimensionale ****");

        //alocare tablou bidimensional. Liniile pot avea dimensiuni diferite
        int [][] a = {{1,2,3}, {1, 2, 3}, {1, 2, 3, 4}};
        int b[][] = {{2,4,5}, {4,7}};
        int[] c[] = {{1, 5, 6}, {4, 6}, {6, 8, 0}, {3, 7, 9, 9 , 5}};
        int m[][] = {{2,4,5}, {4,7}};

        //Alocare dinamica; se face cu new
        int[][] d1 = new int[3][2];
        int d2[][] = new int[3][3];

        int[][] d3 = new int[3][];
        d3[0] = new int[7];
        d3[1] = new int[3];
        d3[2] = new int[2];

        int[][] d4 = {{1, 2}, {3}, {4, 5, 6, 7}, {8, 9}};
        System.out.println("enhanced for folsind indicii tabloului");
        for(int i = 0; i < d4.length; i++){
            for (int j = 0; j < d4[i].length; j++){
                System.out.print(d4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("enhanced for folosind iteratie pe elemente");
        for (int[] row : d4){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //Folosire Arrays
        System.out.println("utilizare Arrays pt afisare tablou bidimensional d4 = " + Arrays.deepToString(d4));

        System.out.println("utilizare Arrays pt comparare tablouri bidimensionale b si m = " + Arrays.deepEquals(b, m));
        System.out.println("utilizare equals pt comparare tablouri bidimensionale b si m = " + b.equals(m)); //intoarce false pt ca va compara adresele din memorie
    }


}
