package Pila;

public interface IPila {
    void push(int element) throws FullStackException;
    // introduce un elemento en la pila
    int pop() throws EmptyStackException;
    // saca un elemento de la pila
    int peek() throws EmptyStackException;
    // consulta el primer elemento de la cima de la pila
    boolean empty();
    // comprueba si la pila está vacía
    boolean full();
    // comprueba si la pila está llena
    int search(int element);
    // busca un determinado elemento dentro de la pila y devuelve su posición dentro de ella o -1 sino lo encuentra
}
