/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

import java.util.Random;

/**
 *
 * @author Bilo Alejandro Martins González y Raúl Parada de la Fuente
 */
public class WordGenerator {

    public static final String[] WORDLIST = {"patacas", "bateria", "cacao", "luna", "java"};

    public String generateWord() {
        Random randomWord = new Random();
        int numberGenerated = randomWord.nextInt(WORDLIST.length);
        String wordGenerated = WORDLIST[numberGenerated];
        return wordGenerated;
    }
}
