package Pila;

import Pila.IPilaG;

import java.util.ArrayList;
import java.util.List;

public class PilaG3 implements IPilaG<Integer> {
    private List<Integer> pila;

    public PilaG3() {
        pila = new ArrayList<>();
    }

    @Override
    public void push(Integer elemento) {
        pila.add(elemento);
    }

    @Override
    public Integer pop() throws EmptyStackException {
        if(empty()){
            throw new EmptyStackException();
        }
        return pila.remove(pila.size()-1);
    }

    @Override
    public Integer peek() throws EmptyStackException {
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
    public int search(Integer elemento) {
        return pila.indexOf(elemento);
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + pila.toString();
    }
}
