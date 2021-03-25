package ejercicio2;

public class SocorristaMoto extends Vehiculo {

    public SocorristaMoto() {
        super();
    }

    public void socorrerMoto(Moto m) {
        System.out.println("Socorriendo moto! Patente: " + m.getPatente());
    }
}
