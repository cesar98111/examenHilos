package pregunta1;

import java.util.ArrayList;
import java.util.List;

public class Notas {

    final static int TOTAL_CALIFICACIONES = 100000;

    static public List<Integer> notas (){

        List<Integer> calificaciones = new ArrayList<>();

        for(int i=0; i< TOTAL_CALIFICACIONES; i++){
            calificaciones.add((int)(Math.random()*11));

        }

        return calificaciones;

    }
}
