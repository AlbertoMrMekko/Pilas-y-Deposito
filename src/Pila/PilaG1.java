package Pila;

import Pila.IPilaG;

import java.util.ArrayList;
import java.util.List;

public class PilaG1 implements IPilaG {
    private List<Object> pila;

    public PilaG1() {
        pila = new ArrayList<>();
    }

    @Override
    public void push(Object elemento) {
        pila.add(elemento);
    }

    @Override
    public Object pop() throws EmptyStackException {
        if(empty()){
            throw new EmptyStackException();
        }
        return pila.remove(pila.size()-1);
    }

    @Override
    public Object peek() throws EmptyStackException {
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
    public int search(Object elemento) {
        return pila.indexOf(elemento);
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + pila.toString();
    }
}

