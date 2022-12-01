public class Asignatura {
    private String nombre;
    private int semestre;

    public Asignatura(String nombre, int semestre){
        this.nombre = nombre;
        this.semestre = semestre;
    }

    public String getNombre(){
        return nombre;
    }

    public int getSemestre(){
        return semestre;
    }

    public String toString(){
        return getNombre() + " -> Semestre " + getSemestre();
    }
}
