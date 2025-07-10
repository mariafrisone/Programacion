//EJEMPLO DE UN GESTOR BANCARIO

public class Clase15 {
    public static void main(String[] args) {

        Banco miBanco = new Banco("MaruBank");

        Clientes c1 = new Clientes("5555555", "Mario Perez", 1500);
        Clientes c2 = new Clientes("8888888", "Juana de Arco", 800);

        miBanco.agregarCliente(c1);
        miBanco.agregarCliente(c2);

        miBanco.mostrarClientes();

        miBanco.transferir("5555555", "8888888", 400);

        miBanco.mostrarClientes();
    }
}
