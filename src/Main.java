import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ExCreditosNegativos {
        Alumno a1 = new Alumno("bq0001");
        Alumno a2 = new Alumno("bq0002");
        Alumno a3 = new Alumno("bq0003");
        Alumno a4 = new Alumno("bq0004");
        Alumno a5 = new Alumno("bq0005");
        Alumno a6 = new Alumno("bq0006");
        a1.actualizarCreditos(20);
        a2.actualizarCreditos(-2);
        a3.actualizarCreditos(9);
        a4.actualizarCreditos(12);
        a5.actualizarCreditos(3);
        a6.actualizarCreditos(-6);
        a6.actualizarCreditos(-9);
        HashMap<String,Alumno> hashMap = new HashMap<>();
        hashMap.put(a1.getMatricula(),a1);
        hashMap.put(a2.getMatricula(),a2);
        hashMap.put(a3.getMatricula(),a3);
        hashMap.put(a4.getMatricula(),a4);
        hashMap.put(a5.getMatricula(),a5);
        hashMap.put(a6.getMatricula(),a6);
        System.out.println(hashMap.get(a6.getMatricula()).getCreditos());
        Alumno a;
        Iterator<Map.Entry<String,Alumno>> it = hashMap.entrySet().iterator();
        while(it.hasNext()){
            //System.out.println(it.next().getValue().getCreditos());
            a = it.next().getValue();
            System.out.println(a.toString());
        }

        Asignatura s1 = new Asignatura("BD",3);
        Asignatura s2 = new Asignatura("TP",1);
        Asignatura s3 = new Asignatura("FC",1);
        Asignatura s4 = new Asignatura("AM",1);
        Asignatura s5 = new Asignatura("FI",2);
        Asignatura s6 = new Asignatura("ED",2);
        Asignatura s7 = new Asignatura("AC",3);
        ArrayList<Asignatura> array1 = new ArrayList<>();
        array1.add(s2);
        array1.add(s3);
        array1.add(s4);
        ArrayList<Asignatura> array2 = new ArrayList<>();
        array2.add(s5);
        array2.add(s6);
        ArrayList<Asignatura> array3 = new ArrayList<>();
        array3.add(s1);
        array3.add(s7);
        Map<Alumno, ArrayList<Asignatura>> subjects = new HashMap<>();
        subjects.put(a1,array1);
        subjects.put(a2,array2);
        subjects.put(a3,array3);
        Iterator<Map.Entry<Alumno,ArrayList<Asignatura>>> it2 = subjects.entrySet().iterator();
        while(it2.hasNext()){
            System.out.println(it2.next().getValue().toString());
        }
    }
}
