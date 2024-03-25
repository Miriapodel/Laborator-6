package singleton;

public class ApplicationSingletonExemplu {

    public static void main(String[] args) {
        CacheListaNumere cacheListaNumere = CacheListaNumere.getInstanceCacheListaNumere(); // cand il apelez prima data se va initializa
        CacheListaNumere cacheListaNumere2 = CacheListaNumere.getInstanceCacheListaNumere(); // de fapt nu mai initializeaza nimic
        System.out.println(cacheListaNumere.equals(cacheListaNumere2)); // intoarce true pt ca exista o singura instanta

        //metoda addInteger nu este statica deci vom folosi instantierea ca sa o apelam
        cacheListaNumere.addInteger(6);
        cacheListaNumere2.addInteger(9);

        System.out.println(cacheListaNumere.getStocareIntregi());


    }
}
