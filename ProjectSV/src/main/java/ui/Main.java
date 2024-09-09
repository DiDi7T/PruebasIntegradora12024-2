package ui;
import java.util.Scanner;
import model.ChestController;
import model.Crop;


public class Main {

    private Scanner reader;

    private ChestController controller;
    private long startTime;

    public static void main(String[] args) {
        Main exe = new Main();
        exe.menu();
    }

    // Contructor
    public Main() {
        reader = new Scanner(System.in);
        controller = new ChestController();
        startTime = System.currentTimeMillis();
    }

    public void menu() {

        boolean flag = true;

        do {

            System.out.println("\nBIENVENIDO A TU GESTOR DE COFRES DE STARDEW VALLEY");
            System.out.println("1) Crear Cofre");
            System.out.println("2) Agregar un cultivo a un cofre");
            System.out.println("3) Ordenar los cultivos de un cofre por nombre");
            System.out.println("4) Ordenar los cultivos de un cofre por  estacion");
            System.out.println("5) Ordenar los cultivos de un cofre por dias de crecimiento");
            System.out.println("6) Buscar cultivo en un cofre");
            System.out.println("7) Guardar partida");

            System.out.println("0) Salir");
            int option = reader.nextInt();

            switch (option) {

                case 1:
                    createChest();
                    break;
                case 2:
                    addCropToChest();
                    break;
                case 3:

                    break;
                case 4:
                    //System.out.println("=======================" + "  " + "=======================");

                    break;
                case 5:
                    //System.out.println("=======================" + " " + "=======================");

                    break;

                case 6:
                    break;

                case 7:
                    //System.out.println("=======================" + " PARTIDA GUARDADA :) " + "=======================");
                    break;

                case 0:
                    flag = false;
                    System.out.println("Gracias por usar nuestros servicios");
                    break;

                default:
                    System.out.println("Opcion invalida. Intenta nuevamente\n");
                    break;
            }

        } while (flag);

    }

    private void createChest() {
        System.out.println("Ingrese el código del nuevo cofre:");
        String code = reader.next();
        controller.addChest(code);
        System.out.println("Cofre creado con éxito!");
    }

    public void addCropToChest() {
        long currentTime = System.currentTimeMillis();
        long elapsedMinutes = (currentTime - startTime) / 60000; // Tiempo en minutos

        int season = (int) (elapsedMinutes % 4);  // Cálculo cíclico de la estación

        switch (season) {
            case 0:
                showSpringCrops();
                break;
            case 1:
                showSummerCrops();
                break;
            case 2:
                showAutumnCrops();
                break;
            case 3:
                showWinterCrops();
                break;
        }

        System.out.println("Seleccione el cultivo por su número:");
        int cropChoice = reader.nextInt();

        Crop selectedCrop = getSelectedCrop(season, cropChoice);
        if (selectedCrop == null) {
            System.out.println("Selección inválida.");
            return;
        }
        System.out.println("Ingrese el ID del cofre donde desea almacenar el cultivo:");
        String chestId = reader.next();
        controller.addCropToChest(selectedCrop);  // Llamar al controlador para añadir el cultivo
        System.out.println("¡Cultivo añadido exitosamente!");
    }

    public void showSpringCrops() {
        System.out.println("Cultivos disponibles para primavera:");
        System.out.println("1. Fresa");
        System.out.println("2. Lechuga");
    }

    public void showSummerCrops() {
        System.out.println("Cultivos disponibles para verano:");
        System.out.println("1. Tomate");
        System.out.println("2. Sandía");
    }

    public void showAutumnCrops() {
        System.out.println("Cultivos disponibles para otoño:");
        System.out.println("1. Calabaza");
        System.out.println("2. Maíz");
    }

    public void showWinterCrops() {
        System.out.println("Cultivos disponibles para invierno:");
        System.out.println("1. Col rizada");
        System.out.println("2. Remolacha");
    }

    private Crop getSelectedCrop(int season, int choice) {
        switch (season) {
            case 0: // Primavera
                if (choice == 1) {
                    return new Crop("Fresa", Type.PRIMAVERA, 10);
                } else if (choice == 2) {
                    return new Crop("Lechuga", Type.PRIMAVERA, 7);
                }
                break;
            case 1: // Verano
                if (choice == 1) {
                    return new Crop("Tomate", Type.VERANO, 8);
                } else if (choice == 2) {
                    return new Crop("Sandía", Type.VERANO, 12);
                }
                break;
            case 2: // Otoño
                if (choice == 1) {
                    return new Crop("Calabaza", Type.OTOÑO, 13);
                } else if (choice == 2) {
                    return new Crop("Maíz", Type.OTOÑO, 14);
                }
                break;
            case 3: // Invierno
                if (choice == 1) {
                    return new Crop("Col rizada", Type.INVIERNO, 6);
                } else if (choice == 2) {
                    return new Crop("Remolacha", Type.INVIERNO, 9);
                }
                break;
        }
        return null; // Retornar null si no coincide ninguna opción
    }

}
