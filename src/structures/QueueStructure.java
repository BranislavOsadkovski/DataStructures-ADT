package structures;

import interfaces.Queue;

@SuppressWarnings({"unchecked", "unused"})
public class QueueStructure<T> implements Queue<T> {

    Object[] queue=new Object[5];
    int size;
    int front;
    int rear;

    public void show(){
        System.out.println("Elements: ");
        for(int i = 0;i<size;i++){
            System.out.println(queue[front+i]);
        }
        for(Object t : queue){
            System.out.print(" T:" +t);
        }
    }
    public boolean isEmpty(){
        return getSize()==0;
    }
    public boolean isFull(){
        return getSize()==5;
    }
    public  int getSize(){
        return size;
    }


    public QueueStructure(){

    }

    public QueueStructure(int size){
       queue= new Object[size];
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
            T data = (T) queue[front];
            front = (front + 1) % 5;
            size = size - 1;

            return data;
        }
        return null;
    }


}
