import pregunta1.HiloSumatorio;
import pregunta1.Notas;
import pregunta2.Comensal;
import pregunta2.Mesa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        // PRIMERA PREGUNTA DE EXAMEN

        int indiceInicial = 0;

        HiloSumatorio listaHilos [] = new HiloSumatorio[10];
        List<Integer> listaNotas = Notas.notas();

        int totalNotas =0;

        for (int i = 0; i<listaHilos.length ; i++){
            listaHilos[i] = new HiloSumatorio(indiceInicial, i, listaNotas);
            listaHilos[i].start();
            indiceInicial += 10000;
        }
        try{
            for(int i = 0; i< listaHilos.length; i++){
                listaHilos[i].join();
                totalNotas += listaHilos[i].getSumaTotal();

            }

            float media = (float)totalNotas/listaNotas.size();
            media = Math.round(media);
            System.out.println("la media aritmetica es de " + media);


        }catch (InterruptedException e){
            System.out.println(e);
        }


        // EJERCICIO 2 SOBRE MAGDALENAS Y COMENSALES



        Mesa mesaComun = new Mesa();

        Comensal pedro = new Comensal("pedro", mesaComun);
        Thread hiloPedro = new Thread(pedro);
        hiloPedro.setPriority(5);



        Comensal manuel = new Comensal("manuel", mesaComun);
        Thread hiloManuel = new Thread(manuel);
        hiloManuel.setPriority(1);



        Comensal juan = new Comensal("juan" , mesaComun);
        Thread hiloJuan = new Thread(juan);
        hiloJuan.setPriority(10);


        hiloPedro.start();
        hiloManuel.start();
        hiloJuan.start();

    }
}