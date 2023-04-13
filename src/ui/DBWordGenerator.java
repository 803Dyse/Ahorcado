/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * Clase que xenera unha palabra a adiviñar almacenada nunha base de datos.
 * 
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class DBWordGenerator implements WordGenerator {

    private Connection c;

    @Override
    public String generateWord() throws GenerateWordException {

        // Crea la conexión con la base de datos word.db
        try {
            c = DriverManager.getConnection("jdbc:sqlite:db/word.db");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "A conexión co servidor de bases de datos non se puido establecer.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        // Consulta para saber el número de palabras que tiene la columna word
        String sql = "SELECT COUNT(word) as count FROM word";
        String value = null;
        try {
            Statement st = c.createStatement();
            ResultSet rst = st.executeQuery(sql);
            value = rst.getString("count");

            rst.close();
            st.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        Random random = new Random();
        // Genera un número aleatorio tomando como máximo el valor devuelto
        // con el count de la consulta anterior.
        int number = random.nextInt(Integer.parseInt(value));
        String randomWord = "";

        try {
            Statement st = c.createStatement();
            // Consulta que muestra una sola fila, y con el offset se marca que empiece
            // a contar desde number.
            ResultSet rst = st.executeQuery("SELECT word FROM word LIMIT 1 OFFSET " + (number));
            randomWord = rst.getString(1); // Obtiene la palabra
            rst.close();
            st.close();
            c.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return randomWord;

    }

}
