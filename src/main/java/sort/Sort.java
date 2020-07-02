package sort;



public abstract class Sort{
    int comNum = 0;
    int exchNum = 0;

    boolean less(Comparable a, Comparable b) {
        comNum++;
        return a.compareTo(b) < 0;
    }

    void exch(Comparable[] a, int i, int j) {
        exchNum++;
        Comparable comparable = a[i];
        a[i] = a[j];
        a[j] = comparable;
//        System.out.println(Arrays.toString(a));
    }
    public abstract void sort(Comparable[] a);

    public  void sort2(Comparable[] a){

    }

    public void info() {
        System.out.println("comNum = " + comNum);
        System.out.println("exchNum = " + exchNum);
    }

    public boolean sorted(Comparable[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (less(a[i + 1], a[i])) {
                return false;
            }
        }
        return true;
    }
}
