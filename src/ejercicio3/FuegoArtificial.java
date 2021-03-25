package ejercicio3;

public class FuegoArtificial {
    private String marca;
    private boolean disponible;
    private String ruido;

    public FuegoArtificial(String marca, String ruido) {
        this.marca = marca;
        this.ruido = ruido;
        disponible = true;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

    public void explotar() {
        if (disponible) {
            System.out.println(ruido + "!!!!!!");
        } else {
            System.out.println("Ya ha sido explotado!");
        }
    }
}
