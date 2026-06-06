public class CorreoInvalidoException extends Exception {

    public CorreoInvalidoException(String mensaje) {
        super(mensaje);
    }

    public static void Validar(String correo) throws CorreoInvalidoException{

        if(!correo.contains("@") || !correo.contains(".")){

            throw new CorreoInvalidoException("El correo no tiene el formato correcto.");
        }
    }
    
    

}
