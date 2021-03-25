package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Evento evento = new Evento();

        evento.agregarInvitado("Juan", false);
        evento.agregarInvitado("Guillermo", true);
        evento.agregarInvitado("Lucas", false);
        evento.agregarInvitado("Jorge", false);
        evento.agregarInvitado("Miguel", true);
        evento.agregarInvitado("Gonzalo", true);
        FuegoArtificial fa1 = new FuegoArtificial("Acme", "kapum!");
        FuegoArtificial fa2 = new FuegoArtificial("Sony", "pium pium pium!!!!");
        FuegoArtificial fa3 = new FuegoArtificial("Water", "splaaaaaash");
        List<FuegoArtificial> pack1 = new ArrayList<>();
        List<FuegoArtificial> pack2 = new ArrayList<>();
        List<FuegoArtificial> pack3 = new ArrayList<>();
        pack1.add(fa1);
        pack1.add(fa3);
        pack2.add(fa1);
        pack2.add(fa2);
        pack2.add(fa3);
        pack3.add(fa2);
        evento.adquirirFuegosArtificiales(pack1);
        evento.adquirirFuegosArtificiales(pack2);
        evento.adquirirFuegosArtificiales(pack3);

        evento.repartirTorta();
        System.out.println();
        evento.explotarFuegos();
    }


}
