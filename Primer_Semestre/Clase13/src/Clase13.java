/*FUNCIONES: son trozos de código que tienen parámetros de entrada y de salida
No pueden cambiar los valores que reciben como entrada
* Tipos:
* 1) sin parámetros, sin retorno
* 2) con parámetros, sin retorno
* 3) sin parámetros, con retorno
* 4) con parámetros, con retorno */

public class Clase13 {

    public static void main(String[] args) {

        int [] numeros ={1,5,6,8,10};

        System.out.println("La media es: " + calcularMedia(numeros));

//        String email = "pepe@gmail.com";
//        String nombreUsuario = email.substring(0, email.indexOf("@"));
//        System.out.println(nombreUsuario);
//
//        String servidor = email.substring(email.indexOf("@") + 1);
//        System.out.println(servidor);

//        String name = "María";
//        saludar();
//
//        //saludar(name);
//       // saludar("Juan");
//
//        System.out.println(saluda2(name));

//        System.out.println(sumar(2,5,6,7,8,4,3,5,8));
//        System.out.println(sumar());

//        if(esPar(3)){
//            System.out.println("Es par");
//        }else {
//            System.out.println("No es par");
//        }
//    }

    //1. Imprime un saludo
//    public static void saludar(){
//        System.out.println("Hola");
//    }
//    public static void saludar(String nombre){
//        System.out.println("Hola," + nombre + "!");
//    }
//    public static String saluda2 (String nombre){
//        return ("Hola, " + nombre + "!");
//    }

//    public static int sumar(int n1, int n2){
//
//        return n1 + n2;
//    }
//    public static int sumar(int...numeros){
//        int suma = 0;
//
//        for (int n: numeros){
//            suma+=n;
//        }
//        return suma;
//    }
//    public static boolean esPar(int n1){
//        if(n1%2 == 0){
//            return true;
//        }else {
//            return false;
//        }
    }
    public static double calcularMedia(int[] numeros){
        int suma = 0;
        for (int n : numeros){
            suma += n;
        }
        return (double) suma / numeros.length;
    }
}
