/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * Esta clase encárgase de mostrar os menús coas distintas opcións do xogo, e
 * recoller o que introduza o usuario
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
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
     * Este metodo implementa o status do xogo, os fallos, acertos e tamén
     * permite unha cantidade limitada de fallos mentras pide as letras
     */
    private void showGameMenu() {
        System.out.println("Bienvenido ao xogo do ahorcado");
        Scanner scan = new Scanner(System.in);
        while (!hangMan.isGameOver()) {
            System.out.println("Tes 6 intentos para adivinar a palabra");
            System.out.println("Introduce unha letra e intenta adivinar a palabra:");
            char letter = scan.nextLine().toLowerCase().charAt(0);
            hangMan.tryChar(letter);
            System.out.println("Estos son os fallos: " + hangMan.getStringFails());
            System.out.println(hangMan.showHiddenWord());
        }
        System.out.println("A solucion e: " + hangMan.showFullWord());
    }

    /**
     * Este metodo pregunta ao usuario se quere seguir xogando o non
     */
    private boolean showExitMenu() {
        System.out.println("Queres seguir xogando?");
        System.out.println("s -> CONTINUAR ");
        System.out.println("n -> SALIR");
        Scanner sc = new Scanner(System.in);
        char userOption = sc.nextLine().toLowerCase().charAt(0);
        if (userOption != 's') {
            System.out.println("Moitas grazas por xogar ao ahorcado :)");
            return true;
        }
        return false;
    }

    /**
     * Este é o metodo main
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
