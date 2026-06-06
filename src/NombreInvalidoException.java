public class NombreInvalidoException extends Exception {

    public NombreInvalidoException(String mensaje) {
        super(mensaje);
    }

    public static void Validar(String nombre) throws NombreInvalidoException{

        if ( nombre == null || nombre.isEmpty()){

            throw new NombreInvalidoException("El nombre no puede estar vacio.");
        }
        if( nombre.length() < 3){

             throw new NombreInvalidoException("El nombre debe tener al menos 3 caracteres.");
        }
    }

    
    
}
