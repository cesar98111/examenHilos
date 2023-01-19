package pregunta2;

public class HiloComensal extends Thread{

    private Comensal comensal;

    HiloComensal(Comensal comensal){
        this.comensal = comensal;

    }

    public void run (){
        comensal.run();
    }

}
