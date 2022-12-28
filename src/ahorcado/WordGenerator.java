/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

/**
 *
 * @author Bilo Alejandro Martins González y Raúl Parada de la Fuente
 */
public class WordGenerator {

    private final String[] WORDLIST = {"patacas", "teclado", "chocolate", "luna", "java"};

    public String generateWord() {
        
            int numberGenerated = new java.util.Random().nextInt(WORDLIST.length);
            String word = WORDLIST[numberGenerated];

        return word;
    }
}
