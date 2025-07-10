public class Clientes {

    private String nombre;
    private String dni;
    private double saldo;

    public Clientes(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad){
        this.saldo += cantidad;
    }
    public boolean retirar(double cantidad){
        if (saldo >= cantidad){
            this.saldo += cantidad;
            return true;
        }
        return false;
        }

        public void mostrarInfo(){

            System.out.println("\n DNI: " + this.dni + " \n Nombre: " + this.nombre + " \n Saldo: " + this.saldo);
        }

    }

