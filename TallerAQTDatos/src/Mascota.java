public class Mascota {

    public Mascota(String olivia, String buldogFrancés, double v, int i) {
    }

    public void mostrarInfo() {
        String nombre = null;
        System.out.println("Nombre: " + nombre);
        String raza = null;
        System.out.println("Raza: " + raza);
        String peso = null;
        System.out.println("Peso: " + peso + " kg");
        String edad = null;
        System.out.println("Edad: " + edad + " años");
    }

    public static void main(String[] args) {
        Mascota masc = new Mascota("Olivia", "Buldog Francés", 1.2, 1);
        Raza.mostrarInfo();
    }

}
