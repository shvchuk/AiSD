//package listy;
//
//import java.util.Iterator;
//
//public class ArrayList implements List {
//
//    /* domyślny rozmiar początkowy tablicy */
//    private final int DEFAULT_INITIAL_CAPACITY = 16;
//
//    /*początkowy rozmiar tablicy */
//    private final int _inicialCapacity;
//
//    /* tablica przechowująca elementy listy */
//    private Object[] _array;
//
//    /* rzeczywisty rozmiar listy, niezależny od rozmiaru tablicy */
//    private int _size;
//
//    /* domyślny konstruktor */
//    public ArrayList(){
//        this(DEFAULT_INITIAL_CAPACITY);
//    }
//
//    /* konstruktor
//    parametr: początkowy rozmiar tablicy
//     */
//    public ArrayList(int inicialCapacity){
//        assert inicialCapacity > 0 : "Początkowy rozmiar tablicy musi być dodatni";
//         _inicialCapacity = inicialCapacity;
//        clear();
//    }
//
//
//    @Override
//    public void insert(int index, Object value) throws IndexOutOfBoundsException {
//        assert value != null : "Nie można wstawiać wartości pustych";
//
//        if(index < 0 || index > _size){
//            throw new IndexOutOfBoundsException();
//        }
//
//        ensureCapacity(_size + 1);
//
//
//    }
//
//    @Override
//    public void add(Object value) {
//
//    }
//
//    @Override
//    public Object delete(int index) throws IndexOutOfBoundsException {
//        return null;
//    }
//
//    @Override
//    public boolean delete(Object value) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//        _array = new Object[_inicialCapacity];
//        _size = 0;
//    }
//
//    @Override
//    public Object set(int index, Object value) throws IndexOutOfBoundsException {
//        return null;
//    }
//
//    @Override
//    public Object get(int index) throws IndexOutOfBoundsException {
//        return null;
//    }
//
//    @Override
//    public int indexOf(Object value) {
//        return 0;
//    }
//
//    @Override
//    public boolean contains(Object value) {
//        return false;
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
//
//    @Override
//    public Iterator iterator() {
//        return null;
//    }
//}
