package algorithms.sorting;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;

public class ArrayFunctions {
    public static void main(String[] args) {
        int[] data = {3, 14, 7, 22, 45, 12, 19, 42, 6};
        int[] dataSetOne = new int[100];
        int[] dataSetTwo = new int[100];
        Integer[] dataSetSedgewick = new Integer[100];
        System.out.println("Search for 7: " + linearSearch(data, 7));
        System.out.println("Search for 100: " + linearSearch(data, 100));

        System.out.println("Data: ");
        printData(data);
        System.out.println();
        System.out.println("Insertion Sort Start");
        insertionSort(data);
        System.out.println("Sorted data: ");
        printData(data);
        System.out.println("Generating new random data.");
        randomFill(data, 50);
        printData(data);
        insertionSort(data);
        System.out.println("Data sorted.");
        printData(data);
        System.out.println("Generate new data: data Set One");
        randomFill(dataSetOne, 1000);
        printData(dataSetOne);
        System.out.println("Insertion sort start");
        insertionSort(dataSetOne);
        System.out.println("Sorted data");
        printData(dataSetOne);
        randomFill(dataSetTwo, 1000);

        int[] dataSetOneTwo = ArrayUtils.addAll(dataSetOne, dataSetTwo);
        printData(dataSetOneTwo);
        System.out.println("---------------------------");
        System.out.println("Insertion sort, Data Set One (sorted) plus Data Set Two (random ints).");
        insertionSort(dataSetOneTwo);
        printData(dataSetOneTwo);
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("********** Selection Sort Sedgewick START ************");
        randomFillSedgewick(dataSetSedgewick, 100);
        printDataSedgewick(dataSetSedgewick);
        System.out.println();
        SelectionSortSedgewick.sort(dataSetSedgewick);
        SelectionSortSedgewick.show(dataSetSedgewick);
        System.out.println();
        System.out.println("********** Selection Sort Sedgewick END ************");
    }

    public static int linearSearch(int[] data, int target){
        for(int i = 0; i < data.length; i++){
            if(target == data[i]) return i;
        }
        return -1;
    }

    public static void insertionSort(int[] data){
        int innerLoop = 0;
        int outerLoop = 0;
        for(int i = 1; i < data.length; i++){
            int key = data[i];
            int j = i-1;
            while(j >= 0 && key < data[j]){
                data[j+1] = data[j];
                j--;
                innerLoop++;
            }
            data[j+1] = key;
            outerLoop++;
        }
        System.out.println("Outer loop: " + outerLoop);
        System.out.println("Inner loop: " + innerLoop);
    }

    public static void randomFill(int[] data, int max){
        Random gen = new Random();
        for(int i = 0; i < data.length; i++){
            data[i] = gen.nextInt(max);
        }
    }

    public static void randomFillSedgewick(Integer[] data, int max){
        Random gen = new Random();
        for(int i = 0; i < data.length; i++){
            data[i] = gen.nextInt(max);
        }
    }

    public static void printData(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void printDataSedgewick(Integer[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]);
            System.out.print("\t");
        }
        System.out.println();
    }


}
