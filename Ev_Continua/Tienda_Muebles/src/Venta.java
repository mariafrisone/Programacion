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
        System.out.println("\n Cliente: " + this.cliente.getNombre() + "("+this.cliente.getDni() + ")");
        System.out.println("\n Fecha de la venta: " + this.fecha);
        System.out.println("Productos: ");
        for (Producto producto : this.lineasDeVenta){
            System.out.println("\nID mueble: " + producto.getId() + "\nModelo: " + producto.getModelo() + "\nMaterial: " + producto.getMaterial() +
                    "\nColor: " + producto.getColor() + "\nPrecio: " + producto.getPrecio() + "€");
        }
        System.out.println("Total: " + this.total + "€");
    }

    private double calcularTotal(){
        double sumaTotal = 0;
        for (Producto producto : lineasDeVenta){
            sumaTotal += producto.getPrecio();
        }
        return sumaTotal;
        }
    }



