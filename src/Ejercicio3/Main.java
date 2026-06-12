import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        try{
            System.out.print("\nDigite su edad: ");
            int edad = leer.nextInt();
            UsuarioService.ValidarEdad(edad);
        }catch(EdadInvalidaException e){
            System.out.print("\n"+e.getMessage());
        }
    }
}
