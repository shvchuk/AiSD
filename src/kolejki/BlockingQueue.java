package kolejki;

public class BlockingQueue implements Queue {

    /* obiekt synchronizujący */
    private final Object _mutex = new Object();

    /* odnośna kolejka */
    private final Queue _queue;

    /* maksymalny dopuszczalny rozmiar kolejki */
    private final int _maxSize;

    /* konstruktor parametry: odnośna kolejka, maksymalny rozmiar kolejki */
    public BlockingQueue(Queue queue, int maxSize){
        assert queue != null : "nie określono kolejki";
        assert maxSize > 0 : "maksymalny rozmiar musi być dodatni";

        _queue = queue;
        _maxSize = maxSize;
    }

    /* konstruktor parametr odnośna kolejka */
    public BlockingQueue(Queue queue){
        this(queue, Integer.MAX_VALUE);
    }

    @Override
    public void enqueue(Object value) {
        synchronized (_mutex){
            while(size() == _maxSize){
                waitForNotification();
            }
            _queue.enqueue(value);
            _mutex.notifyAll();
        }
    }

    private void waitForNotification(){
        try{
            _mutex.wait();
        } catch (InterruptedException e){
            // ignoruj wyjątek
        }
    }

    @Override
    public Object dequeue() throws EmptyQueueException {
        synchronized (_mutex){
            while(isEmpty()){
                waitForNotification();
            }
            Object value = _queue.dequeue();
            _mutex.notifyAll();
            return value;
        }
    }

    @Override
    public void clear() {
        synchronized (_mutex){
            _queue.clear();
            _mutex.notifyAll();
        }
    }

    @Override
    public int size() {
        synchronized (_mutex){
            return _queue.size();
        }
    }

    @Override
    public boolean isEmpty() {
        synchronized (_mutex){
            return _queue.isEmpty();
        }
    }
}
