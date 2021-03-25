package ejercicio2;

public class Auto extends Vehiculo {

    public Auto(double velocidad, double aceleracion, double anguloGiro, String patente) {
        super(velocidad, aceleracion, anguloGiro, patente);
        this.peso = 1000;
        this.ruedas = 4;
    }
}
