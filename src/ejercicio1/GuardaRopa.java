package ejercicio1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    private int contador;
    private Map<Integer, List<Prenda>> guardaRopa;

    public GuardaRopa() {
        contador = 1;
        guardaRopa = new HashMap<>();
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        guardaRopa.put(contador, listaDePrenda);
        return contador++;
    }

    public void mostrarPrendas() {
        for (Map.Entry<Integer, List<Prenda>> entry : guardaRopa.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " tiene las siguientes prendas...");
            for (Prenda p : entry.getValue()) {
                System.out.println("Value: " + p.toString());
            }
        }
    }

    public void devolverPrendas(int k) {
        List<Prenda> prendas = guardaRopa.get(k);
        guardaRopa.remove(k);
        System.out.println("Se han devuelto sus prendas:");
        for (Prenda p : prendas) {
            System.out.println(p);
        }
    }
}
