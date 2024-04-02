public class Persoana implements Comparable<Persoana> {
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String prenume, String nume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public int compareTo(Persoana obiectDeComparat){

        return this.nume.compareTo(obiectDeComparat.nume);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return "\n\t\tPersoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
