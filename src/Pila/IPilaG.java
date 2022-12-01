package Pila;

public interface IPilaG<T> {
    void push(T element) throws FullStackException;
    // introduce un elemento en la pila
    T pop() throws EmptyStackException;
    // saca un elemento de la pila
    T peek() throws EmptyStackException;
    // consulta el primer elemento de la cima de la pila
    boolean empty();
    // comprueba si la pila está vacía
    boolean full();
    // comprueba si la pila está llena
    int search(T element);
    // busca un determinado elemento dentro de la pila y devuelve su posición dentro de ella o -1 sino lo encuentra
}
