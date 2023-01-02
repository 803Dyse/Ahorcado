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

    /**
     * Obxecto da clase HangMan que xestiona o funcionamento da partida actual
     */
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
        Scanner scan = new Scanner(System.in);
        while (!hangMan.isGameOver()) {
            System.out.println("hola primo introduce letras vamo a juga al hanman:");
            char letter = scan.nextLine().charAt(0);
            hangMan.tryChar(letter);
            System.out.println("Estos son os fallos:" + hangMan.getStringFails());
            System.out.println(hangMan.showHiddenWord());
        }
        System.out.println("la solucion es:" + hangMan.showFullWord());
    }

    /**
     * Este metodo pregunta al usuario si quiere seguir jugando o no
     */
    private boolean showExitMenu() {
        return false;
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
