package listy;

public interface List extends Iterable{
    public void insert(int index, Object value) throws IndexOutOfBoundsException;
    public void add(Object value);
    public Object delete(int index) throws IndexOutOfBoundsException;


}
