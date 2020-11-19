package interfaces;

public interface Stack<T> {

      void push(T data);
      T pop() ;
      T peek();
      void show();
      int size() ;
      boolean isEmpty();

}
