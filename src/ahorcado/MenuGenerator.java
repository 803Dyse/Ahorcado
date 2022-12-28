/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author Bilo Alejandro Martins González y Raúl Parada de la Fuente
 */
public class MenuGenerator {

    private HangMan hangMan;

    /**
     * Mostra por pantalla o menú principal e xenera a palabra que o usuario vai
     * adiviñar
     */
    private String showInitMenu() {
        WordGenerator word = new WordGenerator();
        return word.generateWord();
    }

    /**
     * Este metodo implementa el status del juego, los fallos, aciertos y
     * tambien permite una cantidad limitada de fallos mientras pide las letras
     */
    private void showGameMenu() {
        System.out.println("Inserte letra");
    }

    /**
     * Este metodo pregunta al usuario si quiere seguir jugando o no
     */
    private boolean showExitMenu() {
        System.out.println("Quieres seguir jugando o no");
        Scanner scan = new Scanner(System.in);
        char result = scan.nextLine().charAt(0);
        if (result == 'S' || result == 's') {
            return false;
        } else {
            return true;
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        MenuGenerator menuGenerator = new MenuGenerator();

        do {
            menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
            menuGenerator.showGameMenu();
        } while (!menuGenerator.showExitMenu());
    }
}
