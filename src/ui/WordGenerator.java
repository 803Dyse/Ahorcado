package ui;

/**
 * Esta clase é unha interfaz co método generateWord declarado.
 * 
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public interface WordGenerator {
    
    /**
     * 
     * @return
     * @throws GenerateWordException 
     */
    public String generateWord() throws GenerateWordException;
    
}
