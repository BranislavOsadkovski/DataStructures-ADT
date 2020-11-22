package ArrayedStructures;


import AbstractDataTypes.ArrayedStructure;
import AbstractDataTypes.DataStructure;
import AbstractDataTypes.Queue;
import util.StructureIterator;


import java.util.List;

@SuppressWarnings({"unchecked", "unused"})
public class ArrayedQueue<T> implements Queue<T>, DataStructure, ArrayedStructure {


    private static final int capacity = 5;
    T[] queue;
    private int size;
    private int front;
    private int rear;

    @Override
    public void display(){
        System.out.println("Elements: ");
        for(int i = 0;i<size;i++){
            System.out.println(queue[front+i]);
        }
        for(Object t : queue){
            System.out.print(" T:" +t);
        }
    }
    public boolean isEmpty(){
        return size()==0;
    }

    @Override
    public void clear() {
        queue= (T[])new Object[5];
    }

    @Override
    public StructureIterator<T> toIterator() {
        return null;
    }

    @Override
    public List<T> toJavaList() {
        return null;
    }

    public boolean isFull(){
        return size()==capacity;
    }

    public int size(){
        return this.size;
    }


    public ArrayedQueue(){
        this(capacity);
    }

    public ArrayedQueue(int capacity){
       queue= (T[]) new Object[capacity];
    }

    public void enQueue(T data){
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size = size + 1;
        }
    }
    public T deQueue(){
        if(!isEmpty()) {
            T data = queue[front];
            front = (front + 1) % 5;
            size = size - 1;

            return data;
        }
        return null;
    }


}
