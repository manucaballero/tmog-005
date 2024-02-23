package org.tfoc;

import java.util.Arrays;

/**
 * MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * int param_3 = obj.top()
 * int param_4 = obj.getMin()
 */
public class MinStack {

    private Integer[] stack;
    private int elements;
    private int size;
    public MinStack() {

        size = 10;
        stack = new Integer[size]; //Empezamos la pila con tamaño 10 elementos
        elements = 0;
    }

    public void push(int val) {

        if(elements == size){

            size *= 2;
            stack = Arrays.copyOf(stack, size);
        }

        stack[elements] = val;
        elements++;
    }

    public void pop() {

        //TODO throw error when there are no elements in the stack
        stack[elements - 1] = null;
        elements--;
    }

    public int top() {

        //TODO throw error when there are no elements in the stack
        return stack[elements - 1];
    }

    public int getMin() {

        //TODO throw error when there are no elements in the stack
        return stack[0];
    }

}
