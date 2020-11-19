package structures;

import interfaces.Deque;

//In progress
@SuppressWarnings({"unchecked", "unused"})
public class DequeStructure<T>  implements Deque<T> {

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


    public DequeStructure(){

    }

    public DequeStructure(int size){
        queue= new Object[size];
    }

    public void enQueue(T data){
        if(!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size = size + 1;
        }
    }
    public T deQueueFront(){
        if(!isEmpty()) {
            T data = (T) queue[front];
            front = (front + 1);
            size = size - 1;

            return data;
        }
        return null;
    }

    public T deQueueRear(){
        if(!isEmpty()) {
            T data = (T) queue[rear];
            rear = (rear -1);
            size = size - 1;
            return data;
        }
        return null;
    }

    public void deQueBoth(){
        deQueueFront();
        deQueueRear();
    }


}
