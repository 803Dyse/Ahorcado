package ui;

/**
 * 
 * Esta clase é subclase de Exception
 * 
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class GenerateWordException extends Exception {

    /**
     * 
     */
    private boolean visible;

    /**
     * 
     * @return 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * 
     * @param visible 
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     * 
     * @param message
     * @param visible 
     */
    public GenerateWordException(String message, boolean visible) {
        this.visible = visible;
    }

}
