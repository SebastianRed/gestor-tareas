package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Tarea;

public class GestorTareas {
    
    private List<Tarea> tareas;
    private int ultimoId;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
        this.ultimoId = 0;
    }

    public Tarea crearTarea(String titulo, String categoria, String prioridad) {
        ultimoId++;
        Tarea nueva = new Tarea(ultimoId, titulo, categoria, prioridad);
        tareas.add(nueva);
        return nueva;
    }

    public List<Tarea> obtenerTodas() {
        return tareas;
    }

    public List<Tarea> obtenerPendientes() {
        List<Tarea> pendientes = new ArrayList<>();
        for (Tarea t : tareas) {
            if (!t.getCompletada()) {
                pendientes.add(t);
            }
        }
        return pendientes;
    }

    private Tarea buscarPorId(int id) {
        for (Tarea t : tareas) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public boolean marcarCompletada(int id) {
        Tarea tareaBuscada = buscarPorId(id);
        if (tareaBuscada != null && !tareaBuscada.getCompletada()) {
            tareaBuscada.marcarCompletada();
            return true;
        } 
        return false;
    }

    public boolean eliminarTarea(int id) {
        Tarea t = buscarPorId(id);
        if (t != null) {
            tareas.remove(t);
        }
        return false;
    }

    public boolean tieneTareas() {
        return !tareas.isEmpty();
    }

}