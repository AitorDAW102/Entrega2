public class Patinete {
    //variables patinete
    private String modelo;
    private int autonomia;
    private double bateria;
    private double velocidad;
    private boolean encendido;

    //Contructores

    Patinete(){
        modelo="Desconocido";
        autonomia=50;
        bateria=100;
        velocidad=0;
        encendido=false;
    }

    Patinete(String newModelo, int newAutonomia, double newBateria, double newVelocidad, boolean newEncendido){
        modelo=newModelo;
        autonomia=newAutonomia;
        bateria=newBateria;
        velocidad=newVelocidad;
        encendido=newEncendido;
    }

    //getters

    public String getModelo(){
        return modelo;
    }

    public int getAutonomia(){
        return autonomia;
    }

    public double getBateria(){
        return bateria;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public boolean getEncendido(){
        return encendido;
    }

    //setters
    public void setModelo(String newModelo){
        modelo=newModelo;
    }

    public void setAutonomia(int newAutonomia){
        if (newAutonomia>=0){
            autonomia=newAutonomia;
        } else{
            System.out.println("No puede tener autonomia negativa");
        }
    }

    public void setBateria(double newBateria){
        if (bateria >=0 && bateria <=100){
            bateria=newBateria;
        } else {
            System.out.println("no puedo salir del rango 0-100");
        }
    }

    public void setVelocidad(double newVelocidad){
        if (newVelocidad>=0){
            velocidad=newVelocidad;
        } else{
            System.out.println("No puede tener velocidad negativa");
        }
    }

    public void setEncendido(boolean newEncendido){
        encendido=newEncendido;
    }

    //metodos adicionales

    public void encender(){
        boolean newEncendido=true;
        if (encendido==newEncendido){
            System.out.println("El coche ya estaba apagado");
        } else if (bateria==0) {
            System.out.println("El coche no tiene bateria");
        } else {
            encendido=newEncendido;
        }
    }

    public void apagar(){
        boolean newEncendido=false;
        if (encendido==newEncendido){
            System.out.println("El coche ya estaba apagado");
        } else {
            encendido=newEncendido;
            velocidad=0;
        }
    }

    public void acelerar(double incremento){
        if (incremento>=0){
            velocidad+=incremento;
        } else{
            System.out.println("No puedes accelerar negativo");
        }
    }

    public void frenar(double drecemento){
        if (drecemento>=0){
            velocidad-=drecemento;
            if (velocidad<0){
                velocidad=0;
            }
        }  else{
            System.out.println("No puedes frenado negativo");
        }
    }

    public void recorrer(double distancia){
        if (encendido && bateria>0 && distancia >= 0){
            if ((bateria-=distancia)==0){
                encendido=false;
                velocidad=0;

            }
            if (bateria<0){
                bateria=0;
                encendido=false;
            }
        }
    }

    public boolean necesitaRecarga(){
        if (bateria<20){
            return true;
        }else {
            return false;
        }
    }

    public void mostrarInformacion(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Autonomia: "+autonomia);
        System.out.println("Bateria: "+bateria+"%");
        System.out.println("Velocidad: "+velocidad+"km/h");
        if (encendido){
            System.out.println("Encendido: Si");
        } else {
            System.out.println("Encendido: No");
        }
    }
}
