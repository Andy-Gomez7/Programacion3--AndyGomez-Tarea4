public class HiloCorredor extends Thread{
    private static boolean ganador = true; 

    public HiloCorredor(String Nombre){
        setName(Nombre);
    }

    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("\n"+getName()+" avanzo al metro "+i);
            
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        if(ganador){
            ganador = false;    
            System.out.println("\nEl ganador es: "+getName());
        }
        else{
            System.out.println("\n"+getName()+" llego a la meta");
        }
    }
}