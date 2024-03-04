package introducere;

/*
1) compilare clasa
din folderul introducere , se da comanda:
 javac -d . Ex4_RedingInputArgs.java
2) rulare clasa cu parametri care vor fi primiti de metoda main in String[] args
java introducere.Ex4_RedingInputArgs test pao 242

La rulare, va afisa:
test
pao
242
 */
public class Ex4_RedingInputArgs {

    public static void main(String[] args) {
        for(String s : args){
            System.out.println(s);
        }
    }
}
