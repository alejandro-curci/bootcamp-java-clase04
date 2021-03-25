package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(1000.0, 5000, "Dakar", 3);
        carrera.darDeAltaAuto(180.4, 9.2, 8.1, "AACE90");
        carrera.darDeAltaAuto(95.6, 6.7, 7.3, "BUCE90");
        carrera.darDeAltaMoto(72.8, 5.7, 12.5, "XVBE63");
        carrera.darDeAltaMoto(44.3, 4.1, 13.6, "OPCE55");
        carrera.definirGanador();
        carrera.eliminarVehiculoConPatente("BUCE90");
        carrera.socorrerMoto("XVBE63");
    }


}
