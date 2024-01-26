package model;

import function.Function;

public class Invoker {

    /* Atributos */

    private int id;                     // Identificador.
    private int currentTasks;           // Cantidad de tareas actuales.
    private int totalMemory;            // Memoria total del invoker.
    private int totalMemoryAvailable;   // Memoria disponible del invoker.

    /**
     * Constructor Invoker
     * @param id
     * @param totalMemory
     */
    public Invoker(int id, int totalMemory) {
        this.id = id;
        this.totalMemory = totalMemory;
        this.totalMemoryAvailable = totalMemory;
    }

    public void executeFunction(Function function, int memoryNeeded) throws Exception {
        this.totalMemoryAvailable -= memoryNeeded;
        function.run();
        this.totalMemoryAvailable += memoryNeeded;
    }

    public int getTotalMemoryAvailable() {
        return totalMemoryAvailable;
    }

    public void setTotalMemoryAvailable(int totalMemoryAvailable) {
        this.totalMemoryAvailable = totalMemoryAvailable;
    }

    public int getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(int totalMemory) {
        this.totalMemory = totalMemory;
    }

    public int getCurrentTasks() {
        return currentTasks;
    }

    public void setCurrentTasks(int currentTasks) {
        this.currentTasks = currentTasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
