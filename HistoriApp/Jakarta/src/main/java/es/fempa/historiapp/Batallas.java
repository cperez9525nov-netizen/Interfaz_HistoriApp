package es.fempa.historiapp;

public class Batallas implements java.io.Serializable {

    private String titulo;
    private String subtitulo;
    private String descripcion;
    private String anyo;

    // Constructores

    public Batallas() {
    }

    public Batallas(String titulo, String subtitulo, String descripcion, String anyo) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descripcion = descripcion;
        this.anyo = anyo;
    }

    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
    }
    
}
