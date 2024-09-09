package model;

import structures.NodeCrop;
import structures.SimpleLinkedListCrop;

public class Chest {
    private String code;
    private static final int MAX_CAPACITY = 50;
    private int currentCapacity;
    private String order;
    private boolean isOrder;
    private SimpleLinkedListCrop crop;

    public Chest(String id ) {
        this.code =id;
        this.crop = new SimpleLinkedListCrop();
        this.currentCapacity = 0;
    }

    public boolean isFull() {
        return currentCapacity >= MAX_CAPACITY;
    }

    public boolean addCrop(Crop cultivo) {
        if (currentCapacity < MAX_CAPACITY) {
            // Buscar si el cultivo ya existe en el cofre
            NodeCrop existingCrop = crop.search(cultivo.getName());
            
            if (existingCrop != null) {
                // Si ya existe un cultivo con el mismo nombre, apilamos o mostramos mensaje
                System.out.println("El cultivo " + cultivo.getName() + " ya existe y se ha apilado.");
                return false;  // No lo añadimos de nuevo, sólo apilamos
            } else {
                // Si no existe, añadimos el nuevo cultivo
                crop.add(cultivo.getName(), cultivo);
                currentCapacity++;  // Incrementamos la capacidad ocupada
                return true;
            }
        } else {
            return false;  // Cofre lleno
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public boolean isIsOrder() {
        return isOrder;
    }

    public void setIsOrder(boolean isOrder) {
        this.isOrder = isOrder;
    }

    
}
