package algorithms.sorting;

public class SortingSimpleAlgorithms {
    public static void main(String[] args) {
        int[] dataRandomInsertionSortBasic = {59, 52, 94, 80, 76, 66, 35, 84, 78, 35, 4, 17, 87, 27,
                54, 5, 52, 88, 66, 55, 4, 36, 7, 75,
                45, 38, 44, 34, 58, 78, 96, 71, 15, 3,
                29, 96, 40, 71, 95, 97, 51, 30, 86, 84, 85, 7, 37, 80, 23, 49};

        int[] dataNearlySortedInsertionSortBasic = {3, 4, 4, 10, 7, 7, 15, 17, 31, 27, 29, 30, 39, 35, 35, 36, 37,
                38, 48, 44, 45, 49, 51, 52, 52, 60, 55, 58, 59, 69, 66, 71, 71, 75, 76, 79, 78, 80, 80, 89, 84,
                85, 86, 87, 88, 98, 95, 96, 96, 97};

        int[] dataFewUniqueInsertionSortBasic = {100, 52, 94, 80, 76, 66, 35, 84, 100, 35, 4, 17, 87, 27, 54, 5, 52,
                88, 66, 55, 4, 36, 100, 75, 45, 38, 44, 34, 58, 78, 96, 71, 100, 3, 29, 96, 40, 71, 95, 97, 51, 100,
                86, 84, 85, 7, 37, 80, 23, 100};

        InsertionSortBasicExample.insertionSort(dataRandomInsertionSortBasic);
        InsertionSortBasicExample.insertionSort(dataNearlySortedInsertionSortBasic);
        InsertionSortBasicExample.insertionSort(dataFewUniqueInsertionSortBasic);

    }
}
