package chpater_02.item07;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    /**
     * 메모리 누수 지점
     */
//    public Object pop(){
//        if(size ==0)
//            throw new EmptyStackException();
//        return elements[-size];
//    }

    /**
     * 해당 참조를 다썻을 때 null 처리
     */
    public Object pop(){
        if(size ==0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if(elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
