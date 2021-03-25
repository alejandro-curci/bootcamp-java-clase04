package integrador;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {

    private Comparator<T> c;

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        this.c = c;
        quickSort(arr, 0, arr.length - 1);
    }

    // QUICK SORT ALGORITHM

    private void quickSort(T arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(T arr[], int begin, int end) {
        T pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (c.compare(arr[j], pivot) <= 0) {
                i++;
                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        T swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }
}
