package iteratory;

public class GrupaStudentow {

    public static void main(String[] args) {
        Student[] s = new Student[6];
        s[0] = new Student(112340, "Kowalski", "Jan", 3.5);
        s[1] = new Student(112341, "Morawiecki", "Mateusz", 4.00);
        s[2] = new Student(112342, "Wiszniewski", "Piotr", 4.5);
        s[3] = new Student(112343, "Biernacka", "Katarzyna", 5.00);
        s[4] = new Student(112344, "Malczewski", "Piot", 4.5);
        s[5] = new Student(112345, "Miszcz", "Programowania", 2.00);


        IteratorTablicowy itab = new IteratorTablicowy(s);

        // wyświetlenie pełnej listy studentów
        for(itab.first(); !itab.isDone(); itab.next()){
            Student st = (Student)itab.current();
            //st.toString();
            System.out.println(st);

            //System.out.println((Student)itab.current());
        }

        // wpisanie oceny z kursu dla wskazanego nr indeksu
        for(itab.first(); !itab.isDone(); itab.next()){
            Student st = (Student)itab.current();
            if(st.getNumerIndeksu() == 112340){
                st.setOcenaASD(4.5);
                System.out.println(st);
            }
        }
        
        // wyliczenie średniej arytmetycznej ocen wszystkich studentów
        double sumaOcen = 0;
        int licznik = 0;
        for(itab.first(); !itab.isDone(); itab.next()){
            Student st = (Student)itab.current();
            sumaOcen += st.getOcenaASD();
            licznik++;
        }
        System.out.println("Srednia ocena studentów: " + sumaOcen/licznik);
        System.out.println();

        // wyświetlenie listy studentów, którzy nie zaliczyli kursu
        double brakZaliczenia = 2.00;
        for(itab.first(); !itab.isDone(); itab.next()){
            Student st = (Student)itab.current();
            if(st.getOcenaASD() == 2.00){
                System.out.println("Studenci, którzy nie zaliczyli kursu: ");
                System.out.println(st);
            }
        }

    }
}
