import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String dni;
    private String telefono;
    private String mail;


    public Cliente(String nombre, String dni, String telefono, String mail) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombre() {return nombre;}

    public String getDni() {return dni;}

    public String getTelefono() {return telefono;}

    public String getMail() {return mail;}

    public void setDni(String dni) {this.dni = dni;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public void setMail(String mail) {this.mail = mail;}

    public void verInfo (){
        System.out.println("\n Nombre: " + this.nombre + "\n DNI: " + this.dni + "\n Teléfono: " + this.telefono +
                "\n Mail: " + this.mail);
    }
}