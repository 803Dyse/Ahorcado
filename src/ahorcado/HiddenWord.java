/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

/**
 *
 * @author Bilo Alejandro Martins González y Raúl Parada de la Fuente
 */
public class HiddenWord {

    private char[] characters;
    private boolean[] hits;

    /**
     *
     * @param word
     */
    public HiddenWord(String word) {
        characters = new char[word.toCharArray().length];
        hits = new boolean[word.toCharArray().length];
    }

    /**
     *
     * @param c
     * @return
     */
    public boolean checkChar(char c) {
        return false;
    }

    /**
     *
     * @return
     */
    public String show() {
        return "";
    }

    /**
     *
     * @return
     */
    public String showFullWord() {
        return "";
    }

    /**
     *
     * @return
     */
    public boolean isVisible() {
        return false;
    }
}
