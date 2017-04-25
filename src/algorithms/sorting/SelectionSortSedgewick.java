package algorithms.sorting;

public class SelectionSortSedgewick {


    public static void sort(Comparable[] a){
        int N = a.length;
        int innerLoop = 0;
        int outerLoop = 0;
        for(int i = 0; i < N; i++){
            int min = i;
            for(int j = i+1; j < N; j++){
                if(less(a[j], a[min])) min = j;
                innerLoop++;
            }
            exch(a, i, min);
            outerLoop++;
        }
        System.out.println("Outer loop: " + outerLoop);
        System.out.println("Inner loop: " + innerLoop);
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i = 0; i < a.length; i++){
            if(less(a[i], a[i-1])){
                return false;
            }
        }
        return true;
    }
}
