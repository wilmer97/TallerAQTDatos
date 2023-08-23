public class Punto {

    private double puntoX;
    private double puntoY;
    /*


    public Punto(Punto X, Punto Y) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }

    public void mueveDerecha(double distancia) {
        this.puntoX += distancia;
    }

    public void mueveIzquierda(double distancia) {
        this.puntoY -= distancia;
    }

    public void mueveArriba(double distancia) {
        this.puntoX += distancia;
    }
    public void mueveAbajo(double distancia) {
        this.puntoY -= distancia;
    }

    public class Main {
    public static void main(String[] args) {
        Punto puntoA = new Punto(0.0, 0.0);
        Punto puntoB = new Punto(1.0, 1.0);
        Linea linea = new Linea(puntoA, puntoB);
        System.out.println(linea.toString()); // imprime [(0.0, 0.0), (1.0, 1.0)]
        linea.mueveDerecha(1.0);
        System.out.println(linea.toString()); // imprime [(1.0, 0.0), (2.0, 1.0)]
        linea.mueveArriba(2.0);
        System.out.println(linea.toString()); // imprime [(1.0, 2.0), (2.0, 3.0)]
            }
}
    */

    /*
    2 punto
     */

    private String Nombre;
    private int Puntuaje;
    private int edad;

    public Punto() {
    }

    public Punto(double puntoX, double puntoY, String nombre, int puntuaje, int edad) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
        Nombre = nombre;
        Puntuaje = puntuaje;
        this.edad = edad;
    }

    public double getPuntoX() {
        return puntoX;
    }

    public void setPuntoX(double puntoX) {
        this.puntoX = puntoX;
    }

    public double getPuntoY() {
        return puntoY;
    }

    public void setPuntoY(double puntoY) {
        this.puntoY = puntoY;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPuntuaje() {
        return Puntuaje;
    }

    public void setPuntuaje(int puntuaje) {
        Puntuaje = puntuaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "puntoX=" + puntoX +
                ", puntoY=" + puntoY +
                ", Nombre='" + Nombre + '\'' +
                ", Puntuaje=" + Puntuaje +
                ", edad=" + edad +
                '}';
    }
}
