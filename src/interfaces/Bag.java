package interfaces;

public interface Bag<T> {

      void insert(T data) ;
      void remove(int index);
      void insertAt(int index, T data);
      void show();
      void insertAtStart(T data) ;
}
