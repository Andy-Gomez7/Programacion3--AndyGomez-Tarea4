import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        calculadora();
    }

    public static void calculadora(){
        Scanner leer = new Scanner(System.in);

        try {
            int resultado = 0, num1, num2, op;
            
            do {
                System.out.print("Ingrese el primer numero: ");
                num1 = leer.nextInt();
                System.out.println("\n");

                System.out.print("Ingrese el segundo numero: ");
                num2 = leer.nextInt();
                System.out.println("\n");

                System.out.print("Ingrese la operacion:\n1-Suma\n2-Resta\n3-Multiplicacion\n4-Division\n ");
                op = leer.nextInt();
                System.out.println("\n");

                switch (op) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("\nResultado: "+ resultado);
                        break;

                    case 2:
                        resultado = num1 - num2;
                        System.out.println("\nResultado: "+ resultado);
                        break;

                    case 3:
                        resultado = num1 * num2;
                        System.out.println("\nResultado: "+ resultado);
                        break;

                    case 4:
                        resultado = num1 / num2;
                        System.out.println("\nResultado: "+ resultado);
                        break;

                    case 5:
                        break;
                
                    default:
                        System.out.println("\nOpcion invalida");
                        break;
                }
            } while (op != 5);    
        
        } catch(ArithmeticException a){
            System.out.println("\nError: no es posible dividir entre 0");

        } catch (InputMismatchException e) {
            System.out.println("\nError: tipo de dato no esperado, se espera un numero como entrada");

        } finally{
            System.out.println("\nProceso finalizado");
        }
        
    }
}