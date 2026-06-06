public class SalarioInvalidoException extends Exception {

    public SalarioInvalidoException(String mensaje) {
        super(mensaje);
    }

    public static void Validar(double salario) throws SalarioInvalidoException{

        if(salario == 0){

            throw new SalarioInvalidoException("El salario debe ser mayor a 0.");
        }
    }
    
}
