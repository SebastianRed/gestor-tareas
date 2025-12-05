package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Tarea;

public class GestorTareas {
    
    private List<Tarea> tareas;
    // generar ids consecutivos (1,2,3,4,...)
    private int ultimoId;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
        this.ultimoId = 0;
    }

    // Crear tarea
    public Tarea crearTarea(String titulo, String categoria, String prioridad) {
        ultimoId++;
        Tarea nueva = new Tarea(ultimoId, titulo, categoria, prioridad);
        tareas.add(nueva);
        return nueva;
    }

    // Obtener todas las tareas
    public List<Tarea> obtenerTodas() {
        return tareas;
    }

    // Saber si hay o no tareas agregadas
    public boolean tieneTareas() {
        // [] | ["A", "B"]
        return !tareas.isEmpty();
    }

}