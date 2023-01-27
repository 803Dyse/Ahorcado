package ahorcado;

import java.util.ArrayList;

/**
 *
 * Esta clase implementa todo o estado dunha partida ao aforcado e manterá unha
 * referencia a un obxecto da clase HiddenWord coa palabra oculta a adiviñar, e
 * tamén irá almacenando as letras introducidas polo usuario que non estean na
 * palabra, para irllas mostrando e que non as introduza de novo
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class HangMan {

    /**
     * Obxecto da clase HiddenWord coa palabra a adiviñar no xogo
     */
    private HiddenWord hiddenWord;
    /**
     * ArrayList de caracteres no que se van almacenando as letras introducidas
     * polo usuario que non están na palabra oculta
     */
    private ArrayList fails;

    /**
     * O número máximo de fallos que pode cometer o xogador antes de darlle a
     * partida por perdida
     */
    public static final int MAX_FAILS = 6;

    /**
     *
     * Constructor da clase HangMan
     *
     * @param hangMan
     */
    public HangMan(String hangMan) {
        hiddenWord = new HiddenWord(hangMan);
        fails = new ArrayList();
    }

    /**
     *
     * Obtén a lista de caracteres falados acumlados na partida
     *
     * @return Devolve a lista de caracteres
     */
    public ArrayList<Character> getFails() {
        return fails;
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
        String failsString = "";
        for (int i = 0; i < fails.size(); i++) {
            failsString += fails.get(i);
        }
        return failsString;
    }

    /**
     *
     * Devolve a palabra oculta pero engadindo un guión nas letras non acertadas
     *
     * @return Devolve a palabra oculta con guións
     */
    public String showHiddenWord() {
        return hiddenWord.show();
    }

    /**
     *
     * Devolve a palabra oculta mostrando todas as súas letras
     *
     * @return Devolve a palabra oculta mostrando todas as súas letras
     */
    public String showFullWord() {
        return hiddenWord.showFullWord();
    }

    /**
     *
     * Proba se o caracter indicado forma parte da palabra oculta
     *
     * @param c é o caracter que se proba
     */
    public void tryChar(char c) {
        if (!hiddenWord.checkChar(c)) {
            fails.add(c);
        }
    }

    /**
     *
     * Comproba se rematou a partida, ben porque se chegou ao límite de fallos
     * ou ben porque se adiviñou toda a palabra oculta
     *
     * @return Devolve true o false
     */
    public boolean isGameOver() {
        if (hiddenWord.isVisible() || maxFailsExceeded()) {
            return true;
        }
        return false;
    }

    /**
     *
     * Comprobase se chegou ao límite de fallos permitidos
     *
     * @return Devolve true o false
     */
    public boolean maxFailsExceeded() {
        if (fails.size() >= MAX_FAILS) {
            fails.clear();
            System.out.println("Non te quedan intentos");
            return true;
        } else {
            return false;
        }
    }
}
