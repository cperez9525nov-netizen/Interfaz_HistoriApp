package es.fempa.historiapp;

public class Batallas implements java.io.Serializable {

    private String titulo;
    private String subtitulo;
    private String descripcion;
    private String anyo;
    private double latitud;
    private double longitud;
    private String siglo;

    // Constructores

    public Batallas() {
    }

    public Batallas(String titulo, String subtitulo, String descripcion, String anyo, double latitud, double longitud, String siglo) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.descripcion = descripcion;
        this.anyo = anyo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.siglo = siglo;
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

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getSiglo() {
        return siglo;
    }

    public void setSiglo(String siglo) {
        this.siglo = siglo;
    }
    
}
