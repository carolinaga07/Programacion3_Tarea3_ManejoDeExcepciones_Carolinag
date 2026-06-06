public class UsuarioValidarExcepcion {
    
    public static void validarUsuario(String nombre,int edad,String correo,double salario) throws NombreInvalidoException, EdadInvalidaException, CorreoInvalidoException, SalarioInvalidoException{

        NombreInvalidoException.Validar(nombre);
        EdadInvalidaException.Validar(edad);
        CorreoInvalidoException.Validar(correo);
        SalarioInvalidoException.Validar(salario);
    }
}
