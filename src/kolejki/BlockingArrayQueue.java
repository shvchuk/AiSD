//package kolejki;
//
//import java.lang.reflect.Array;
//
//public class BlockingArrayQueue implements Queue {
//
//    /* obiekt synchronizujący */
//    private final Object _mutex = new Object();
//
//    /* maksymalny dopuszczalny rozmiar tablicy */
//    private int final _maxSize;
//
//    /* odnośna tablica */
//    private final Array tablica[] = new Array[0];
//
//    /* konstruktor parametry: odnośna kolejka, maksymalny rozmiar kolejki */
//    public BlockingArrayQueue(Array tablica[], int maxSize, Array[] tablica1){
//        assert tablica != null : "nie określono tablicy";
//        assert maxSize > 0 : "maksymalny rozmiar musi być dodatni";
//
//        this.tablica = tablica;
//        _maxSize = maxSize;
//    }
//
//    @Override
//    public void enqueue(Object value) {
//
//    }
//
//    @Override
//    public Object dequeue() throws EmptyQueueException {
//        return null;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//}
