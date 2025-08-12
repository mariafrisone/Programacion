import java.util.ArrayList;

public class Venta {

    private Cliente cliente;
    private String fecha;
    private ArrayList<Producto> lineasDeVenta;
    private double total;

    public Venta(String fecha, Cliente cliente, ArrayList<Producto> lineasDeVenta) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineasDeVenta = lineasDeVenta;
        this.total = calcularTotal();
    }
    public Cliente getCliente() {return cliente;}

    public String getFecha() {return fecha;}

    public ArrayList<Producto> getLineasDeVenta() {return lineasDeVenta;}

    public double getTotal() {return total;}

    public void listadoVentas(){
        System.out.println("\n Cliente: " + this.cliente + "\n Fecha de la venta: " + this.fecha);
    }

    private double calcularTotal(){
        double sumaTotal = 0;
        for (Producto producto : lineasDeVenta){
            sumaTotal += producto.getPrecio();
        }
        return sumaTotal;
        }
    }



