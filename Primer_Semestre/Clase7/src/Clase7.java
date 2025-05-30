import java.util.Scanner;
import java.util.InputMismatchException;
public class Clase7 {
    public static void main(String[] args) {
        //ejemplo de aserciones
//
//        int edad = -5;
//        assert edad>0:"La edad no puede ser negativa";
//        System.out.println("Edad: " + edad);

//        EJEMPLO DE TRY/CATCH
//        Scanner sc = new Scanner(System.in);
//        try{
//            System.out.println("Ingresame un numero: ");
//            int numero = sc.nextInt();
//            System.out.println("El numero ingresado es: " + numero);
//        } catch (InputMismatchException e){
//            System.out.println("No has ingresado un numero");
//        }finally {
//            sc.close();
//            System.out.println("Programa finalizado");
//            }

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ingrese un numero mayor que 5: ");
            int numero = scanner.nextInt();
            if(numero<5){
                System.out.println("Es menor que 5, numero ingresado: " + numero);
            }else{
                System.out.println("Numero valido" + numero);
            }

        }catch (Exception e){
            System.out.println("Dato ingresado no valido");
        }finally {
            scanner.close();
            System.out.println("Programa finalizado");
        }
    }
}
