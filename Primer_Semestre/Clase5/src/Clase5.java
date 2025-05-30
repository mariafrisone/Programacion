import java.util.Scanner;

public class Clase5 {
    public static void main(String[] args) {

         /* Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int numero = scanner.nextInt(); //con esto leo el num del usuario

        //ESTRUCTURA DEL IF ELSE

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {

            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
        scanner.close();//cierra el scanner.

        //CREAR UN MENU INTERACTIVO DONDE EL USUARIO ELIJA UNA OPCION Y MUESTRE UN MENSAJE

        Scanner scanner = new Scanner(System.in);

        //MENU DE OPCIONES

        System.out.println("*Menu de opciones*");
        System.out.println("*1. Saludar");
        System.out.println("2. Mensaje motivacional");
        System.out.println("3. Salir");

        System.out.println("Selecciona una opción: ");
        int opcion = scanner.nextInt();//Leemos la opción del usuario

        //EVALUAMOS LAS OPCIONES CON SWITCH
        switch (opcion){
            case 1:
                System.out.println("Hola, bienvenido");
                break;
            case 2:
                System.out.println("Bro, esto es masivo!");
                break;
            case 3:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Macho, me has dado algo que no entiendo");
        }
        scanner.close();*/

        //IMPRIMIR LOS NUMEROS DEL 1 AL 10 CON UN FOR
        //USAR UN BUCLE PARA CONTAR DEL 1 AL 10

        //   for(int i=1; i<=10; i++){
        //   System.out.println("Numero: " + i);
        //asi muestro cada iteración
        // }

        //USA EL WHILE PARA PEDIR NUMEROS HASTA QUE PONGA 0

/*Scanner scanner=new Scanner(System.in);
int numero;
        System.out.println("Por favor, dame un número y pon 0 para salir");
        numero =scanner.nextInt();

        //mientras que no sea cero, sigue pidiendo
        while (numero!=0){
            System.out.println("Haz introducido: " + numero);
            System.out.println("Introduce otro número: ");
            numero =scanner.nextInt();
        }
        System.out.println("Programa finalizado.");
        scanner.close();*/

        //DO WHILE - PIDE CONTRASEÑA Y NO PUEDE ENTRAR HASTA QUE PONGA JAVA123

        Scanner scanner = new Scanner(System.in);
        String password;

        //bucle do while
      /*  do {
            System.out.println("Produce tu contraseña");
            password = scanner.nextLine();
        } while (!password.equals("java123"));
        System.out.println("Acceso concedido");
        scanner.close();*/
    }
}
