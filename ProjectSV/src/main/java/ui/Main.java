package ui;
import java.util.Scanner;
import model.ChestController;

public class Main {

    private Scanner reader;

    private ChestController controller;

    public static void main(String[] args) {
        Main exe = new Main();
        exe.menu();
    }

    // Contructor
    public Main() {
        reader = new Scanner(System.in);
        controller = new ChestController();
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
                    break;
                case 2:
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

}
