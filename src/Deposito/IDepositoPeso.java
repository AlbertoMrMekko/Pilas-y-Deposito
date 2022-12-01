package Deposito;
public interface IDepositoPeso extends IDepositoBasico {
    void setDensidad(float densidad) throws ExDensidad;
    float getDensidad();
    float getPeso();
}
