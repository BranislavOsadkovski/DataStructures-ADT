package structures;

import interfaces.Stack;


@SuppressWarnings({"unchecked", "CStyleArrayDeclaration", "unused"})
public class StackStructure<T> implements Stack<T> {
    private int size;
    Object[] stack;
    int top = 0;

    public StackStructure() {
        stack= new Object[1];
    }

    public StackStructure(int size) {
        this.size = size;
        stack = new Object[size];
    }

    public void push(T data) {
        if (size() == size) {
            expand();
        }
        stack[top] = data;
        top++;
    }

    public static void main(String[] args) {
        StackStructure s = new StackStructure(1);
        s.push(1);
        s.push(2);
        s.push(3);
        s.show();
    }
    private void expand() {
        int length = size();
        Object newStack[] = new Object[size * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        size *= 2;
    }

    public T pop() {
        Object data = null;

        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return (T) data;
    }

    private void shrink() {
        int length = size();
        if (length <= (size / 2) / 2)
            size = size / 2;
        Object newStack[] = new Object[size];
        System.arraycopy(stack, 0, newStack, 0, size);
        stack = newStack;
    }

    public T peek() {
        Object data;
        data = stack[top - 1];
        return (T) data;
    }

    public void show() {
        for (Object t : stack) {
            System.out.println(t);
        }
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

}
