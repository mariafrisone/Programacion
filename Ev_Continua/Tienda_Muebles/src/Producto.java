public class Producto {

    private String id;
    private String modelo;
    private String material;
    private String color;
    private double precio;

    public Producto(String idMueble, String modelo, String material, String color, double precio) {
        this.id = idMueble;
        this.modelo = modelo;
        this.material = material;
        this.color = color;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void verDetalle(){
        System.out.println("\n ID mueble: " + this.id + "\n Modelo: " + this.modelo + "\n Material: " + this.material +
                "\n Color: " + this.color + "\n Precio: " + this.precio);
    }
}
