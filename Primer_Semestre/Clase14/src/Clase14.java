/*ORIENTACION A OBJETOS:
Los atributos deben declararse siempre como privados*/


public class Clase14 {
    public static void main(String[] args) throws InterruptedException {

        int num;
        Termometro t1 = new Termometro();
        Termostato termostato1 = new Termostato(26, t1);

        termostato1.anadirSplit(new Split("Puerta"));
        termostato1.anadirSplit(new Split("Ventana"));

        for (int i = 0; i<10; i++){
            termostato1.probarTemperatura();
            Thread.sleep(1000);
        }


    }
}
