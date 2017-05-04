package wersja.finalna.listy;

public class Student implements Comparable<Student> {

    private String name;
    private int nrIndeksu;

    public Student(String name, int nrIndeksu) {
        this.name = name;
        this.nrIndeksu = nrIndeksu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nrIndeksu=" + nrIndeksu +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.nrIndeksu, student.getNrIndeksu());
    }
}
