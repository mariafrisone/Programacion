//ARRAYS

import java.util.Arrays;
import java.util.Scanner;

public class Clase9 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int[] numeros = new int[5];
//        int indice = 0;
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println("Introduce el número " + (i+1) + ":");
//            numeros[i] = sc.nextInt();
//
//        }
//           System.out.println("CONTENIDO:");

//        for(int num : numeros){
//            System.out.println("Elemento:" + num);
//        }
//        while (indice<numeros.length){
//
//            System.out.println("Posicion" + (indice+1) + ":" + numeros[indice]);
//            indice++;
//
//        }
        //Esta linea solo conviene usarla si quiero mostrar el vector, si necesito
        //hacer algo más complejo uso el bucle normal.

//        Arrays.stream(numeros).forEach(num -> System.out.println("Elemento: " + num));

// EJERCICIO 4

//  //      Scanner entrada = new Scanner(System.in);
//        int [] numeros ={10,25,30,16,58};
//
//        System.out.println("Introduce un número a buscar:");
//        int buscado = entrada.nextInt();
//
//        boolean encontrado = false;
//
//        for(int i=0; i< numeros.length; i++){
//
//            if(numeros[i]== buscado){
//                System.out.println("El número " + buscado + " está en la posición: " + (i+1));
//                encontrado = true;
//                break;
//            }
//        }
//        if (!encontrado){
//            System.out.println("Tu número no está en la lista");
//        }
        //EJERCICIO 5

        int[] numeros = {10, 25, 30, 16, 58};

        Arrays.sort(numeros);

        for(int num : numeros){
            System.out.println(num);
        }
    }
}
