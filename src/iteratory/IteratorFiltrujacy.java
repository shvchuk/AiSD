package iteratory;


public class IteratorFiltrujacy implements Iterator {

    private final Iterator iterf;
    private final Predicate pred;

    public IteratorFiltrujacy(Iterator iterf, Predicate pred) {
        this.iterf = iterf;
        this.pred = pred;
        iterf.first();

    }

    public void filtrujDoPrzodu() throws Exception {
        while (!iterf.isDone() && !pred.accept(iterf.current()) )
            iterf.next();
    }

    public void filtrujDoTylu() throws Exception {
        while (!iterf.isDone() && !pred.accept( iterf.current()) )
            iterf.previous();
    }

    @Override
    public void previous() {
        iterf.previous();
        try {
            filtrujDoTylu();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void next() {
        iterf.next();
        try {
            filtrujDoPrzodu();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void first() {
        iterf.first();
        try {
            filtrujDoPrzodu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void last() {
        iterf.last();
        try {
            filtrujDoTylu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isDone() {
        return iterf.isDone();
    }

    @Override
    public Object current() throws Exception {
        return iterf.current();
    }
}
