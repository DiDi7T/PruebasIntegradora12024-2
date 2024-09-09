package model;

import structures.NodeChest;
import structures.SimpleLinkedListChest;


public class ChestController {
    private SimpleLinkedListChest cofre;
    private Chest cofreActual;

    public ChestController() {
        cofre = new SimpleLinkedListChest();
        //cofreActual = new Chest();  // Crear el primer cofre
        //cofre.add("Cofre 1", cofreActual);  // Añadir el primer cofre
    }

    public String addChest(String id){
        Chest chest = new Chest(id);
        cofre.add(id, chest);
        return "Cofre " +id+ " creado!!";
    }

    public String listChest() {
        String result = "";
        int size = cofre.getSize();
        NodeChest current = cofre.getFirst();

        for (int i = 0; i < size; i++) {
            Chest chest = current.getValue();
            result += "ID: " + chest.getCode() + "\n";
            current = current.getNext();
        }

        return result;
    }

    public SimpleLinkedListChest getChest() {
        return cofre;
    }

    public void addCropToChest(Crop cultivo) {
        // Si el cofre actual está lleno, crear un nuevo cofre
        if (cofreActual.isFull()) {
            String id="cofre_05";
            Chest nuevoCofre = new Chest(id);
            cofre.add("Cofre " + (getChestCount() + 1), nuevoCofre);
            cofreActual = nuevoCofre;  // Actualizar el cofre actual
        }
        cofreActual.addCrop(cultivo);  // Añadir el cultivo al cofre actual
    }

    private int getChestCount() {
        NodeChest current = cofre.getFirst();
        int count = 0;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    

   
}