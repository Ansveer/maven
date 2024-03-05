package ru.sber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SorterTest {
    @Test
    void bubbleCheckInt() {
        Sorter sorter = new Sorter();
        int len = 10;
        int[] arr = new int[len];
        int a = 0;
        int b = 1000;
        for (int i = 0; i < len; i++){
            arr[i] = a + (int) (Math.random() * (b + 1));
        }
        sorter.bubbleSort(arr);
        Assertions.assertTrue(sorter.isSorted(arr));
    }
    @Test
    void bubbleCheckLong() {
        Sorter sorter = new Sorter();
        int len = 10;
        long[] arr = new long[len];
        int a = 0;
        int b = 1000;
        for (int i = 0; i < len; i++){
            arr[i] = a + (long) (Math.random() * (b + 1));
        }
        sorter.bubbleSort(arr);
        Assertions.assertTrue(sorter.isSorted(arr));
    }
    @Test
    void quickCheckInt() {
        Sorter sorter = new Sorter();
        int len = 10;
        int[] arr = new int[len];
        int a = 0;
        int b = 1000;
        for (int i = 0; i < len; i++){
            arr[i] = a + (int) (Math.random() * (b + 1));
        }
        sorter.quickSort(arr, 0, len - 1);
        Assertions.assertTrue(sorter.isSorted(arr));
    }
    @Test
    void quickCheckLong() {
        Sorter sorter = new Sorter();
        int len = 10;
        long[] arr = new long[len];
        int a = 0;
        int b = 1000;
        for (int i = 0; i < len; i++){
            arr[i] = a + (long) (Math.random() * (b + 1));
        }
        sorter.quickSort(arr, 0, len - 1);
        Assertions.assertTrue(sorter.isSorted(arr));
    }
}
