package model;

import structures.SimpleLinkedListCrop;

public class Chest {
    private String code;
    private static final int MAX_CAPACITY = 50;
    private int currentCapacity;
    private String order;
    private boolean isOrder;

    private SimpleLinkedListCrop crop;

    public Chest(String code) {
        this.code = code;
        this.crop = new SimpleLinkedListCrop();
        this.currentCapacity=0;

    }

    public boolean isFull() {
        return currentCapacity >= MAX_CAPACITY;
    }

    public boolean addCrop(Crop cultivo) {
        if (currentCapacity + cultivo.getCantidad() <= MAX_CAPACITY) {
            NodeCrop existingNode = cultivos.search(cultivo.getTipo());

            if (existingNode != null) {
                existingNode.getValue().stack(cultivo); // Apilar el cultivo existente
            } else {
                cultivos.add(cultivo.getTipo(), cultivo); // Añadir nuevo cultivo
            }

            currentCapacity += cultivo.getCantidad();
            return true;
        } else {
            return false; // No se puede añadir más, el cofre está lleno
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public boolean isOrder() {
        return isOrder;
    }

    public void setOrder(boolean order) {
        isOrder = order;
    }


}
