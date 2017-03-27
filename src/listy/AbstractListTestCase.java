package listy;

import junit.framework.TestCase;

public abstract class AbstractListTestCase extends TestCase {
    protected static final Object VALUE_A = "A";
    protected static final Object VALUE_B = "B";
    protected static final Object VALUE_C = "C";

    protected abstract List createList();

    public void testInsertIntoEmptyList(){ // testowanie poprawności wstawiania elementu do pustej listy
        List list = createList(); // utworzenie pustej listy

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
        list.insert(0, VALUE_A);
        assertEquals(1, list.size());
        assertFalse(list.isEmpty());
        assertSame(VALUE_A, list.get(0));
    }


}

