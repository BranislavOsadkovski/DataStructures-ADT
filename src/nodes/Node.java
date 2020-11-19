package nodes;

public class Node<T> {
    T data;
    Node next;
    Node tail;

    public Node() {
    }

    public Node(T data, Node next){
        this.data=data;
        this.next=next;
    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
