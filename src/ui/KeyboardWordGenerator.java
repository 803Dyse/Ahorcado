package ui;

import java.util.Scanner;

/**
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class KeyboardWordGenerator implements WordGenerator{

    @Override
    public String generateWord() throws GenerateWordException {
        Scanner scan = new Scanner(System.in);
        
        String customWord = scan.nextLine();
        
        return customWord;
    }
    
}
