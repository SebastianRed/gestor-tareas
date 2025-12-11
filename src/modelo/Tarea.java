package modelo;

public class Tarea {

    private int id;
    private String titulo;
    private String categoria;
    private String prioridad;
    private boolean completada;

    public Tarea(int id, String titulo, String categoria, String prioridad) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public boolean getCompletada() {
        return completada;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrioridad(String prioridad){
        this.prioridad = prioridad;
    }

    public void marcarCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        String estado = completada ? "COMPLETADA" : "PENDIENTE";
        return "[" + id + "] " + titulo + " | " + categoria + " | " + prioridad + " | " + estado;
    }

}