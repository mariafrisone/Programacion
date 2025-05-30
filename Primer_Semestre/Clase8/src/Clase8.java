import java.util.InputMismatchException;
import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {

        //EJEMPLO DE EXCEPCIONES
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Saludar\n2.Salir");

        System.out.println("Elige una opción");

        try {
            int opcion = sc.nextInt();

            int resultado = 5 / opcion;

            switch (opcion) {
                case 1 -> System.out.println("Hola");
                case 2 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción incorrecta");
            }
        } catch (InputMismatchException e) {
            System.out.println("Debes de escribir un número");
        } catch (ArithmeticException e){
            System.out.println("División por cero");
        } finally {
            System.out.println("Fin");
        }
        sc.close();
    }
}
