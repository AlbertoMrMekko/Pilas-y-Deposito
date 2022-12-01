package Deposito;

public class DepositoPeso extends DepositoBasico implements IDepositoPeso{
    private float densidad;

    public DepositoPeso(float capacidad, float densidad){
        super(capacidad);
        this.densidad = densidad;
    }

    public DepositoPeso(float capacidad, float densidad, float contenido){
        super(capacidad,contenido);
        this.densidad = densidad;
    }

    public void setDensidad(float densidad) throws ExDensidad{
        if(densidad > 0 && densidad < 2){
            this.densidad = densidad;
            System.out.println(getPeso());
        }
        else
            throw new ExDensidad("Error: densidad no valida");
    }

    public float getDensidad(){
        return densidad;
    }

    public float getPeso(){
        return densidad*getContenido();
    }
}
