public class Termometro {

    private double temperaturActual;

    public Termometro(){
        this.temperaturActual = 25.0;
    }

    public double leerTemperatura(){
        this.temperaturActual += (Math.random() *2 - 1);
        return this.temperaturActual;
    }
}
