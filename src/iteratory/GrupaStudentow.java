package iteratory;

public class GrupaStudentow {

    public static void main(String[] args) throws Exception {
        Student[] s = new Student[6];
        s[0] = new Student(112340, "Kowalski", "Jan", 3.5);
        s[1] = new Student(112341, "Morawiecki", "Mateusz", 4.00);
        s[2] = new Student(112342, "Wiszniewski", "Piotr", 4.5);
        s[3] = new Student(112343, "Biernacka", "Katarzyna", 5.00);
        s[4] = new Student(112344, "Malczewski", "Piot", 4.5);
        s[5] = new Student(112345, "Miszcz", "Programowania", 2.00);

        double brakZaliczenia = 2.00;

        IteratorTablicowy itab = new IteratorTablicowy(s);

        // wyświetlenie pełnej listy studentów
        for(itab.first(); !itab.isDone(); itab.next()){
            Student st = (Student)itab.current();
            //st.toString();
            System.out.println(st);

            //System.out.println((Student)itab.current());
        }
        System.out.println("Nowy iterator");
        Iterator is = new IteratorFiltrujacy(itab, new NumerIndeksu(112340));
        for(is.first(); !is.isDone(); is.next()) {
            Student st = (Student) is.current();
            System.out.println(st);
        }

        System.out.println("");


//        // wpisanie oceny z kursu dla wskazanego nr indeksu
//        for(itab.first(); !itab.isDone(); itab.next()){
//            Student st = (Student)itab.current();
//            if(st.getNumerIndeksu() == 112340){
//                st.setOcenaASD(4.5);
//                System.out.println(st);
//            }
//        }

        // wpisanie oceny z kursu dla wskazanego nr indeksu przy użycie Iteratora Filtrującego po numerach indeksu
        NumerIndeksu itabNumerIndeksu = new NumerIndeksu(112340);

        
        // wyliczenie średniej arytmetycznej ocen wszystkich studentów
        double sumaOcen = 0;
        int licznik = 0;
        for(itab.first(); !itab.isDone(); itab.next()){
            Student st = (Student)itab.current();
            if(st.getOcenaASD() != brakZaliczenia) {
                sumaOcen += st.getOcenaASD();
                licznik++;
            }
        }
        System.out.println("Srednia ocena studentów, którzy zaliczyli: " + sumaOcen/licznik);
        System.out.println();

        // wyświetlenie listy studentów, którzy nie zaliczyli kursu

        for(itab.first(); !itab.isDone(); itab.next()){
            Student st = (Student)itab.current();
            if(st.getOcenaASD() == brakZaliczenia){
                System.out.println("Studenci, którzy nie zaliczyli kursu: ");
                System.out.println(st);
            }
        }

        System.out.println();

        // dopisanie nowego studenta do tablicy

        Student nowyStudent = new Student(112346, "Żelazny", "Robet", 3.5);
        Student[] nowaGrupa = new Student[s.length + 1];

        int indexTablicy = 0;

        for(itab.first(); !itab.isDone(); itab.next()){
            Student st = (Student)itab.current();
            nowaGrupa[indexTablicy] = st;
            indexTablicy++;
        }
        nowaGrupa[nowaGrupa.length - 1] = nowyStudent;

        s = nowaGrupa;

        IteratorTablicowy itabNowaGrupa = new IteratorTablicowy(s);

        for(itabNowaGrupa.first(); !itabNowaGrupa.isDone(); itabNowaGrupa.next()){
            Student st = (Student)itabNowaGrupa.current();
            //st.toString();
            System.out.println(st);

            //System.out.println((Student)itab.current());
        }

        Predicate p = new StudentMocny();
        Iterator i1 = new IteratorFiltrujacy(itabNowaGrupa, p);


//

    }
}
