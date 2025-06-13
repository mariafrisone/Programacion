//Instrucción: Añade try-catch-finally
// para evitar que el programa falle si
// el divisor es cero o si se introduce texto.

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Ejercicios8 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        try{
//            System.out.print("Introduce el dividendo: ");
//            int a = sc.nextInt();
//
//            System.out.print("Introduce el divisor: ");
//            int b = sc.nextInt();
//
//            int resultado = a / b;
//            System.out.println("Resultado: " + resultado);
//
//        }catch (InputMismatchException e){
//            System.out.println("Debes escribir un número");
//        }catch (ArithmeticException e){
//            System.out.println("No puede ser divisible por 0");
//        }finally {
//            System.out.println("Finalizado");
//        }
//
//        sc.close();


        //Instrucción: Añade un bloque try-catch para evitar
        // que el programa se rompa si el usuario escribe letras.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Escribe un número (en texto): ");
//        String texto = sc.nextLine();
//
//        try {
//            int numero = Integer.parseInt(texto);
//            System.out.println("Número x 10: " + (numero * 10));
//
//        }catch (NumberFormatException e){
//            System.out.println("Tienes que escribir números");
//        }finally {
//            System.out.println("Finalizado");
//        }
//        sc.close();

        //Instrucción: Usa try-catch para evitar error
        // si se ingresa una posición incorrecta (como 5 o -1).

//        String[] frutas = {"Manzana", "Banana", "Naranja"};
//
//        Scanner sc = new Scanner(System.in);
//
//        try {
//        System.out.print("Introduce un número entre 0 y 2: ");
//        int posicion = sc.nextInt();
//            if(posicion!=0 || posicion!= 1 || posicion!=2){
//           System.out.println("Fruta seleccionada: " + frutas[posicion]);
//       }
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("No es correcta la posición");
//        }finally {
//            System.out.println("Finalizado");
//        }
//        sc.close();

        //Instrucción: Añade manejo de NumberFormatException y
        // un finally que diga: "Juego finalizado."

//        Random random = new Random();
//        int secreto = random.nextInt(10) + 1;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Adivina el número (1-10): ");
//
//        try {
//            String intentoTexto = sc.nextLine();
//
//            int intento = Integer.parseInt(intentoTexto);
//
//            if (intento == secreto) {
//                System.out.println("¡Correcto!");
//            } else {
//                System.out.println("Incorrecto. El número era: " + secreto);
//            }
//        }catch (NumberFormatException e){
//            System.out.println("Debes escribir un número");
//        }finally {
//            System.out.println("Juego finalizado");
//        }
//            sc.close();

        //Instrucción: Usa try-catch para evitar que el programa se detenga si nombre es null.

        try {
            String nombre = null;

            System.out.println("La longitud del nombre es: " + nombre.length());
        }catch (NullPointerException e){
            System.out.println("El nombre no es válido");
        }finally {
            System.out.println("Finalizado");
        }

    }

}
