import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Producto> productos = new ArrayList<>();
    static ArrayList<Venta> ventas = new ArrayList<>();
    static HashMap<String, Cliente> mapaClientes = new HashMap<>();
    static HashMap<String, Producto> mapaProductos = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("* Menú de Opciones *");
            System.out.println("1. Gestión de Clientes");
            System.out.println("2. Gestión de Productos");
            System.out.println("3. Realizar Venta");
            System.out.println("4. Mostrar Ventas");
            System.out.println("5. Salir\n");
            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

             switch (opcion){
                case 1 -> gestionarClientes(scanner);
                case 2 -> gestionarProductos(scanner);
                case 3 -> realizarVentas(scanner);
                case 4 -> mostrarVentas(scanner);
                case 5 -> System.out.println("Estás saliendo del sistema");
                default -> System.out.println("Esta opción no es válida");
            }
        }while (opcion != 5);
    }
        static void gestionarClientes(Scanner scanner) {
            int op;
            do {
                System.out.println(":: Gestión de Clientes ::");
                System.out.println("1. Alta Cliente");
                System.out.println("2. Baja Cliente");
                System.out.println("3. Modificación Cliente");
                System.out.println("4. Búsqueda por DNI");
                System.out.println("5. Listado");
                System.out.println("6. Volver");


                System.out.println("Elige una opción: ");
                op = scanner.nextInt();
                scanner.nextLine();

                switch (op) {
                    case 1 -> {
                        String respuesta;

                        do {
                            System.out.println("Nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.println("DNI: ");
                            String dni = scanner.nextLine();
                            System.out.println("Teléfono: ");
                            String telefono = scanner.nextLine();
                            System.out.println("Email: ");
                            String mail = scanner.nextLine();

                            Cliente nuevoCliente = new Cliente(nombre, dni, telefono, mail);
                            clientes.add(nuevoCliente);
                            mapaClientes.put(nuevoCliente.getDni(), nuevoCliente);

                            System.out.println("¿Quieres agregar otro cliente? (s/n): ");
                            respuesta = scanner.nextLine();

                        } while (respuesta.equalsIgnoreCase("s"));
                    }
                    case 2 -> {
                            mostrarClientes();

                            System.out.println("\n DNI del cliente que deseas eliminar: ");
                            String dniBaja = scanner.nextLine();
                            Cliente clienteEliminado = mapaClientes.remove(dniBaja);
                            if (clienteEliminado != null){
                                clientes.remove(clienteEliminado);
                                System.out.println("El cliente se ha borrado con éxito");
                            }else{
                                System.out.println("El número de DNI no es correcto");
                            }
                    }
                    case 3 -> {
                        mostrarClientes();

                        System.out.println("\n DNI del cliente que deseas modificar: ");
                        String dniCliente = scanner.nextLine();
                        Cliente clienteModificar = mapaClientes.get(dniCliente);

                        System.out.println("Nuevo Nombre (" + clienteModificar.getNombre() + "): ");
                        String nuevoNombre = scanner.nextLine();
                        if (!nuevoNombre.isEmpty()){
                            clienteModificar.setNombre(nuevoNombre);
                        }
                        System.out.println("Nuevo Teléfono (" + clienteModificar.getTelefono() + "): ");
                        String nuevoTelefono = scanner.nextLine();
                        if (!nuevoTelefono.isEmpty()){
                            clienteModificar.setTelefono(nuevoTelefono);
                        }
                        System.out.println("Nuevo Mail (" + clienteModificar.getMail() + "): ");
                        String nuevoMail = scanner.nextLine();
                        if (!nuevoMail.isEmpty()){
                            clienteModificar.setMail(nuevoMail);
                        }
                        System.out.println("\n¡Los datos han sido actualizados con éxito!");
                        clienteModificar.verInfo();
                        }

                    case 4 -> {
                        System.out.println("Introduce el DNI que quieres buscar");
                        String dniBuscado = scanner.nextLine();
                        Cliente clienteEncontrado = mapaClientes.get(dniBuscado);
                        if (clienteEncontrado != null) {
                            System.out.println("El cliente ha sido encontrado: ");
                            clienteEncontrado.verInfo();
                        } else {
                            System.out.println("No se ha encontrado ningún cliente con ese número de DNI");
                        }
                    }
                    case 5 -> {
                        mostrarClientes();
                    }
                }
            }while (op != 6);
        }
        static void gestionarProductos(Scanner scanner) {
            int op;
            do {
                System.out.println(":: Gestión de Productos::");
                System.out.println("1. Alta Producto");
                System.out.println("2. Listado de productos");
                System.out.println("3. Búsqueda por ID");
                System.out.println("4. Volver\n");
                System.out.println("Elige una opción: ");
                op = scanner.nextInt();
                scanner.nextLine();

                switch (op) {
                    case 1 -> {
                        String idMueble;
                        boolean idCorrecto = false;
                        do {
                            System.out.println("ID: ");
                            idMueble = scanner.nextLine();
                            if (idMueble.isEmpty()) {
                                idCorrecto = false;
                            }else {
                                boolean soloNumeros = true;
                                for (int i = 0; i<idMueble.length(); i++) {
                                    char caracter = idMueble.charAt(i);
                                    if (caracter < '0' || caracter > '9') {
                                        soloNumeros = false;
                                        break;
                                    }
                                }
                                if (soloNumeros){
                                    idCorrecto = true;
                                }else{
                                    System.out.println("El ID solo debe contener números");
                                    idCorrecto = false;
                                }
                                }
                        }while(!idCorrecto);

                            System.out.println("Modelo: ");
                            String modelo = scanner.nextLine();
                            System.out.println("Color: ");
                            String color = scanner.nextLine();
                            System.out.println("Material: ");
                            String material = scanner.nextLine();
                            System.out.println("Precio: ");
                            double precio = scanner.nextDouble();

                            Producto nuevoProducto = new Producto(idMueble, modelo, color, material, precio);
                            productos.add(nuevoProducto);
                            mapaProductos.put(nuevoProducto.getId(), nuevoProducto);
                    }
                    case 2 -> {
                        listarProductos();
                    }
                    case 3 -> {
                        listarProductos();
                        System.out.println("\nEscribe el ID del producto que quieres buscar: ");
                        String idBuscado = scanner.nextLine();
                        Producto idEncontrado = mapaProductos.get(idBuscado);
                        if (idEncontrado != null) {
                            System.out.println("Id encontrado:");
                            idEncontrado.verDetalle();
                        }
                    }
                }
            } while (op != 4);
        }

        static void realizarVentas(Scanner scanner) {

            mostrarClientes();
            System.out.println("DNI del Cliente: ");
            String dniCliente = scanner.nextLine();
            Cliente clienteSeleccionado = mapaClientes.get(dniCliente);
            if (clienteSeleccionado == null){
                System.out.println("Cliente no encontrado, debe cargar el cliente");
            return;
        }
            listarProductos();
            ArrayList<Producto> productosVenta = new ArrayList<>();
            String respuesta;
            do {
                System.out.println("Introduce el ID del producto a añadir");
                String idProducto = scanner.nextLine();
                Producto productoSeleccionado = mapaProductos.get(idProducto);

                if (productoSeleccionado!= null){
                    productosVenta.add(productoSeleccionado);
                    System.out.println("Producto añadido");
                }else {
                    System.out.println("ID no encontrado");
                }
                System.out.println("¿Quieres añadir otro producto? (s/n): ");
                respuesta = scanner.nextLine();
            }while (respuesta.equalsIgnoreCase("s"));

            if (!productosVenta.isEmpty()){

                LocalDate fechaVenta = LocalDate.now();

                Venta nuevaVenta = new Venta(fechaVenta, clienteSeleccionado, productosVenta);
                ventas.add(nuevaVenta);

                System.out.println("\n ¡Venta creada con éxito!");
                System.out.println("Datos del cliente: " );
                nuevaVenta.getCliente().verInfo();
                System.out.println("Fecha de la venta: " + nuevaVenta.getFecha().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                System.out.println("Total de la venta: " + nuevaVenta.getTotal() + "€");

            }else {
                System.out.println("\n Venta cancelada, no se añadieron productos");
            }
        }
        static void mostrarVentas(Scanner scanner){
                for (Venta listado : ventas)
                    listado.listadoVentas();
        }
        static void mostrarClientes() {
            for (Cliente listado : clientes)
                listado.verInfo();
        }
        static void listarProductos(){
        for (Producto listado : productos)
            listado.verDetalle();
        }
}
