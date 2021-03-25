package integrador;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {

    Comparator<T> c;

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        this.c = c;
        bubbleSort(arr);
    }

    // BUBBLE SORT ALGORITHM

    private void bubbleSort(T array[]) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (c.compare(array[j], array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}