/*MAPAS: los datos de los mapas no se repiten, ej. un dni
* Se usa HashMap cuando lo que priorizas es acceder rápido a la info: clave y valor
* Se usa TreeMap cuando priorizamos el orden no tanto la velocidad*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Clase12{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Ana", 8.5);
        notas.put("Ana", 7.0);
        notas.put("Luis", 5.0);
        notas.put("Pepe", 9.0);
        notas.put("Joaquín", 2.0);
        notas.put("Noelia", 4.0);
        notas.put("José", 8.0);

        for (Map.Entry<String, Double> entrada : notas.entrySet()){
            System.out.println(entrada.getKey() + "-> " + entrada.getValue());
        }

        System.out.println("Introduce nombre: ");
        String nombre = scanner.nextLine();

        if(notas.containsKey(nombre)){
            System.out.println(nombre + " tiene una nota de: " + notas.get(nombre));
        }else {
            System.out.println("Estudiante no encontrado");
        }
        System.out.println();

        //TREEMAP

        TreeMap<String, Double> ordenado = new TreeMap<>(notas);

        for(Map.Entry<String, Double> entrada : ordenado.entrySet()){
            System.out.println(entrada.getKey() + "-> " + entrada.getValue());
        }
    }
}
