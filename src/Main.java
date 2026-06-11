public class Main {
    public static void main(String[] args) {
        HiloCorredor juan = new HiloCorredor("Juan");
        HiloCorredor Pedro = new HiloCorredor("Pedro");
        HiloCorredor Ana = new HiloCorredor("Ana");
        HiloCorredor Carlos = new HiloCorredor("Carlos");

        System.out.println("\nestado de "+juan.getName()+": "+juan.getState());
        System.out.println("\nestado de "+Pedro.getName()+": "+Pedro.getState());
        System.out.println("\nestado de "+Ana.getName()+": "+Ana.getState());
        System.out.println("\nestado de "+Carlos.getName()+": "+Carlos.getState());

        juan.start();
        Pedro.start();
        Ana.start();
        Carlos.start();

        try {
            juan.join();
            Pedro.join();
            Ana.join();
            Carlos.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nestado de "+juan.getName()+": "+juan.getState());
        System.out.println("\nestado de "+Pedro.getName()+": "+Pedro.getState());
        System.out.println("\nestado de "+Ana.getName()+": "+Ana.getState());
        System.out.println("\nestado de "+Carlos.getName()+": "+Carlos.getState());
    }

    public void Descarga(){
        HiloDescarga archivo1 = new HiloDescarga("archivo 1");
        HiloDescarga archivo2 = new HiloDescarga("archivo 2");
        HiloDescarga archivo3 = new HiloDescarga("archivo 3");

        archivo1.start();
        System.out.println();
        archivo2.start();
        System.out.println();
        archivo3.start();
        System.out.println();
    }

    public void Corredores(){
        
    }
}