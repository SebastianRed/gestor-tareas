package app;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import modelo.Tarea;
import servicio.GestorTareas;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        boolean salir = false;

        while (!salir) { 
            mostrarMenu();
            int opcion = leerEntero(sc, "Elige una opcion: ");

            switch (opcion) {
                case 1:
                    crearTarea(sc, gestor);
                    break;
                case 2:
                    listarTareas(gestor.obtenerTodas(), "Todas las tareas");
                    break;
                case 3:
                    listarTareas(gestor.obtenerPendientes(), "Tareas pendientes");
                    break;
                case 4:
                    System.out.println("Comming soon");
                    break;
                case 5:
                    System.out.println("Comming soon");
                    break;
                case 6:
                    System.out.println("Comming soon");
                    salir = true;
                    break;
                default:
                    System.err.println("Opcion no valida");
            }
        }
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("=========================");
        System.out.println("     GESTOR DE TAREAS    ");
        System.out.println("=========================");
        System.err.println("1. Crear nueva tarea.");
        System.err.println("2. Listar todas las tareas.");
        System.err.println("3. Listar tareas pendientes.");
        System.err.println("4. Marcar tarea como completada.");
        System.err.println("5. Eliminar tarea.");
        System.err.println("6. Salir.");
        System.out.println("=========================");
    }

    private static int leerEntero(Scanner sc, String mensaje) {
        int numero;
        // TODO: Mejorar logica del "while (true)"
        while (true) { 
            System.out.println(mensaje);
            try {
                numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un numero.");
                sc.nextLine();
            }
        }
    }

    private static void crearTarea(Scanner sc, GestorTareas gestor) {
        System.out.println("--- Crear nueva tarea ---");
        // Pedir el titulo        -> sc
        System.out.println("Titulo de la tarea: ");
        String titulo = sc.nextLine();

        // Pedir la categoria     -> sc
        System.out.println("Categoria (ej. Personal, Estudio, Compras): ");
        String categoria = sc.nextLine();

        // Pedir la prioridad (ALTA, MEDIA, BAJA)     -> sc (op 1 y op 2)
        System.out.println("Prioridad (ALTA, MEDIA o BAJA)");
        String prioridad = sc.nextLine().toUpperCase(); 

        // 1). String/Texto directo, mostrando la prioridad al usuario para que 
        //     ingrese el valor por consola. ( toUpperCase() )

        // 2). Crear 3 variables con los valores (ALTA MEDIA Y BAJA), y con una OPCION
        //     que ingrese el usuario, guardarlo, ej 1: ALTA, 2: MEDIA, 3: BAJA
        
        gestor.crearTarea(titulo, categoria, prioridad);
    }

    // gestor.obtenerTodas()      gestor.obtenerPendientes()
    private static void listarTareas(List<Tarea> listaTarea, String tituloLista) {
        //TODO: for (Tarea t : listaTarea) { println }
    }

}