package iteratory;

public class IteratorTablicowy implements Iterator {

    private final Object[] tablica;
    private final int pierwszy;
    private final int ostatni;
    private int biezacy = -1;

    public IteratorTablicowy(Object[] tablica) {
        this.tablica = tablica;
        pierwszy = 0;
        ostatni = tablica.length-1;
    }

    @Override
    public void previous() {
        --biezacy;
    }

    @Override
    public void next() {
        ++biezacy;
    }

    @Override
    public void first() {
        biezacy = pierwszy;
    }

    @Override
    public void last() {
        biezacy = ostatni;
    }

    @Override
    public boolean isDone() {
        return biezacy < pierwszy || biezacy > ostatni;
    }

    @Override
    public Object current() {
        return tablica[biezacy];
    }
}
