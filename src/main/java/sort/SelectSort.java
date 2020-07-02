package sort;

/**
 * @program: algorithm
 * @description:
 * @author: liu.yuan
 * @create: 2020-06-23 10:42
 */

public class SelectSort extends Sort {
    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}
