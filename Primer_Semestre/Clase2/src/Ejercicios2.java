public class Ejercicios2 {

    public static void main(String[] args) {

        // 📌 EJERCICIO 1:
        // Crea una variable de cada tipo entero y asígnale valores distintos.
        // Luego imprímelas con System.out.println().

        byte numeroByte = 15;
        int numeroEntero = 350;
        short numeroShort = 15000;
        long numeroLong = 800000000000000L;

        System.out.println("Dime cuales son los números que escribí: " + numeroByte + " " + numeroEntero +
                " " + numeroShort + " " + numeroLong);

        // 📌 EJERCICIO 2:
        // Declara una variable de tipo float y otra de tipo double con valores distintos.
        // Imprímelas en la consola.

        float numeroFloat = 5.25f;
        double numeroDouble = 6.84512552;

        System.out.println("Dime ahora las dos nuevas variables que agregué: " + numeroFloat + " " + numeroDouble);

        // 📌 EJERCICIO 3:
        // Declara una variable boolean y asígnale un valor falso.
        // Luego usa un `if` para imprimir un mensaje si es true o false.

        boolean esFalso = false;
        boolean esVerdadero = true;

        if (esFalso == esVerdadero) {
            System.out.println(esVerdadero);
        }else {
            System.out.println(esFalso);
        }

        // 📌 EJERCICIO 4:
        // Declara una variable de tipo char con tu inicial y otra con un símbolo especial.
        // Imprímelas en la consola.

        char miInicial = 'M';
        char simboloEspecial = '@';

        System.out.println("char (16 bits, caracteres Unicode): " + miInicial + " " + simboloEspecial);

        // 📌 EJERCICIO 5:
        // Declara una variable String con tu nombre y otra con tu lenguaje favorito.
        // Concaténalas en un mensaje y muestra el resultado.

        String miNombre = "Maria Marta Frisone";
        String lenguajeFav = "Python";

        System.out.println("Mi nombre es: " + miNombre + " " + "y mi lenguaje favorito es: " + lenguajeFav);

        // 📌 EJERCICIO 6:
        // Declara un array de 5 nombres y muéstralos en la consola usando un bucle.

        int [] array = {1,2,3,4,5,6};
        for (int i = 0; i<= array.length; i++){
            System.out.println(i);
        }

        // 📌 EJERCICIO 7:
        // Usa literales para imprimir en consola:
        // Un número entero, un decimal, un booleano y una cadena de texto.

        System.out.println(300);
        System.out.println(1.5);
        System.out.println(true);
        System.out.println("Mi nombre es Maria");
    }
}
