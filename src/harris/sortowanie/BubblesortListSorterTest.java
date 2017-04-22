package harris.sortowanie;

public class BubblesortListSorterTest extends AbstractListSorterTest {

    @Override
    protected ListSorter createListSorter(Comparator comparator) {
        return new BubblesortListSorter(comparator);
    }
}
