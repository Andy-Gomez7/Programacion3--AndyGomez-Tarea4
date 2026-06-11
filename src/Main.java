public class Main {
    public static void main(String[] args) {
        Hilo archivo1 = new Hilo("archivo 1");
        Hilo archivo2 = new Hilo("archivo 2");
        Hilo archivo3 = new Hilo("archivo 3");

        archivo1.setName("Hilo archivo 1");
        archivo2.setName("Hilo archivo 2");
        archivo3.setName("Hilo archivo 3");
        
        archivo1.start();
        System.out.println();
        archivo2.start();
        System.out.println();
        archivo3.start();
        System.out.println();
    }
}
