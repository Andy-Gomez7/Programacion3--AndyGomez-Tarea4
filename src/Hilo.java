public class Hilo extends Thread{
    private String nombre;

    public Hilo(String Nombre){
        nombre = Nombre;
    }

    @Override
    public void run(){
        System.out.println("Descargando "+nombre+"...");

        for(int i = 1; i <= 10; i++){
            System.out.println(nombre+" "+i+"%");
            System.out.println("\n"+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(nombre+"Completado.");
    }
}