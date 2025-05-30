// TIPOS PRIMITIVOS

public class Ejercicios1{

    public static void main(String[] args) {

        //Ejercicio 1:

        byte numeroByte = 59;
        short numeroShort = 17000;
        int numeroInt = 789;
        long numeroLong = 87511365101849215L;

        System.out.println("Dime los diversos números enteros: " + numeroByte
                + ", " + numeroShort + ", " + numeroInt + ", " + numeroLong);

        //Ejercicio 2:

        float numeroFloat = 5.8745f;
        double numeroDouble = 9.51;

        System.out.println("Dime los números con decimales: " + numeroFloat + ", " + numeroDouble);

        //Ejercicio 3:

        String esFalso = "Jorge";
        String esTrue = "María";
        System.out.println("Mi nombre es Jorge: " + false);
        System.out.println("Mi nombre es María: " + true);

        //Ejercicio 4:

        char letra='M';
        char unicode= '\u2763';

        System.out.println("La inicial de mi nombre es: " + letra + " " + unicode);

        String miNombre= "Maria Marta Frisone";
        String miPrograma= "mi programa favorito es Java";

        System.out.println("Mi nombre es " + miNombre + " " + "y" + " " + miPrograma);

        //Ejercicio 5

        String [] array= {"Juan", "Pedro", "Pablo", "Camila", "Ana"};
        System.out.println("Los nombres de mis hermanos son: " + array[0] +"," +  array[1] + "," + array[2] + "," + array[3]
                + "," + array[4]);
    }
}
