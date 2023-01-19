package pregunta2;

public class Comensal implements Runnable{

    private String nombre;
    private Mesa mesa;

    public Comensal(String nombre, Mesa mesa){
        this.nombre = nombre;
        this.mesa = mesa;


    }

    public void run (){
        try{
            while (this.mesa.getNumeroMagdalenas() != 0){
                mesa.cogerMagdalena();
                System.out.println(this.nombre +" ha cogido una magdalena ");
                Thread.sleep(10000);
                System.out.println(this.nombre + " se ha terminado de comer una magdalena");
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }


    }

}
