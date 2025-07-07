import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicios {
    public static void main(String[] args) {

        /*1. Asociar Nombres de Estudiantes con Notas:
        Crea un HashMap<String, Integer> que asocie los nombres de estudiantes con sus notas.
        Añade al menos 5 estudiantes y muestra sus nombres y notas.*/

//        HashMap<String, Integer> alumnos = new HashMap<>();
//
//        alumnos.put("Pablo Ramírez", 6);
//        alumnos.put("Lorena Díaz", 5);
//        alumnos.put("Sebastián Tarnovsky", 9);
//        alumnos.put("Joaquín V. González", 6);
//        alumnos.put("Remedios Cáceres", 4);
//
//        for (Map.Entry<String, Integer> alumnado : alumnos.entrySet()){
//            System.out.println(alumnado.getKey() + "-> " + alumnado.getValue());
//        }

        /*2. Buscar un Valor en un Mapa:
        Crea un HashMap<String, String> que almacene nombres de países como claves y sus
        capitales como valores.
        Permite al usuario ingresar el nombre de un país para mostrar su capital.*/

//        Scanner scanner = new Scanner(System.in);
//        HashMap<String, String> paises = new HashMap<>();
//
//        paises.put("Estados Unidos", "Washington");
//        paises.put("Argentina", "Buenos Aires");
//        paises.put("Italia", "Roma");
//        paises.put("Sudáfrica", "Johannesburgo");
//        paises.put("Austria", "Viena");
//        paises.put("Israel", "Tel Aviv");
//
//        for (Map.Entry<String, String> entrada : paises.entrySet()){
//
//            System.out.println(entrada.getKey() + "-> " + entrada.getValue());
//        }
//        System.out.println();
//        System.out.println("Dime un país: ");
//        String pais = scanner.nextLine();
//
//        if (paises.containsKey(pais)){
//            System.out.println(pais + " su capital es: " + paises.get(pais));
//        }else {
//            System.out.println("Ese país no está en la lista");
//        }

         /*3. Eliminar un Elemento de un Mapa:
         Crea un TreeMap<Integer, String> con claves numéricas y valores de colores.
         Elimina un color del mapa e imprime el mapa resultante.*/

//        TreeMap<Integer, String> colores = new TreeMap<>();
//
//        colores.put(1, "Amarillo");
//        colores.put(2, "Azul");
//        colores.put(3, "Rojo");
//        colores.put(4, "Verde");
//        colores.put(5, "Negro");
//        colores.put(6, "Blanco");
//
//        for (Map.Entry<Integer, String> claves : colores.entrySet()){
//            System.out.println(claves.getKey() + " = " + claves.getValue());
//        }
//        System.out.println();
//        colores.remove(4);
//        for (Map.Entry<Integer, String> claves : colores.entrySet()){
//            System.out.println(claves.getKey() + " = " + claves.getValue());
//        }

        /* 4. Actualizar el Valor de una Clave en un Mapa:
        Crea un HashMap<String, Integer> que almacene productos y sus cantidades.
        Actualiza la cantidad de un producto y luego muestra el mapa actualizado.*/

//        HashMap<String, Integer> producto = new HashMap<>();
//
//        producto.put("Banana", 25);
//        producto.put("Manzana", 30);
//        producto.put("Tomate", 15);
//        producto.put("Limón", 15);
//        producto.put("Mandarina", 10);
//        producto.put("Naranja", 5);
//
//        for (Map.Entry<String, Integer> productos : producto.entrySet()){
//            System.out.println(productos.getKey() + " : " + productos.getValue());
//        }
//        System.out.println();
//        producto.put("Manzana", 25);
//        for (Map.Entry<String, Integer> productos : producto.entrySet()){
//            System.out.println(productos.getKey() + " : " + productos.getValue());
//        }

        /* 5. Ordenar un Mapa por Claves:
        Crea un HashMap<String, Double> que almacene nombres de productos y sus precios.
        Usa un TreeMap para ordenar los productos por nombre de forma alfabética.
        Imprime el mapa ordenado.*/

        HashMap<String, Double> producto = new HashMap<>();

        producto.put("Camiseta", 20.99);
        producto.put("Pantalón", 35.99);
        producto.put("Falda", 15.99);
        producto.put("Sandalias", 50.25);

        TreeMap<String, Double> productos = new TreeMap<>(producto);

        for(Map.Entry<String, Double> entrada : productos.entrySet()){
            System.out.println(entrada.getKey() + " : " + entrada.getValue());
        }
    }
}
