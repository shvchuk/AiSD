package iteratory;

public class NumerIndeksu implements Predicate {

    int numerIndeksu;

    public NumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }


    @Override
    public boolean accept(Object o) {
        Student s = (Student)o;
        return s.getNumerIndeksu() == numerIndeksu;
    }
}
