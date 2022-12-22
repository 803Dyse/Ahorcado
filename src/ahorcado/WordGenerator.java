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

    private final String[] WORDLIST = {"patacas", "teclado", "chocolate", "luna", "java"};

    public String generateWord() {
        Random randomWord = new Random();
        for (int i = 0; i < WORDLIST.length; i++) {
            int numberGenerated = randomWord.nextInt(WORDLIST.length);
        }

        return "";
    }
}
