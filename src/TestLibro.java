public class TestLibro {
    public static void main(String[] args) {
        //Construcciones
        Libro libro1= new Libro();
        Libro libro2 = new Libro("Uberto Eco", "El nombre de la rosa", "9788497592581", 784,true);

        //Libro1
        System.out.println("Libro 1: ");
        libro1.setTitulo("La Odisea");
        libro1.setAutor("Homero");
        System.out.println("El numero de lectura de "+libro1.getTitulo()+" es de "+libro1.calcularTiempoLectura(25)+" horas");
        libro1.mostrarInformacion();
        System.out.println();

        //Libro2
        System.out.println("Libro2");
        libro2.prestar();
        libro2.devolver();
        if(libro2.esExtenso()){
            System.out.println("El libro " +libro2.getTitulo()+" es extenso");
        }else {
            System.out.println("El libro " + libro2.getTitulo() + " no es extenso");
        }
        libro2.mostrarInformacion();
    }
}
