package Pila;

import Pila.IPila;

import java.util.ArrayList;
import java.util.List;

/**
 *   Lectura interesante
 *   https://medium.com/@malith.jayasinghe/a-performance-evaluation-of-java-arraylist-f097582b5c4d
 */

public class PilaListC implements IPila {
    private List<Integer> pila;
    private int capacidad;

    public PilaListC(int capacidad){
        // capacidad inicial no tamaño
        pila = new ArrayList<>(capacidad);
        this.capacidad = capacidad;
    }

    public PilaListC(){
        this(10);
    }

    @Override
    public void push(int elemento) throws FullStackException {
        if(full()){
            throw new FullStackException();
        }
        pila.add(elemento);
        capacidad--;
    }

    @Override
    public int pop() throws EmptyStackException {
        if(empty()){
            throw new EmptyStackException();
        }
        capacidad++;
        return pila.remove(pila.size()-1);
    }

    @Override
    public int peek() throws EmptyStackException {
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
        return capacidad == 0;
    }

    @Override
    public int search(int elemento) {
        return pila.indexOf(elemento);
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + pila.toString();
    }
}
