/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

/**
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class MenuGenerator {

    /**
     * Mostra por pantalla o menú principal e xenera a palabra que o usuario vai
     * adiviñar
     */
    private String showInitMenu() {
        WordGenerator word = new WordGenerator();
        return "a";
    }

    /**
     * Este metodo implementa el status del juego, los fallos, aciertos y
     * tambien permite una cantidad limitada de fallos mientras pide las letras
     */
    private void showGameMenu() {
        System.out.println("");
    }

    /**
     * Este metodo pregunta al usuario si quiere seguir jugando o no
     */
    private boolean showExitMenu() {

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
