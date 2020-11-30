package ArrayedStructures;

import AbstractDataTypes.ArrayedStructure;
import AbstractDataTypes.Bag;
import AbstractDataTypes.DataStructure;
import util.StructureIterator;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings({"unchecked", "ForLoopReplaceableByForEach"})
public class ArrayedBag<T> implements Bag<T>, DataStructure, ArrayedStructure<T> {

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
    public void add(T data) {

        if (isFull()) {
            throw new RuntimeException("ArrayedBag is full!");

        } else {
            bag[numberOfEntries] = data;
            numberOfEntries++;
        }

    }

    public boolean isFull() {
        return numberOfEntries == bag.length;
    }

    @Override
    public T any(int index) {
        if (isEmpty()) {
            throw new RuntimeException("ArrayedBag is empty.");
        } else {
            return bag[index];
        }
    }

    @Override
    public void remove(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Item not found. There are 0 items!");
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
