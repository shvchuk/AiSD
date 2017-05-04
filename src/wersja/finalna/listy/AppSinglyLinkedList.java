package wersja.finalna.listy;

public class AppSinglyLinkedList {
    public static void main(String[] args) {

        List<Integer> list = new SinglyLinkedList<>();

        list.insert(50);
        list.insert(60);
        list.insert(70);

        System.out.println(list.size());

        list.traverseList();

        list.remove(60);

        list.traverseList();

        list.insert(80);
        list.insert(90);

        list.traverseList();
    }
}
