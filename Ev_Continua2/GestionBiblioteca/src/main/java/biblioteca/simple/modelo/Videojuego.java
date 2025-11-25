package biblioteca.simple.modelo;

import biblioteca.simple.contratos.Prestable;

public class Videojuego extends Producto implements Prestable{

    private String genero;
    private int version;

    private boolean prestado;
    private Usuario prestadoA;

    public Videojuego(int id, String titulo, String anho, Formato formato, String genero, int version) {
        super(id, titulo, anho, formato);
        this.genero = genero;
        this.version = version;
    }

    public Videojuego(String titulo, String anho, Formato formato, String genero, int version){
        super(titulo, anho, formato);
        this.genero = genero;
        this.version = version;
    }

    public String getGenero(){
        return genero;
    }

    public int getVersion() {
        return version;
    }

    @Override public void prestar(Usuario u) {
        if (prestado) throw new IllegalStateException("Ya prestado");
        prestado = true;
        this.prestadoA = u;
    }

    @Override public void devolver() { prestado = false; this.prestadoA = null; }
    @Override public boolean estaPrestado() { return prestado; }

    @Override
    public String toString() {
        return  "Videojuego{" +
                ", genero=" + genero +
                ", version=" + version +
                ", formato=" + formato +
                ", anho='" + anho + '\'' +
                ", titulo='" + titulo + '\'' +
                ", id=" + id +
                '}';
    }

}
