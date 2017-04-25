package harris.sortowanie;

public class IntegerComparator implements Comparator {
    @Override
    public int compare(Object left, Object right) {
        assert left != null : "nie określono lewego obiektu";
        return ((Comparable) left).compareTo(right);
    }
}
