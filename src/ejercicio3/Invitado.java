package ejercicio3;

public class Invitado {
    private String nombre;
    private boolean trabajaEnMeli;

    public Invitado(String nombre, boolean trabajaEnMeli) {
        this.nombre = nombre;
        this.trabajaEnMeli = trabajaEnMeli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTrabajaEnMeli() {
        return trabajaEnMeli;
    }

    public void setTrabajaEnMeli(boolean trabajaEnMeli) {
        this.trabajaEnMeli = trabajaEnMeli;
    }

    public void degustarTorta() {
        if (trabajaEnMeli) {
            System.out.println(nombre + " de MeLi dice: Viva la Chiqui!");
        } else {
            System.out.println(nombre + " dice: Muy rica la torta.");
        }
    }
}
