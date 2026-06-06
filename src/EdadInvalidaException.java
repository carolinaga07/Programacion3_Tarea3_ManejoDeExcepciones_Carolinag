public class EdadInvalidaException  extends Exception{

    public EdadInvalidaException( String mensaje) {
        super(mensaje);
    }


    public static void Validar(int edad) throws EdadInvalidaException{

        if( edad >= 18 || edad <= 100){

             throw new EdadInvalidaException("La edad debe ser mayor o igual a 18 o menor o igual a 100.");
        }
    }

    
    
}
