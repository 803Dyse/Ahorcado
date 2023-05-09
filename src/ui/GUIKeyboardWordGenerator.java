package ui;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 * Método que xenera unha palabra personalizada
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class GUIKeyboardWordGenerator implements WordGenerator {

    @Override
    public String generateWord() throws GenerateWordException {
        String customWord;

        String word;

        JPasswordField pwd = new JPasswordField();

        JOptionPane.showMessageDialog(null, pwd, "Palabra:", JOptionPane.PLAIN_MESSAGE);

        char[] password = pwd.getPassword();
        word = new String(password);

        customWord = String.valueOf(word);

        if (!isValid(word)) {
            JOptionPane.showMessageDialog(null, "El caracter debe ser del abecedario (a-z).", "Error", JOptionPane.WARNING_MESSAGE);
        }

        return customWord;
    }

    /**
     * Este método comproba se todas os caracteres de word están en minúscula
     *
     * @param word a palabra a comprobar
     * @return Devolve true o false
     */
    private boolean isValid(String word) {
        // Doble if en vez de un or, porque por alguna razón no funciona
        if (word.equals(word.toLowerCase())) {
            if (word.chars().allMatch(Character::isLetter)) {
                return true;
            }
        }
        return false;
    }

}
