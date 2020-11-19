package interfaces;

public interface Bag<T> {

    public void insert(T data) ;
    public void remove(int index);
    public void insertAt(int index, T data);
    public void show();
    public void insertAtStart(T data) ;
}
