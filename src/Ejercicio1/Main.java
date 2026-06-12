public class Main{
    public static void main(String[] args) {
        HiloDescarga archivo1 = new HiloDescarga("archivo 1");
        HiloDescarga archivo2 = new HiloDescarga("archivo 2");
        HiloDescarga archivo3 = new HiloDescarga("archivo 3");

        archivo1.start();
        System.out.println("\n");
        archivo2.start();
        System.out.println("\n");
        archivo3.start();
        System.out.println("\n");
    }
}