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
     * Fai visible o non o mensaxe de excepción
     */
    private boolean visible;

    /**
     * Este método obtén o valor da variable visible
     * 
     * @return Devolve o valor da variable visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Este método modifica o valor da variable visible
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
