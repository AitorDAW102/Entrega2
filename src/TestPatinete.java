public class TestPatinete {
    public static void main(String[] args) {
        Patinete patinete1= new Patinete();
        Patinete patinete2= new Patinete("Xiaomi", 100, 35,10, true);

        //Patinete1
        System.out.println("Patinete1");
        patinete1.encender();
        patinete1.recorrer(20);
        patinete1.mostrarInformacion();
        System.out.println();

        //Patinete2
        System.out.println("Patinete2");
        patinete2.frenar(20);
        System.out.println(patinete2.necesitaRecarga());
        patinete2.recorrer(50);
        patinete2.mostrarInformacion();
    }
}
