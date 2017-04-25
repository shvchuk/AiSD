package algorithms.sorting;

public class InsertionSortBasicExample {

    public static void insertionSort(int[] data){
        int innerLoop = 0;
        int outerLoop = 0;

        System.out.println("**** INSERTION SORT BASIC START ****");
        System.out.println("Initial Data Set");
        printData(data);
        for (int i = 1; i < data.length; i++){
            int key = data[i];
            int j = i - 1;
            while(j >= 0 && key < data[j]){
                data[j+1] = data[j];
                j--;
                innerLoop++;
            }
            data[j+1] = key;
            outerLoop++;
        }
        System.out.println("Outer Loop: " + outerLoop + ". Inner Loop: " + innerLoop);
        System.out.println("Sorted Data Set");
        printData(data);
        System.out.println("**** INSERTION SORT BASIC END ****");
    }

    public static void printData(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]);
            System.out.print("\t");
        }
        System.out.println();
    }
}
