package sort;

import javafx.print.Collation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @program: algorithm
 * @description:
 * @author: liu.yuan
 * @create: 2020-06-24 13:54
 */

public class MergeSort extends Sort{
    Comparable[] aux = null;

    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }


    public void sort(Comparable[] a, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        sort(a, low, mid);
        sort(a, mid + 1, high);
        merge(a, aux, low, mid, high);
    }

    private void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            aux[i] = a[i];
        }
        int j = mid + 1;
        int i = low;
        for (int k = low; k <= high; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > high) a[k] = aux[i++];
            else if (less(aux[i], aux[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }

    @Override
    public void sort2(Comparable[] a) {
        aux = new Comparable[a.length];
        for (int i = 1; i < a.length; i += i) {
            for (int j = 0; j + i < a.length; j = j+i+i) {
                merge(a, aux, j, i+j-1, Math.min(j + i + i - 1,a.length-1));
            }
            System.out.println(Arrays.toString(a));
        }
    }
}
