package ui;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 * Esta clase ten un método que devolve unha palabra creada polo xogador para
 * adiviñar no xogo, utilízase un readPassword para que o escrito non se vexa na
 * terminal. Por esta peculiaridade, o programa non funciona desde NetBeans, e
 * se debe executar dende a terminal.
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class KeyboardWordGenerator implements WordGenerator {

    /**
     * Este método permite que o usuario introduzca unha palabra que non se
     * mostra na terminal e sexa a palabra xenerada
     *
     * @return Devolve a palabra xenerada
     * @throws GenerateWordException Cando a palabra non se pode obter
     */
    @Override
    public String generateWord() throws GenerateWordException {
        
        JPasswordField pwd = new JPasswordField();
        
        String customWord = "";

        String word = JOptionPane.showInputDialog(pwd ,"Palabra", customWord);

        customWord = String.valueOf(word).toLowerCase();
        
        return customWord;
    }
    
}
