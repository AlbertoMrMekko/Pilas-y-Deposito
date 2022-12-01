package Pila;

import Pila.IPila;

import java.util.Arrays;

public class PilaArray implements IPila {
    private int[] pila;
    private int top = -1;

    public PilaArray(int capacidad){
        pila = new int[capacidad];
    }

    public PilaArray(){
        this(10);
    }

    @Override
    public void push(int elemento) throws FullStackException {
        if(full()){
            throw new FullStackException();
        }
        pila[++top] = elemento;
    }

    @Override
    public int pop() throws EmptyStackException {
        if(empty()){
            throw new EmptyStackException();
        }
        return pila[top--];
    }

    @Override
    public int peek() throws EmptyStackException {
        if(empty()){
            throw new EmptyStackException();
        }
        return pila[top];
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public boolean full() {
        return top == pila.length-1;
    }

    @Override
    public int search(int elemento) {
        for(int i=0; i<top; i++){
            if(pila[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + Arrays.toString(pila);
    }
}
