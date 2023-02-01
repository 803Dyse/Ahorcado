package ui;

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

    @Override
    public String generateWord() throws GenerateWordException {
        String customWord;

        // Texto introducido invisible que se garda nun array de char
        char[] ch = System.console().readPassword();

        // En customWord transformase o array de chars "ch" nun String
        customWord = String.valueOf(ch);

        return customWord;
    }

}
