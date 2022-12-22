/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahorcado;

/**
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class MenuGenerator {
    public static void main(String[] args) {
        MenuGenerator menuGenerator = new MenuGenerator();
        
        do {
            menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
            menuGenerator.showGameMenu();   
        } while (!menuGenerator.showExitMenu());
    }
}
