package ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Clase que genera una palabra aleatoria en base a un archivo, que lee palabras
 * linea por línea.
 * 
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class FileWordGenerator implements WordGenerator {

    /**
     * Genera una palabra, lee de un archivo de palabras linea por linea, las
     * guarda en un ArrayList, y se genera aleatoriamente una palabra.
     * 
     * @return
     * @throws GenerateWordException
     */
    @Override
    public String generateWord() throws GenerateWordException {

        BufferedReader in = null;
        
        ArrayList<String> words = new ArrayList<>();
        
        Random random = new Random();

        try {
            // Lee el archivo wordlist que se encuentra en la raíz del proyecto
            // antes del src.
            in = new BufferedReader(new FileReader("wordlist.txt"));
           
            String line;
            
            // Guarda en el string "Line" el valor del texto de cada linea, mientras
            // no sea null. Y lo va guardando en el ArrayList.
            while ((line = in.readLine()) != null) {
                words.add(line);
            }
            
            // Si la conexión no es null, se cierra.
            if (in != null) {
                in.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra o no se puede leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            throw new GenerateWordException("No se encuentra o no se puede leer el archivo.", true);        
        }
        
        // Genera un número aleatorio tomando como máximo el tamaño del 
        // ArrayList de palabras
        int index = random.nextInt(words.size());

        // Devuelve la palabra que se cuentra en la posición del índice
        return words.get(index);
    }

}
