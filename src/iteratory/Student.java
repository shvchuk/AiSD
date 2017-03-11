package iteratory;

public class Student {
    int numerIndeksu;
    String nazwisko;
    String imie;
    double ocenaASD;

    public Student(int numerIndeksu, String nazwisko, String imie, double ocenaASD) {
        this.numerIndeksu = numerIndeksu;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.ocenaASD = ocenaASD;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numerIndeksu=" + numerIndeksu +
                ", nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                ", ocenaASD=" + ocenaASD +
                '}';
    }

    public void setOcenaASD(double ocenaASD) {
        this.ocenaASD = ocenaASD;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public double getOcenaASD() {
        return ocenaASD;
    }
}
