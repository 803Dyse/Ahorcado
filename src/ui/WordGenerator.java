package ui;

/**
 * Esta clase é unha interfaz co método generateWord declarado.
 * 
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public interface WordGenerator {
    
    /**
     * Este método é definido
     * 
     * @return Devolve un String
     * @throws GenerateWordException Cando a palabra non se pode obter 
     */
    public String generateWord() throws GenerateWordException;
    
}
