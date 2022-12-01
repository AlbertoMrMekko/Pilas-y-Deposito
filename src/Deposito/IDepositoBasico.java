package Deposito;

public interface IDepositoBasico {
    float meter(int cantidad) throws ExDepositoLleno;
    float sacar(int cantidad) throws ExDepositoVacio;;
    float getContenido();
    float getCapacidad();
}
