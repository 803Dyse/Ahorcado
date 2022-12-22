/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.util.ArrayList;

/**
 *
 * @author Bilo Alejandro Martins González y Raúl Parada de la Fuente
 */
public class HangMan {

    private HiddenWord hiddenWord;
    private ArrayList fails;

    /**
     *
     * Obtén a lista de caracteres falados acumlados na partida
     *
     * @return Devolve a lista de caracteres
     */
    public ArrayList<Character> getFails() {
        return null;
    }

    public HangMan(String hangMan) {
        HiddenWord hiddenWord = new HiddenWord(hangMan);
    }

    /**
     *
     * Obtén un String coa lista de caracteres fallados acumulados, separados
     * por espazos en blanco
     *
     * @return Devolve un String que contén a lista de caracteres separados por
     * espazos en blanco
     */
    public String getStringFails() {
        return "";
    }

    /**
     *
     * Devolve a palabra oculta pero engadindo un guión nas letras non acertadas
     *
     * @return Devolve a palabra oculta con guións
     */
    public String showHiddenWord() {
        return "";
    }

    /**
     *
     * Devolve a palabra oculta mostrando todas as súas letras
     *
     * @return Devolve a palabra oculta
     */
    public String showFullWord() {
        return "";
    }

    /**
     *
     * Proba se o caracter indicado forma parte da palabra oculta
     *
     * @param c é o caracter que se proba
     */
    public void tryChar(char c) {
    }

    /**
     *
     * Comproba se rematou a partida
     *
     * @return Devolve true o false
     */
    public boolean isGameOver() {
        return false;
    }

    /**
     *
     * Comproba se se chegou ao límite de fallos permitidos
     *
     * @return Devolve true o false
     */
    public boolean maxFailsExceeded() {
        return false;
    }
}
