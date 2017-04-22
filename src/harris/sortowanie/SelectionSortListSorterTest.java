package harris.sortowanie;

public class SelectionSortListSorterTest extends AbstractListSorterTest {

    @Override
    protected ListSorter createListSorter(Comparator comparator) {
        return new SelectionSortListSorter(comparator);
    }
}
