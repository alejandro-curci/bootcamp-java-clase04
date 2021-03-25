package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private double distancia;
    private int premioEnDolares;
    private String nombre;
    private int cantidadVehiculosPermitidos;
    private List<Vehiculo> listaVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(double distancia, int premioEnDolares, String nombre, int cantidadVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
        listaVehiculos = new ArrayList<>();
        socorristaAuto = new SocorristaAuto();
        socorristaMoto = new SocorristaMoto();
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, double anguloGiro, String patente) {
        if (listaVehiculos.size() < cantidadVehiculosPermitidos) {
            listaVehiculos.add(new Auto(velocidad, aceleracion, anguloGiro, patente));
        } else {
            System.out.println("El cupo esta lleno!!!!");
        }
    }

    public void darDeAltaMoto(double velocidad, double aceleracion, double anguloGiro, String patente) {
        if (listaVehiculos.size() < cantidadVehiculosPermitidos) {
            listaVehiculos.add(new Moto(velocidad, aceleracion, anguloGiro, patente));
        } else {
            System.out.println("El cupo esta lleno!!!!");
        }
    }

    public void eliminarVehiculo(Vehiculo v) {
        boolean success = false;
        for (Vehiculo veh : listaVehiculos) {
            if (v.getPatente().equals(veh.getPatente())) {
                System.out.println("Vehiculo eliminado con exito");
                success = true;
            }
        }
        if (!success) {
            System.out.println("No se ha encontrado el vehiculo...");
        }
    }

    public void eliminarVehiculoConPatente(String patente) {
        boolean success = false;
        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().equals(patente)) {
                System.out.println("Vehiculo eliminado con exito");
                success = true;
            }
        }
        if (!success) {
            System.out.println("No se ha encontrado el vehiculo...");
        }
    }

    public void definirGanador() {
        Vehiculo ganador = listaVehiculos.get(0);
        double mejorPuntaje = ganador.calcularPuntaje();
        for (Vehiculo v : listaVehiculos) {
            if (v.calcularPuntaje() > mejorPuntaje) {
                mejorPuntaje = v.calcularPuntaje();
                ganador = v;
            }
        }
        System.out.println("El ganador tiene la patente " + ganador.getPatente());
        System.out.println("Y obtuvo " + mejorPuntaje + " puntos");
    }

    public void socorrerAuto(String patente) {
        boolean success = false;
        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().equals(patente)) {
                socorristaAuto.socorrerAuto((Auto) v);
                success = true;
            }
        }
        if (!success) {
            System.out.println("No se ha encontrado el vehiculo...");
        }
    }

    public void socorrerMoto(String patente) {
        boolean success = false;
        for (Vehiculo v : listaVehiculos) {
            if (v.getPatente().equals(patente)) {
                socorristaMoto.socorrerMoto((Moto) v);
                success = true;
            }
        }
        if (!success) {
            System.out.println("No se ha encontrado el vehiculo...");
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(int premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadVehiculosPermitidos() {
        return cantidadVehiculosPermitidos;
    }

    public void setCantidadVehiculosPermitidos(int cantidadVehiculosPermitidos) {
        this.cantidadVehiculosPermitidos = cantidadVehiculosPermitidos;
    }

}
