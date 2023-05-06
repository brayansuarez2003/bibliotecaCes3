package models;
import java.util.List;

public class libreria {
    private String nombre;
    private String centro;
    private String portada;
    private String anyo;
    private String titulo;
    private libro libro;
    private autor autores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public models.libro getLibro() {
        return libro;
    }

    public void setLibro(models.libro libro) {
        this.libro = libro;
    }

    public autor getAutores() {
        return autores;
    }

    public void setAutores(autor autores) {
        this.autores = autores;
    }
}