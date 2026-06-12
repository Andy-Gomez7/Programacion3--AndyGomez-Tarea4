public class UsuarioService {
    public static void ValidarEdad(int edad) throws EdadInvalidaException{
        if(edad < 18){
            throw new EdadInvalidaException("Error: debe ser mayor de edad");
        }
    }   
}