package AbstractDataTypes;

public interface Bag<T> {

    boolean add(T data);

    T any(int index);

    void remove(int index);

    boolean contains(T data);
}
