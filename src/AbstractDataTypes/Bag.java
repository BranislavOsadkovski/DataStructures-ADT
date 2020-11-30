package AbstractDataTypes;

public interface Bag<T> {

    void add(T data);

    T any(int index);

    void remove(int index);

    boolean contains(T data);
}
