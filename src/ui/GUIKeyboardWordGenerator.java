/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class GUIKeyboardWordGenerator implements WordGenerator {

    @Override
    public String generateWord() throws GenerateWordException {
        String customWord = "";

        String word;

        do {
            JPasswordField pwd = new JPasswordField();

            word = JOptionPane.showInputDialog(pwd, "Palabra", customWord);

        } while (!isValid(word));

        customWord = String.valueOf(word);

        System.out.println("DEBUG!!! PALABRA = " + customWord);

        return customWord;
    }

    /**
     * Este método comproba se todas os caracteres de word están en minúscula
     *
     * @param word a palabra a comprobar
     * @return Devolve true o false
     */
    private boolean isValid(String word) {
        System.out.println(word);
        System.out.println(word.toLowerCase());
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        return false;
    }

}
