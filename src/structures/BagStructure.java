package structures;

import interfaces.Bag;
import nodes.Node;

@SuppressWarnings({"rawtypes", "unchecked"})
public class  BagStructure<T> implements Bag<T>{
    Node head;
    public void insert(T data) {

        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(node);
        }
    }
    public void remove(int index){
        if(index==0){
            head= head.getNext();
        }else{
            Node n = head;
            Node n1;

            for(int i=0;i<index-1;i++){
                n=n.getNext();
            }
            n1=n.getNext();
            n.setNext(n1.getNext());
        }
    }
    public void insertAt(int index, T data) {
        Node node = new Node(data);
        Node n = head;

        if(index==0){
            insertAtStart(data);
        }else {

            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }
            node.setNext(n.getNext());
            n.setNext(node);
        }
    }

    public void show() {
        Node node = head;
        if (node == null) {
            System.out.println("Empty!");
        }
        if (node != null) {
            while (node.getNext() != null) {

                node = node.getNext();
            }
        }
    }

    public void insertAtStart(T data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        head = node;
    }

}
