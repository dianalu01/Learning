/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista_SCM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author cristopher
 */
public class DB {
    private Connection connection = null;
    public void establishConnection()
    {
        if (connection != null)
            return;
        String url = "jdbc:postgresql://localhost:5432/";
        try
        {
           Class.forName("org.postgresql.Driver");
          
           
           connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/scm","postgres", "Report$51");
           
           if (connection != null) {
               System.out.println("Connecting to database...");
           }
        } catch(Exception e){
            System.out.println("Problem when connecting to the database 1");
        }
    }
    public void closeConnection()
    {
        try
        {
            connection.close();
        }catch(Exception e)
        {
            System.out.println("Problem to close the connection to the database");
        }
    }
    public int conectarse(String u,String c,String p){
        int resp=0;
        this.establishConnection();
        ResultSet rsa = null;
        ResultSet rsb = null;
        ResultSet rsc = null;
        Statement s = null;
        ResultSetMetaData RSS=null;
       
        try
        {
            s = connection.createStatement();
            
            rsa = s.executeQuery("SELECT nombre FROM usuarios WHERE iduser= '"+u+"'");
            if(rsa.next())//si hay usuario
                resp++;
            rsa = s.executeQuery("SELECT nombre FROM usuarios WHERE iduser= '"+u+"' AND contrasena ='"+c+"'");
            if(rsa.next())//si hay usuario
                resp++;
            rsa = s.executeQuery("SELECT * FROM registro WHERE idu='"+u+"' AND idd='"+p+"'");
            if(rsa.next())//si hay usuario
                resp++;
            
            
        
            

                           
            
            
        }catch(Exception e)
        {
            System.out.println("Problem in searching the database 111");
        }
        
        
        
        System.out.println("resp: "+resp);
        return resp;
    
    }
    
    
    
    public void registrar(String u,String d){
        int resp=0;
        this.establishConnection();
        ResultSet rsa = null;
        
        Statement s = null;
        ResultSetMetaData RSS=null;
       
        try
        {
            s = connection.createStatement();
            
            rsa = s.executeQuery("INSERT INTO registro(id, idu, idd) VALUES ('', '"+u+"', '"+d+"')"); 
                
            
            
        }catch(Exception e)
        {
            System.out.println("Problem in searching the database 111");
        }
        
        
        
        
    
    }
    public boolean commit(String u, String d){
        
        return false;
    }
    
}
