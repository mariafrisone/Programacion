public class Clase2 {
    public static void main(String[] args) {
        // 📌 TIPOS PRIMITIVOS EN JAVA 📌
        // Los tipos primitivos almacenan valores simples en memoria.
        // No pueden contener métodos ni comportamientos adicionales.

        System.out.println("\n🔹 TIPOS PRIMITIVOS EN JAVA 🔹");

        // 🔹 Enteros (números sin decimales)
        System.out.println("\n👉 ENTEROS:");
        byte numeroByte = 127;  // Número pequeño (-128 a 127)
        System.out.println("byte (8 bits): " + numeroByte);

        short numeroShort = 32000; // Número mediano (-32,768 a 32,767)
        System.out.println("short (16 bits): " + numeroShort);

        int numeroInt = 1000000; // Número grande
        System.out.println("int (32 bits): " + numeroInt);

        long numeroLong = 900000000000L; // Número muy grande (requiere 'L' al final)
        System.out.println("long (64 bits): " + numeroLong);


        // 🔹 Flotantes (números con decimales)
        System.out.println("\n👉 COMA FLOTANTE:");
        float numeroFloat = 3.14f; // Número decimal (requiere 'f' al final)
        System.out.println("float (32 bits, precisión de 6-7 decimales): " + numeroFloat);

        double numeroDouble = 2.7182818284; // Mayor precisión
        System.out.println("double (64 bits, precisión de 15-16 decimales): " + numeroDouble);


        // 🔹 Booleanos (verdadero o falso)
        System.out.println("\n👉 BOOLEANOS:");
        boolean esVerdadero = true;
        boolean esFalso = false;
        System.out.println("boolean (1 bit, valores: true o false): " + esVerdadero + " / " + esFalso);


        // 🔹 Caracteres (un solo símbolo)
        System.out.println("\n👉 CARACTERES:");
        char letra = 'A';
        char simbolo = '#';
        char unicode = '\u2764';  // Corazón ❤️
        System.out.println("char (16 bits, caracteres Unicode): " + letra + " " + simbolo + " " + unicode);


        // 📌 TIPOS DE REFERENCIA EN JAVA 📌
        // Los tipos de referencia no almacenan valores directamente.
        // En su lugar, almacenan direcciones de memoria que apuntan a objetos.

        System.out.println("\n🔹 TIPOS DE REFERENCIA EN JAVA 🔹");

        // 🔹 Cadenas de texto (Strings)
        System.out.println("\n👉 CADENAS DE TEXTO:");
        String texto = "Esto es una cadena en Java";
        System.out.println("String (almacena texto y caracteres): " + texto);


        // 🔹 Arrays (listas de valores)
        System.out.println("\n👉 ARRAYS:");
        int[] numeros = {10, 20, 30, 40, 50}; // Array de enteros
        System.out.println("Array de enteros (posición 0): " + numeros[0]);
        System.out.println("Array de enteros (posición 1): " + numeros[1]);


        // =====================================================
        // 📌 LITERALES EN JAVA 📌
        // Un literal es un valor constante que se usa directamente en el código.
        // Ejemplos: números, texto, valores booleanos.
        // =====================================================

        System.out.println("\n🔹 LITERALES EN JAVA 🔹");

        System.out.println("\n👉 LITERALES ENTEROS:");
        System.out.println(100);  // Literal entero
        System.out.println(-50);  // Literal negativo

        System.out.println("\n👉 LITERALES FLOTANTES:");
        System.out.println(3.1415);  // Literal flotante
        System.out.println(2.5e3);  // Notación científica (2.5 × 10³)

        System.out.println("\n👉 LITERALES BOOLEANOS:");
        System.out.println(true);  // Literal booleano
        System.out.println(false); // Literal booleano

        System.out.println("\n👉 LITERALES DE TEXTO:");
        System.out.println("Hola, mundo");  // Literal de cadena


        // 📌 CONCLUSIÓN 📌
        // En esta práctica aprendimos:
        // - Tipos primitivos: int, double, boolean, char.
        // - Tipos de referencia: String, Arrays.
        // - Literales: valores constantes en el código.



    }
}