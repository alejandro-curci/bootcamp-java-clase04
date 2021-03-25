package integrador;

import java.util.Comparator;

public class MainSorter {
    public static void main(String[] args) {
        Integer numero[] = new Integer[10000];
        for (int j = 0; j < 10000; j++) {
            numero[j] = 10000 - j;
        }
        // printArray(numero);
        Sorter<Integer> mySort = (Sorter<Integer>) MiFactory.getInstance("sorter");
        Comparator<Integer> c1 = (a, b) -> a - b;
        Timer t = new Timer();
        t.start();
        mySort.sort(numero, c1);
        t.stop();
        long duration = t.elapsedTime();
        printArray(numero);
        System.out.println();
        System.out.println("Duracion: " + duration);

        // PERFORMANCE RESULTS for 100.000 integers
        // Heap Sort = 76 ms
        // Quick Sort = StackOverFlow Error
        // Bubble Sort = 29366 ms

        // PERFORMANCE RESULTS for 10.000 integers
        // Heap Sort = 5 ms
        // Quick Sort = 241 ms
        // Bubble Sort = 311 ms

    }

    public static <T> void printArray(T arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
