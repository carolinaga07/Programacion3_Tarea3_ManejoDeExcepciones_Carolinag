import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int opcion;

        do{

            System.out.println("============================");
            System.out.println("      REGISTRAR USUARIO     ");
            System.out.println("============================");
            System.out.println("   1. Registrar usuario");
            System.out.println("   2. salir");
            System.out.println("============================");
            System.out.println("  Elige una opcion: ");

            try{
                opcion = sc.nextInt();
                sc.nextLine();

            }catch(InputMismatchException e){
                System.out.println("Error debe ingresar un numero valido");
                sc.nextLine();
                opcion = 0;
                continue;
            }

            switch (opcion) {
                case 1:
                    try{
                        System.out.println("Ingrese el nombre: ");
                        String nombre = sc.nextLine();

                        System.out.println("Ingrese la edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese el correo electronico: ");
                        String correo = sc.nextLine();

                        System.out.println("Ingrese el salario mensual: ");
                        double salario = sc.nextDouble();
                        sc.nextLine();

                        UsuarioValidarExcepcion.validarUsuario(nombre, edad, correo, salario);

                        Usuario user = new Usuario(nombre, edad, correo, salario);
                        System.out.println("USUARIO REGISTRADO DE MANERA CORRECTA");

                    } catch(NombreInvalidoException n){
                        System.out.println("Error: " + n.getMessage());

                    }catch(EdadInvalidaException e){
                        System.out.println("Error: " + e.getMessage());

                    }catch(CorreoInvalidoException c){
                        System.out.println("Error: " + c.getMessage());

                    }catch(SalarioInvalidoException s){
                        System.out.println("Error: " + s.getMessage());

                    }catch(InputMismatchException i){
                        System.out.println("Error: se debe ingresar un numero valido");
                        sc.nextLine();
                    }finally{
                        System.out.println("Final....");
                    }

                    break;

                case 2:
                    System.out.println("Saliendo... ");
                    break;
                    
                default:
                    System.out.println("El numero no se encuentra dentro de las opciones ");
                    break;
            }
        }while (opcion != 2);
    }
    
}
