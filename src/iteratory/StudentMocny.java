package iteratory;

public class StudentMocny implements Predicate {


    @Override
    public boolean accept(Object o) {
        Student s = (Student)o;
        return true; //  ?????
    }
}
