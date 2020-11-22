package ArrayedStructures;

import AbstractDataTypes.ArrayedStructure;
import AbstractDataTypes.DataStructure;
import AbstractDataTypes.Stack;
import util.StructureIterator;

import java.util.List;


@SuppressWarnings({"unchecked", "CStyleArrayDeclaration", "unused"})
public class ArrayedStack<T> implements Stack<T>, DataStructure, ArrayedStructure {
    private int size;
    T[] stack;
    int top = 0;

    public ArrayedStack() {
        stack = (T[]) new Object[1];
    }

    public void clear() {
        stack = (T[]) new Object[1];
    }

    @Override
    public StructureIterator<T> toIterator() {

        return new StructureIterator<>() {
            @Override
            public T next() {
                return null;
            }

            @Override
            public boolean hasNext() {
                return false;
            }
        };
    }

    @Override
    public List<T> toJavaList() {
        return null;
    }

    public ArrayedStack(int size) {
        this.size = size;
        stack = (T[]) new Object[size];
    }

    public void push(T data) {
        if (size() == size) {
            expand();
        }
        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        T newStack[] = (T[]) new Object[size * 2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        size *= 2;
    }

    public T pop() {
        T data = null;

        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = null;
            shrink();
        }
        return data;
    }

    private void shrink() {
        int length = size();
        if (length <= (size / 2) / 2)
            size = size / 2;
        T newStack[] = (T[]) new Object[size];
        System.arraycopy(stack, 0, newStack, 0, size);
        stack = newStack;
    }

    public T peek() {
        T data;
        data = stack[top - 1];
        return  data;
    }

    public void display() {
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

    @Override
    public boolean isFull() {
        return top==stack.length;
    }

}
