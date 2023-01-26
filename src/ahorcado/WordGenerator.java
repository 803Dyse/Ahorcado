/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

import java.util.Random;

/**
 *
 * Esta clase encárgase de xerar a palabra a adiviñar
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class WordGenerator {

    /**
     * Array de string que é a lista de palabras posibles entre as que escoller
     * a palabra oculta
     */
    public static final String[] WORDLIST = {"patacas", "bateria", "cacao", "luna", "java"};

    /**
     * Xenera unha palabra cun número random que escolle a posición da palabra
     * no array
     *
     * @return A palabra xenerada
     */
    public String generateWord() {
        Random randomWord = new Random();
        int numberGenerated = randomWord.nextInt(WORDLIST.length);
        String wordGenerated = WORDLIST[numberGenerated];
        return wordGenerated;
    }
}
