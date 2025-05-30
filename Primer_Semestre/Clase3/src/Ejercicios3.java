public class Ejercicios3 {

    public static void main(String[] args) {

        //EJERCICIO 1

        final double GRAVEDAD = 9.81;
        System.out.println("El número de la gravedad es: 9.81");

        //EJERCICIO 2

        int a = 25;
        int b = 7;
        System.out.println("La suma total es: " + (a + b));
        System.out.println("La resta de a - b es: " + (a - b));
        System.out.println("La resta de b - a es: " + (b - a));
        System.out.println("La resta de a - a es: " + (a - a));
        System.out.println("La resta de b - b es: " + (b - b));
        System.out.println("La multiplicación de ambos números es: " + a * b);
        System.out.println("La división de a y b es: " + a / b);
        System.out.println("La división de b y a es: " + b / a);
        System.out.println("La división de a y a es: " + a / a);
        System.out.println("La división de b y b es: " + b / b);
        System.out.println("El resto a y b es: " + a % b);
        System.out.println("El resto b y a es: " + b % a);
        System.out.println("El resto a y a es: " + a % a);
        System.out.println("El resto b y b es: " + b % b);

        //EJERCICIO 3

        int edad = 25;
        int mayoriaEdad = 18;
        System.out.println("¿La persona es mayor de edad? " + (edad >= mayoriaEdad));

        //EJERCICIO 4

        int c = 8;
        int h = 30;
        System.out.println("¿c es mayor, igual o menor que h?: " + (c > h) + " " +
                (c == h) + " " + (c < h));

        //EJERCICIO 5

        boolean expresion1 = true;
        boolean expresion2 = true;
        System.out.println("El resultado es: " + (expresion1 && expresion2));

        //EJERCICIO 6

        boolean expresion3 = true;
        boolean expresion4 = false;
        System.out.println("El resultado es: " + (expresion3 || expresion4));

        //EJERCICIO 7

        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println("¿La suma de x + y da como resultado z? " + (x + y == z));
        System.out.println("Elige dos números: ");
    }
}
