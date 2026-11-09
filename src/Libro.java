public class Libro {
    //variables de libros
    private String autor;
    private String titulo;
    private String isbn;
    private int numPages;
    private boolean prestado;

    //constructor
    Libro(){
        autor = "Anonimo";
        titulo = "Desconocido";
        isbn = "XXXXXXXXX";
        numPages = 100;
        prestado = false;
    }

    Libro(String newAutor, String newTitulo, String newIsbn, int newNumpages, boolean newPrestado){
        autor=newAutor;
        titulo=newTitulo;
        isbn=newIsbn;
        numPages=newNumpages;
        prestado=newPrestado;
    }

    //getters
    public String getAutor(){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getNumPages(){
        return numPages;
    }

    public boolean isPrestado(){
        return prestado;
    }

    //Setters
    public void setAutor(String newAutor){
        autor=newAutor;
    }

    public void setTitulo(String newTitulo){
        titulo=newTitulo;
    }

    public void setIsbn(String newIsbn){
        isbn=newIsbn;
    }

    public void setNumPages(int newNumPages){
        if (newNumPages>=0){
            numPages=newNumPages;
        } else{
            System.out.println("No puede haber paginas negativas");
        }
    }

    public void setPrestado(boolean newPrestado){
        prestado=newPrestado;
    }

    //metodos adicionales
    public void prestar(){
        boolean newPrestado=true;
        if (prestado==newPrestado){
            System.out.println("Este libro ya estaba prestado");
        } else {
            prestado=newPrestado;
        }
    }

    public void devolver(){
        boolean newPrestado=false;
        if (prestado==newPrestado){
            System.out.println("Este libro ya estaba devuelto");
        } else {
            prestado=newPrestado;
        }
    }

    public double calcularTiempoLectura(int paginasHora){
        if (paginasHora>=0){
            return numPages/paginasHora;
        } else{
            System.out.println("Dato no valido");
            return 0;
        }
    }

    public boolean esExtenso (){
        if (numPages>300){
            return true;
        }else {
            return false;
        }
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+autor);
        System.out.println("ISBN: "+isbn);
        System.out.println("Paginas: "+numPages);
        if (prestado){
            System.out.println("Prestado: Si");
        } else {
            System.out.println("Prestado: No");
        }
    }
}
