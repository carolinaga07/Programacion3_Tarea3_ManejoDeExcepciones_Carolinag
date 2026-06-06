public class Usuario {

    private String Nombre;
    private int Edad;
    private String Correo;
    private double Salario;
   
    public Usuario(String nombre, int edad, String correo, double salario) {
        Nombre = nombre;
        Edad = edad;
        Correo = correo;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }


    public void MostrarInfo(){

        System.out.println("Nombre: "  + getNombre());
        System.out.println("Edad: "    + getEdad());
        System.out.println("Correo: "  + getCorreo());
        System.out.println("Salario: " + getSalario());
    }

    

    
    
}
