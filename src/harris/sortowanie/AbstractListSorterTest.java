package harris.sortowanie;

import iteratory.Iterator;
import junit.framework.TestCase;
import listy.LinkedList;
import listy.List;

public abstract class AbstractListSorterTest extends TestCase{
    private List _unsortedList;
    private List _sortedList;

    protected void setUp() throws Exception{
        _unsortedList = new LinkedList();
        _unsortedList.add("programowanie");
        _unsortedList.add("sterowane");
        _unsortedList.add("testami");
        _unsortedList.add("to");
        _unsortedList.add("mały");
        _unsortedList.add("krok");
        _unsortedList.add("dla");
        _unsortedList.add("programisty");
        _unsortedList.add("lecz");
        _unsortedList.add("olbrzymi");
        _unsortedList.add("skok");
        _unsortedList.add("w");
        _unsortedList.add("dziejach");
        _unsortedList.add("programowania");

        _sortedList = new LinkedList();
        _sortedList.add("dla");
        _sortedList.add("dziejach");
        _sortedList.add("krok");
        _sortedList.add("lecz");
        _sortedList.add("mały");
        _sortedList.add("olbrzymi");
        _sortedList.add("programisty");
        _sortedList.add("programowania");
        _sortedList.add("programowanie");
        _sortedList.add("skok");
        _sortedList.add("sterowane");
        _sortedList.add("testami");
        _sortedList.add("to");
        _sortedList.add("w");
    }

    protected void tearDown() throws Exception{
        _sortedList = null;
        _unsortedList = null;
    }

    protected abstract ListSorter createListSorter(Comparator comparator);

    public void testListSorterCanSortSampleList() throws Exception {
        ListSorter sorter = createListSorter(NaturalComparator.INSTANCE);
        List result = sorter.sort(_unsortedList);

        assertEquals(result.size(), _sortedList.size());

        Iterator actual = (Iterator) result.iterator();
        actual.first();

        Iterator expected = (Iterator) _sortedList.iterator();
        expected.first();

        while(!expected.isDone()){
            assertEquals(expected.current(), actual.current());

            expected.next();
            actual.next();
        }
    }
}
