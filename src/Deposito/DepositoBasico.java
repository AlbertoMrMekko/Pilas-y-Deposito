package Deposito;

public class DepositoBasico implements IDepositoBasico{
    private float capacidad;
    private float contenido;
    public static final int VALOR = 0;

    public DepositoBasico(float capacidad){
        this.capacidad = capacidad;
        contenido = 0;
    }

    public DepositoBasico(float capacidad, float contenido){
        this(capacidad);
        this.contenido = contenido;
    }

    public float meter(int cantidad) throws ExDepositoLleno{
        if(contenido + cantidad > capacidad)
            throw new ExDepositoLleno("Error: deposito lleno.");
        else
            return this.contenido += cantidad;
    }

    public float sacar(int cantidad) throws ExDepositoVacio{
        if(contenido - cantidad < 0)
            throw new ExDepositoVacio("Error: deposito vacio.");
        else
            return this.contenido -= cantidad;
    }

    public float getCapacidad(){
        return capacidad;
    }

    public float getContenido(){
        return contenido;
    }

    public String toString(){
        return getClass().getName() + " -> Capacidad = " + this.getCapacidad() + "; Contenido actual = " + this.getContenido();
    }

}
