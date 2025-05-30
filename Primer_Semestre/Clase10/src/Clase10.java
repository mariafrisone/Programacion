//ARRAY LIST

import java.util.ArrayList;
import java.util.Scanner;

public class Clase10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        System.out.println("Introduce nombres (escribe 'salir' para finalizar):");
        String palabra;

        do{
            System.out.println("Nombre: ");
            palabra= entrada.nextLine();
            if(!palabra.equalsIgnoreCase("salir")){
                nombres.add(palabra);
            }
        }while(!palabra.equalsIgnoreCase("salir"));

        int opcion;
        do{
            System.out.println("\n Menú de Opciones");
            System.out.println("1. Mostrar todos los nombres");
            System.out.println("0. Salir");
            System.out.println("2. Obtener nombre por posición");
            opcion= entrada.nextInt();
            entrada.nextLine();
            switch (opcion){

                case 1 ->{

                    if(nombres.isEmpty()){
                        System.out.println("La lista está vacía");
                    }else {

                        for (String nom : nombres){
                            System.out.println(" - " + nom);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Introduce la posición");
                    int pos = entrada.nextInt();

                    if (pos>=0 && pos < nombres.size()) {
                        System.out.println("Nombre en la posición elegida: " + nombres.get(pos));
                    }else{
                        System.out.println("Introduce una posición válida");
                    }
                }
                case 0 -> System.out.println("Fin");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 0);
        entrada.close();
    }
}
