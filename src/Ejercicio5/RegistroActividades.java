import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroActividades {
    private File archivo;
    private Scanner scan;

    public RegistroActividades(){
        try {
            archivo = new File("Actividades.txt");   
        } catch (Exception e) {
            e.getStackTrace();
        }
        scan = new Scanner(System.in);
    }

    public void Registrar(){
        
        try {
            FileWriter write = new FileWriter(archivo, true);
            BufferedWriter bufwrite = new BufferedWriter(write);
            String actividad;

            if(archivo.exists()){
                scan.nextLine();
                System.out.print("Ingrese una actividad: ");
                actividad = scan.nextLine();
                bufwrite.write(actividad);
                bufwrite.newLine();
            }
            else{
                System.out.print("Error, el archivo no abrio");
            }

            bufwrite.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        
    }

    public void Mostrar(){
        try{
            FileReader leer = new FileReader(archivo);
            BufferedReader bufleer = new BufferedReader(leer);

            String linea;

            while((linea = bufleer.readLine()) != null){
                System.out.println(linea);
            }
            
            bufleer.close();
        }catch(IOException e) {
            e.getStackTrace();
        }
        
    }

    public void Menu(){
        int op;

        do {
            System.out.println("\nDigite:\n1-Registrar actividad\n2-Mostrar actividades\n3-Salir");
            op = scan.nextInt();
            System.out.println();

            switch (op) {
                case 1:
                    Registrar();
                    break;

                case 2:
                    Mostrar();
                    break;

                case 3:
                    System.out.print("Tenga un feliz dia");
                    break;
            
                default:
                    break;
            }
        } while (op != 3);
    }   
}