package pregunta1;

import java.util.List;

public class HiloSumatorio extends Thread {

    private int indiceInicial;
    private int identificador;

    private int sumaTotal = 0;
    private List<Integer> calificaciones;


    public HiloSumatorio (int indiceInicial, int identificador, List<Integer> calificaciones){

        this.indiceInicial = indiceInicial;
        this.identificador = identificador;
        this.calificaciones = calificaciones;


    }

    public void run (){
        int contador = 0;
        for(int i = indiceInicial ; i < indiceInicial + 10000 ; i++){

            this.sumaTotal += this.calificaciones.get(i);
            contador ++;
        }
        System.out.println("el hilo "+ this.identificador +", que empezó en el indice "+
                this.indiceInicial + "y a contado " + contador + " calificaciones, ha sumado un total de: "
                +this.sumaTotal);
    }

    public int getIndiceInicial() {
        return indiceInicial;
    }

    public void setIndiceInicial(int indiceInicial) {
        this.indiceInicial = indiceInicial;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getSumaTotal(){
        return sumaTotal;
    }
}
