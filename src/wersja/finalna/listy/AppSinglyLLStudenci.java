package wersja.finalna.listy;

public class AppSinglyLLStudenci {

    public static void main(String[] args) {

        List<Student> listaStudentow = new SinglyLinkedList<>();

        Student adam = new Student("Adam", 156784);
        Student ania = new Student("Anna", 457154);
        Student olek = new Student("Aleksander", 265496);
        Student asia = new Student("Joanna", 345123);

        listaStudentow.insert(adam);
        listaStudentow.insert(ania);
        listaStudentow.insert(olek);
        listaStudentow.insert(asia);

        listaStudentow.traverseList();

        listaStudentow.remove(olek);

        listaStudentow.traverseList();

    }
}
