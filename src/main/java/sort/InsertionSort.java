package sort;

import java.util.List;

/**
 * @program: algorithm
 * @description:
 * @author: liu.yuan
 * @create: 2020-06-23 11:49
 */

public class InsertionSort extends Sort {
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j],a[j-1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}
