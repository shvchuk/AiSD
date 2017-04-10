package kolejki;

public class Zad1KolejkaBezposrednia implements Queue{

    private Element first;
    private int size;
    private Element last;

    private final class Element{
        private Object _value;

    }

    @Override
    public void enqueue(Object value) {

    }

    @Override
    public Object dequeue() throws EmptyQueueException {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
