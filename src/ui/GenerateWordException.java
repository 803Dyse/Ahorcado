package ui;

/**
 * Subclase de Exception
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class GenerateWordException extends Exception {

    private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public GenerateWordException(String message, boolean visible) {
        this.visible = visible;
    }

}
