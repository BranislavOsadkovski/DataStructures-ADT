package ArrayedStructures;

import AbstractDataTypes.ArrayedStructure;
import AbstractDataTypes.Bag;
import AbstractDataTypes.DataStructure;
import util.StructureIterator;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings({"unchecked", "ForLoopReplaceableByForEach"})
public class ArrayedBag<T> implements Bag<T>, DataStructure, ArrayedStructure {

    private static final int DEFAULT_CAPACITY = 25;
    private T[] bag;
    private int numberOfEntries;

    public ArrayedBag() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayedBag(int size) {
        numberOfEntries = 0;
        bag = (T[]) new Object[size];
    }

    @Override
    public boolean add(T data) {
        boolean result = true;
        if (isFull()) {
            result = false;
        } else {
            bag[numberOfEntries] = data;
            numberOfEntries++;
        }
        return result;
    }

    public boolean isFull() {
        return numberOfEntries == bag.length;
    }

    @Override
    public T any(int index) {
        if (isEmpty()) {
            throw new RuntimeException("Bag is empty.");
        } else {
            return bag[index];
        }
    }

    @Override
    public void remove(int index) {
        if (isEmpty()) {
            throw new RuntimeException("Bag is Empty. No item to remove!");
        } else {
            bag[index] = null;
            numberOfEntries--;
        }
    }

    @Override
    public boolean contains(T data) {
        for (int i = 0; i < bag.length; i++) {
            if (data == bag[i]) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void display() {
        Arrays.stream(bag).forEach(System.out::println);
    }

    @Override
    public int size() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public void clear() {
        bag = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public StructureIterator<T> toIterator() {
        return null;
    }

    @Override
    public List<T> toJavaList() {
        return null;
    }

}
