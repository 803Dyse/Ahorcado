package model;

/**
 *
 * Esta clase implementa todo o estado dunha partida ao aforcado. Manterá unha
 * referencia a un obxecto da clase HiddenWord coa palabra oculta a adiviñar, e
 * tamén irá almacenando as letras introducidas polo usuario que non estean na
 * palabra, para irllas mostrando e que non as introduza de novo
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class HiddenWord {

    /**
     * É un array de caracteres que almacena os caracteres da palabra
     */
    private char[] characters;
    /**
     * Array de booleans que marcarán con true aqueles caracteres da palabra que
     * están acertados e con false os que aínda non o están
     */
    private boolean[] hits;

    /**
     *
     * Constructor da clase HiddenWord
     *
     * @param word
     */
    public HiddenWord(String word) {
        characters = word.toCharArray();
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
        boolean flagCheck = false;
        for (int i = 0; i < characters.length; i++) {
            if (c == characters[i]) {
                hits[i] = true;
                flagCheck = true;
            }
        }
        return flagCheck;
    }

    /**
     *
     * Devolve a palabra substituíndo os caracteres non acertados por guións
     *
     * @return Devolve a palabra substituíndo os caracteres non acertados por
     * guións
     */
    public String show() {
        String hiddenWord = "";
        for (int i = 0; i < characters.length; i++) {
            if (hits[i]) {
                hiddenWord += characters[i];
            } else {
                hiddenWord += "-";
            }
        }
        return hiddenWord;
    }

    /**
     * Este método o usaremos para mostrar ao usuario ao final do xogo, se
     * perde, cal era a palabra oculta
     *
     * @return Devolve a palabra completa, incluíndo os caracteres non acertados
     */
    public String showFullWord() {
        String readWord = "";
        for (int i = 0; i < characters.length; i++) {
            readWord += characters[i];
        }
        return readWord;
    }

    /**
     *
     * Este método permitiranos saber se o usuario adiviñou a palabra e polo
     * tanto gañou a partida
     *
     * @return Indica se a palabra é totalmente visible, é dicir, se todos os
     * caracteres están xa acertados
     */
    public boolean isVisible() {
        for (int i = 0; i < characters.length; i++) {
            if (!hits[i]) {
                return false;
            }
        }
        return true;
    }
}
