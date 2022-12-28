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
     * Constructor da clase HiddenWord
     *
     * @param word
     */
    public HiddenWord(String word) {
        characters = new char[word.toCharArray().length];
        hits = new boolean[word.toCharArray().length];
    }

    /**
     *
     * Comproba se un caracter aparece na lista de caracteres da palabra,
     * marcando todas as aparicións dese caracter como acertadas
     *
     * @param c o caracter a comprobar
     * @return Se o caracter aparece na palabra devolve true, se non devolve
     * false
     */
    public boolean checkChar(char c) {
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == c) {
                System.out.println("Aaaaa");
            }
        }
        return false;
    }

    /**
     *
     * Devolve a palabra substituíndo os caracteres non acertados por guións
     *
     * @return Devolve a palabra substituíndo os caracteres non acertados por
     * guións
     */
    public String show() {
        return characters.toString();
    }

    /**
     * Este método o usaremos para mostrar ao usuario ao final do xogo, se
     * perde, cal era a palabra oculta
     *
     * @return Devolve a palabra completa, incluíndo os caracteres non acertados
     */
    public String showFullWord() {
        return "";
    }

    /**
     *
     * Este método permitiranos saber se o usuario adiviñou a palabra e polo
     * tanto gañou a a partida
     *
     * @return Indica se a palabra é totalmente visible, é dicir, se todos os
     * caracteres están xa acertados
     */
    public boolean isVisible() {
        return false;
    }
}
