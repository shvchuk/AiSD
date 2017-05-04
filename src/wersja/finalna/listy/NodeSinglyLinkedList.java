package wersja.finalna.listy;

public class NodeSinglyLinkedList<T extends Comparable<T>> {

    private T data;
    private NodeSinglyLinkedList<T> nextNode;

    public NodeSinglyLinkedList(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeSinglyLinkedList<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeSinglyLinkedList<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
