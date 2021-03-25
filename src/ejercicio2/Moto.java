package ejercicio2;

public class Moto extends Vehiculo {

    public Moto(double velocidad, double aceleracion, double anguloGiro, String patente) {
        super(velocidad, aceleracion, anguloGiro, patente);
        this.peso = 300;
        this.ruedas = 2;
    }
}
