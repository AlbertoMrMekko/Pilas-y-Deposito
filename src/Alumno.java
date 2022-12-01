public class Alumno {
    private String matricula;
    private int creditos;

    public Alumno(String matricula){
        this.matricula = matricula;
        creditos = 0;
    }

    public int getCreditos(){
        return creditos;
    }

    public String getMatricula(){
        return matricula;
    }

    public void actualizarCreditos(int creditos) throws ExCreditosNegativos{
        try{
            actualizarCreditosAux(creditos);
        }catch (ExCreditosNegativos ex){
            System.out.println("<<< " + ex.getMessage() + " >>>");
            actualizarCreditos(creditos * (-1));
        }
    }

    private void actualizarCreditosAux(int creditos) throws ExCreditosNegativos{
        if(creditos < 0)
            throw new ExCreditosNegativos("Error");
        else
            this.creditos += creditos;
    }

    public String toString(){
        return "MATRICULA: " + getMatricula() + "; CREDITOS: " + getCreditos();
    }
}
