//MATRICES

import java.util.ArrayList;

public class Clase11 {

    public static void main(String[] args) {
//        int [][] matriz1 = new int[3][4];
//
//        int [][] matriz2 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println("Número de filas: " + matriz2.length);/* esto te da las filas*/
//        System.out.println("Número de columnas: " + matriz2[0].length);/*esto da las columnas*/
//
//        /*Recorrido por la matriz*/
//
//        for (int i = 0; i<matriz2.length; i++){ /*con este for me desplazo a nivel de filas*/
//
//            for(int j = 0; j<matriz2[i].length; j++){ /*con este me desplazo por las columnas*/
//
//                System.out.print(matriz2[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//        //matriz2[1][1] = 30; /*esto es para modificar el valor de una matriz*/
//        System.out.println();
//        /*otra forma de recorrer una matriz es con un for each*/
//
//        for (int[] fila : matriz2){
//            for (int valor : fila){
//                System.out.print(valor + " ");
//            }
//        }

        //ARRAY LIST DE ARRAY LIST

        ArrayList<ArrayList<String>> estudiantes = new ArrayList<>();

        ArrayList<String> estudiante1 = new ArrayList<>();
        estudiante1.add("Juan");
        estudiante1.add("9");
        estudiante1.add("8");

        ArrayList<String> estudiante2 = new ArrayList<>();
        estudiante2.add("Raquel");
        estudiante2.add("8");
        estudiante2.add("10");
        estudiante2.add("6");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);

        for(ArrayList<String> estudiante : estudiantes){

            int contador = 0;

            for (String valor : estudiante){

                if (contador == 0){
                    System.out.print("Nombre: ");
                }else {
                    System.out.print("Nota " + contador + ": ");
                }
                System.out.print(valor + " ");
                contador++;
            }
            System.out.println();
        }
    }
}
