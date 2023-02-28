/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class GUIKeyboardWordGenerator implements WordGenerator {
    
    @Override
    public String generateWord() throws GenerateWordException {
        return "";
    }
    
    /**
     * Este método comproba se todas os caracteres de word están en minúscula
     * 
     * @param word a palabra a comprobar
     * @return Devolve true o false
     */
    private boolean isValid(String word) {
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        return false;
    }

}
