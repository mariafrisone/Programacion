import java.util.ArrayList;

public class Banco {

    private String nombre;
    private ArrayList<Clientes> clientes;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Clientes c) {
        clientes.add(c);
        System.out.println("Cliente añadido con éxito");

    }

    public Clientes buscarCliente(String dni) {
        for (Clientes cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }return null;
    }
    public void mostrarClientes(){
        for (Clientes cliente : clientes){
            cliente.mostrarInfo();
        }
    }
    public void transferir(String dniOrigen, String dniDestino, double cantidad){
        Clientes origen = buscarCliente(dniOrigen);
        Clientes destino = buscarCliente(dniDestino);

        if(origen != null && destino != null){

            if(origen.retirar(cantidad)){
                destino.depositar(cantidad);
                System.out.println("Transferencia realizada con éxito");

            }else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("Uno o ambos clientes no existen");
        }
    }
}
