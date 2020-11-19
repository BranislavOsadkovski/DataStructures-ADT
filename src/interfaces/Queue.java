package interfaces;

public interface Queue<T> {

    void show();

    boolean isEmpty();

    boolean isFull();

    int getSize();

    void enQueue(T data);

    T deQueue();


}
