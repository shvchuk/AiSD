package wersja.finalna.listy;

public class SinglyLinkedList<T extends Comparable<T>> implements List<T> {

    private NodeSinglyLinkedList<T> first;
    private int sizeOfList;

    public boolean isEmpty(){
        return first == null;
    }

    @Override
    public void insert(T data) {

        ++this.sizeOfList; // od razu zwiększamy rozmiar listy

        if(isEmpty()) {
            this.first = new NodeSinglyLinkedList<T>(data);
        } else {
            insertDataAtBeginning(data);
        }

    }

    private void insertDataAtBeginning(T data) {
        NodeSinglyLinkedList<T> newNode = new NodeSinglyLinkedList<T>(data);
        newNode.setNextNode(first);
        this.first = newNode;

    }

    @Override
    public void remove(T data) {
        if(isEmpty()) return;

        --this.sizeOfList;

        if(this.first.getData().compareTo(data) == 0){
            this.first = this.first.getNextNode();
        } else {
            remove(data, first, first.getNextNode());
        }

    }

    private void remove(T dataToRemove, NodeSinglyLinkedList<T> previousNode, NodeSinglyLinkedList<T> actualNode) {

        while(actualNode != null){

            if(actualNode.getData().compareTo(dataToRemove) == 0){
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }

            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverseList() {

        if(this.first == null) return;

        NodeSinglyLinkedList<T> actualNode = this.first;

        while(actualNode != null){
            System.out.print(actualNode + " -> ");
            actualNode = actualNode.getNextNode();
        }
        System.out.println();

    }

    @Override
    public int size() {
        return this.sizeOfList;
    }
}
