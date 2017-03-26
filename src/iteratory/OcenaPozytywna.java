package iteratory;

public class OcenaPozytywna implements Predicate {

    boolean pozytywna;


    @Override
    public boolean accept(Object o) {
        Student s = (Student)o;
        if(pozytywna){

        }
        return false;
    }
}
