/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

/**
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class HiddenWord {
    private char[] characters;
    private boolean[] hits;

    public HiddenWord(String word) {
        characters = new char[word.toCharArray().length];
        hits = new boolean[word.toCharArray().length];
    }
    
    public boolean checkChar(char c) {
        return false;
    }
    
    public String show() {
        return "";
    }
    
    public String showFullWord() {
        return "";
    }
    
    public boolean isVisible() {
        return false;
    }
}
