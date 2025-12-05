package modelo;

public class Tarea {

    private int id;
    private String titulo;
    private String categoria;
    private String prioridad; // ALTA, MEDIA, BAJA
    private boolean completada;

    public Tarea(int id, String titulo, String categoria, String prioridad) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.completada = false;
    }

    // Getters -> Get
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

    // Setters -> Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrioridad(String prioridad){
        this.prioridad = prioridad;
    }

    // Metodo de dominio
    public void marcarCompletada() {
        this.completada = true;
    }

    // System.out.println(tarea);
    // [23] Aprender JAVA | Programacion | ALTA | COMPLETADA

    @Override
    public String toString() {
        String estado = completada ? "COMPLETADA" : "PENDIENTE";
        return "[" + id + "] " + titulo + " | " + categoria + " | " + prioridad + " | " + estado;
    }

}