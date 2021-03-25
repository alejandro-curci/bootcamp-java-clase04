package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prenda p1 = new Prenda("Adidas", "Sport");
        Prenda p2 = new Prenda("Nike", "Urban");
        Prenda p3 = new Prenda("Topper", "Gold");
        List<Prenda> lista1 = new ArrayList<>();
        List<Prenda> lista2 = new ArrayList<>();
        lista1.add(p1);
        lista1.add(p2);
        lista2.add(p3);
        GuardaRopa g = new GuardaRopa();
        System.out.println("La lista 1 se guarda en: "+g.guardarPrendas(lista1));
        System.out.println("La lista 2 se guarda en: "+g.guardarPrendas(lista2));
        g.mostrarPrendas();
        System.out.println();
        g.devolverPrendas(1);
    }
}
