package model;

public class Crop {
    private String name;
    private Type type;
    private int days;
    private Status status;
    private int quantity;  // Para registrar la cantidad apilada

    public Crop(String name, Type type, int days ) {
        this.name = name;
        this.type = type;
        this.days = days;
        this.quantity = 1;
        //this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

   /* public int calculateDaysLeft(int days) {
        return days;
    }*/

    public int getQuantity() {
        return quantity;
    }

}