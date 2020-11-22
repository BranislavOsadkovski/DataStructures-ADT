package AbstractDataTypes;

public interface Deque<T> {

    void enQueue(T data);
    T deQueueFront();
    T deQueueRear();
    void deQueBoth();

}
