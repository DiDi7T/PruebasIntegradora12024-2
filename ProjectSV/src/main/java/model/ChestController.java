package model;

import structures.SimpleLinkedListChest;

public class ChestController {
    private SimpleLinkedListChest cofres;
    //private Chest cofreActual;

    public ChestController() {
        cofres = new SimpleLinkedListChest();
        //cofreActual = new Chest(); // Crear el primer cofre
        //cofres.add("1", cofreActual); // Añadir el primer cofre
    }

    public void addChest(String id){
        Chest chest = new Chest(id);
        cofre.add(id, chest);
    }

    public SimpleLinkedListChest getChest() {
        return cofre;
    }

    public void addCropToChest(Crop cultivo) {
        if (cofreActual.isFull()) {
            Chest nuevoCofre = new Chest();
            cofres.add("Cofre " + (getChestCount() + 1), nuevoCofre); // Añadir nuevo cofre
            cofreActual = nuevoCofre;
        }
        cofreActual.addCrop(cultivo);  // Agregar el cultivo actual
    }

}
