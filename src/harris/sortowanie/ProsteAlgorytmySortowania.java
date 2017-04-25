package harris.sortowanie;

import algorithms.sorting.SelectionSortSedgewick;
import listy.List;

public class ProsteAlgorytmySortowania {
    public static void main(String[] args) {
        Integer[] dataJeden = {3, 7, 4, 19, 64, 33, 45, 21};

        IntegerComparator comparator = new IntegerComparator();

        SelectionSortListSorter selection = new SelectionSortListSorter(comparator);

        for(int i = 0; i < dataJeden.length; i++){
            System.out.print(dataJeden[i] + " ");
        }
        System.out.println();
        SelectionSortSedgewick.sort(dataJeden);



    }
}
