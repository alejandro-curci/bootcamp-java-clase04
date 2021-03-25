package ejercicio2;

public class SocorristaAuto extends Vehiculo {

    public SocorristaAuto() {
        super();
    }

    public void socorrerAuto(Auto a) {
        System.out.println("Socorriendo auto! Patente: " + a.getPatente());
    }
}
