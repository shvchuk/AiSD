package harris.sortowanie;

public final class NaturalComparator implements Comparator {

    public static final NaturalComparator INSTANCE = new NaturalComparator();

    private NaturalComparator(){

    }

    @Override
    public int compare(Object left, Object right) throws ClassCastException{
        assert left != null : "nie określono lewego obiektu";
        return ((Comparable) left).compareTo(right);
    }
}
