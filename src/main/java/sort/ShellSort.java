package sort;

/**
 * @program: algorithm
 * @description:
 * @author: liu.yuan
 * @create: 2020-06-23 13:09
 */

public class ShellSort extends Sort {
    public  void sort(Comparable[] a) {
        int h = 1;
        while (h < a.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j = j - h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public  void sort2(Comparable[] a) {
        int h = 1;
        while (h < a.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int k = 0; k < h; k++) {
                for (int i = k+h; i < a.length; i = i + h) {
                    for (int j = i; j >= h && less(a[j], a[j - h]); j = j - h) {
                        exch(a, j, j - h);
                    }
                }
            }
            h = h / 3;
        }
    }
}
