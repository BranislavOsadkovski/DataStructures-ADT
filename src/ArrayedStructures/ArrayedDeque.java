package ArrayedStructures;

import AbstractDataTypes.ArrayedStructure;
import AbstractDataTypes.DataStructure;
import AbstractDataTypes.Deque;
import util.StructureIterator;

import java.util.List;

@SuppressWarnings({"unchecked", "unused"})
public class ArrayedDeque<T> implements Deque<T>, DataStructure, ArrayedStructure<T> {

    Object[] queue = new Object[5];
    int size;
    int front;
    int rear;

    @Override
    public void display() {
        System.out.println("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println(queue[front + i]);
        }
        for (Object t : queue) {
            System.out.print(" T:" + t);
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        queue = new Object[5];
    }

    @Override
    public StructureIterator<T> toIterator() {
        return null;
    }

    @Override
    public List<T> toJavaList() {
        return null;
    }

    public boolean isFull() {
        return size() == 5;
    }

    public int size() {
        return size;
    }


    public ArrayedDeque() {

    }

    public ArrayedDeque(int size) {
        queue = new Object[size];
    }

    public void enQueue(T data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size = size + 1;
        }else{
            throw new RuntimeException("ArrayedDeque is full!");
        }
    }

    public T deQueueFront() {
        if (isEmpty()) {
            throw new RuntimeException("ArrayedDeque is empty!");

        }else {
            T data = (T) queue[front];
            front = (front + 1);
            size = size - 1;

            return data;
        }
    }

    public T deQueueRear() {

        if (isEmpty()) {
            throw new RuntimeException("ArrayedDeque is empty!");
        }else{
            T data = (T) queue[rear];
            rear = (rear - 1);
            size = size - 1;
            return data;
        }

    }

    public void deQueBoth() {
        deQueueFront();
        deQueueRear();
    }


}

