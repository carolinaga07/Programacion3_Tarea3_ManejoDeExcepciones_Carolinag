import java.util.Scanner;

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

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el correo electronico: ");
                    String correo = sc.nextLine();

                    System.out.println("Ingrese el salario mensual: ");
                    double salario = sc.nextDouble();

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
