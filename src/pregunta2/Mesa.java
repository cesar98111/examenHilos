package pregunta2;

public class Mesa {
    private int numeroMagdalenas = 15;

    public Mesa (){

    }

    synchronized public void cogerMagdalena() {
        numeroMagdalenas = numeroMagdalenas-1;
    }

    synchronized public int getNumeroMagdalenas() {
        return numeroMagdalenas;
    }
}
