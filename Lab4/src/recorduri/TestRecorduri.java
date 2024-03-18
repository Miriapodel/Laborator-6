package recorduri;

public class TestRecorduri {
    public static void main(String[] args) {
        Manager manager = new Manager("Florin", "Contabilitate", 10  );
        System.out.println(manager);

        Manager manager2 = new Manager("Florin", "Contabilitate", 10  );

        System.out.println(manager == manager2); //false ; sunt obiecte diferite
        System.out.println(manager.equals(manager2)); //true; este definit by default in record

        manager.setInstitutie("Guvern");
        System.out.println(manager.getInstitutie());
        System.out.println(manager);
    }
}
