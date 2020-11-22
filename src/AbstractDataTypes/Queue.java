package AbstractDataTypes;

public interface Queue<T> {
    boolean isFull();

    void enQueue(T data);

    T deQueue();
}
