public class HiloDescarga extends Thread{

    public HiloDescarga(String Nombre){
        setName(Nombre);
    }

    @Override
    public void run(){
        System.out.println("Descargando "+getName()+"...");

        for(int i = 1; i <= 10; i++){
            System.out.println(getName()+" "+i+"%");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(getName()+"Completado.");
    }
}