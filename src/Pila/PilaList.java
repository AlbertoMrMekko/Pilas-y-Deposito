package Pila;

import Pila.IPila;

import java.util.ArrayList;
import java.util.List;

public class PilaList implements IPila {
    private List<Integer> pila;

    public PilaList(){
        // capacidad inicial no tamaño
        pila = new ArrayList<>(10);
    }

    @Override
    public void push(int elemento) {
        /**
         *   Cuando la matriz interna está llena, ArrayList necesita asignar la nueva matriz con más capacidad,
         *   copiar los elementos existentes a la nueva matriz y desasignar la matriz existente.
         *   No se especifican los detalles exactos del nuevo cálculo de capacidad, pero normalmente se calcula
         *   como se indica a continuación:
         *       nuevaCapacidad = (viejaCapacidad * 3)/2 + 1
         *   Es decir, un 150% de la capacidad existente más 1.
         *   Por ejemplo, si la capacidad de ArrayList es 10 y se le agrega el undécimo elemento,
         *   la nueva matriz interna se creará con un tamaño de (10 * 3) / 2 + 1 que es 16.
         */
        pila.add(elemento);
    }

    @Override
    public int pop() throws EmptyStackException {
        if(empty()){
            throw new EmptyStackException();
        }
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
        return false;
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

