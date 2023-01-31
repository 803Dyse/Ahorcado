package ui;

/**
 * Interfáz con el método generateWord declarado.
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public interface WordGenerator {
    
    public String generateWord() throws GenerateWordException;
    
}
