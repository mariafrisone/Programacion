import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {

    private Cliente cliente;
    private LocalDate fecha;
    private ArrayList<Producto> lineasDeVenta;
    private double total;

    public Venta(LocalDate fecha, Cliente cliente, ArrayList<Producto> lineasDeVenta) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.lineasDeVenta = lineasDeVenta;
        this.total = calcularTotal();
    }
    public Cliente getCliente() {return cliente;}

    public LocalDate getFecha() {return fecha;}

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



