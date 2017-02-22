/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class SCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, SQLException {
        try {
            // TODO code application logic here
            logicaSCM l = new logicaSCM();
            l.leer();
            l.guardar();
            l.diferenciasLineales("1");
        } catch (IOException ex) {
            Logger.getLogger(SCM.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
    }
    
}
