/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alejandro Martínez Domínguez
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
        
        
        
    }
    
}
