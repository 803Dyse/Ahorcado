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

/**
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class DBWordGenerator implements WordGenerator{
    
    private Connection c;

    @Override
    public String generateWord() throws GenerateWordException {
        
        // Crea la conexión con la base de datos word.db
        try { 
            c = DriverManager.getConnection("jdbc:sqlite:db/word.db");
            System.out.println("Conexion realizada con exito");
        } catch (Exception ex) {
            System.out.println("A conexión co servidor de bases de datos non se puido establecer.");
            ex.printStackTrace();
        }
        
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
        
        System.out.println(value);
        
        Random random = new Random();
        
        int number = random.nextInt(Integer.parseInt(value));
        int index = number + 1;
        
        for (int i = 0; i < index; i++) {
            
            
            
            
            if (i == index) {
                
            }
        }
        
        sql = "SELECT word FROM word WHERE ";
        
        try {
            Statement st = c.createStatement();
            ResultSet rst = st.executeQuery(sql);
            value = rst.getString("count");
            
            rst.close();
            st.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        return null;
        
    }
    
}
