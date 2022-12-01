package Pila;

import Pila.IPilaG;

import java.util.ArrayList;
import java.util.List;

public class PilaG2<E> implements IPilaG<E> {
    private List<E> pila;

    public PilaG2() {
        pila = new ArrayList<>();
    }

    @Override
    public void push(E elemento) {
        pila.add(elemento);
    }

    @Override
    public E pop() throws EmptyStackException {
        if(empty()){
            throw new EmptyStackException();
        }
        return pila.remove(pila.size()-1);
    }

    @Override
    public E peek() throws EmptyStackException {
        if(empty()){
            throw new EmptyStackException();
        }
        return pila.get(pila.size()-1);
    }
    @Override
    public boolean empty() {
        return pila.isEmpty();
    }

    @Override
    public boolean full() {
        return false;
    }

    @Override
    public int search(E elemento) {
        return pila.indexOf(elemento);
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + pila.toString();
    }
}