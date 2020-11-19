package interfaces;

public interface Deque<T> {
      void show();
      boolean isEmpty();
      boolean isFull();
       int getSize();
      void enQueue(T data);
      T deQueueFront();
      T deQueueRear();
      void deQueBoth();



}
