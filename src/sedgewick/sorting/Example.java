package sedgewick.sorting;

import edu.princeton.cs.algs4.StdIn;

/* Template for Sort Classes

 */
public class Example {

    public static void sort(Comparable[] a){

    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        // Print the Array on a Single Line
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        // Test whether the array entries are in order
        for(int i = 0; i < a.length; i++){
            if(less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Read strings from standard input, sort them and print
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
