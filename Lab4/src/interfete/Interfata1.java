package interfete;

/**
 interfata este o clasa abstracta care are metode neimplementate -> are antete de metode
 */

public interface Interfata1 {
    int f = 4; //orice variabila a interfetei este o constanta; este finala
    double calculSalariu(int spor) ;

    default double calculVechime(int ani) {
        return ani;
    }
}
