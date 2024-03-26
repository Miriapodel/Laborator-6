package singleton;

import java.util.ArrayList;
import java.util.List;

//exemplu de singleton design pattern: CREATIONAL desing pattern
//constructorul este intotdeauna privat ca sa nu poata fi instantiat
public class CacheListaNumere {

    //are ca parametru chiar o instanta a clasei; este STATIC
    private static CacheListaNumere cacheListaNumere;
    private List<Integer> stocareIntregi = new ArrayList<>();

    //constructorul este intotdeauna privat ca sa nu poata fi instantiat
    private CacheListaNumere(){}

    public static CacheListaNumere getInstanceCacheListaNumere(){
        if(cacheListaNumere == null){
            cacheListaNumere = new CacheListaNumere();
        }
        return cacheListaNumere;
    }

    public List<Integer> getStocareIntregi() {
        return stocareIntregi;
    }

    public void addInteger(Integer i){
        stocareIntregi.add(i);
    }
}
