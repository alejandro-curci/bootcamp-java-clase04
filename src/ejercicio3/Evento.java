package ejercicio3;

import ejercicio1.Prenda;

import javax.naming.InitialContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evento {
    List<Invitado> invitados;
    Map<Integer, List<FuegoArtificial>> packsFuegosArtificiales;
    int conteoPacks;

    public Evento() {
        invitados = new ArrayList<>();
        packsFuegosArtificiales = new HashMap<>();
        conteoPacks = 0;
    }

    public void agregarInvitado(String nombre, boolean trabajaEnMeli) {
        invitados.add(new Invitado(nombre, trabajaEnMeli));
    }

    public void adquirirFuegosArtificiales(List<FuegoArtificial> pack) {
        conteoPacks++;
        packsFuegosArtificiales.put(conteoPacks, pack);
    }

    public void repartirTorta() {
        for (Invitado inv : invitados) {
            inv.degustarTorta();
        }
    }

    public void explotarFuegos() {
        for (Map.Entry<Integer, List<FuegoArtificial>> entry : packsFuegosArtificiales.entrySet()) {
            System.out.println("Pack Nª: " + entry.getKey());
            for (FuegoArtificial f : entry.getValue()) {
                System.out.print(f.getMarca() + " explotó... ");
                f.explotar();
            }
            System.out.println();
        }
    }
}
