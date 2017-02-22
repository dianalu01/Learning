/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.largeobject.LargeObject;
import org.postgresql.largeobject.LargeObjectManager;

public class dbSCM {
   public Connection conectar() {
      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/dbSCM","postgres", "postgres");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      return c;
   }
   public void guardarPrimeraVersion (ArrayList<String> archivo,String user, String nomDocumento, File archTXT) throws SQLException{
        Connection c= conectar();
        FileInputStream fis;
       try {
           fis = new FileInputStream(archTXT);
            PreparedStatement ps = c.prepareStatement("INSERT INTO documento VALUES (?,?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, nomDocumento);
            ps.setInt(3, 1);
            ps.setBinaryStream(4, fis, (int)archTXT.length());
            ps.executeUpdate();
            ps.close();
            fis.close();
        } catch (FileNotFoundException ex) {
           Logger.getLogger(dbSCM.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(dbSCM.class.getName()).log(Level.SEVERE, null, ex);
       }
        for (int i=0;i<archivo.size();i++){
            Statement st=c.createStatement();
            st.executeUpdate("INSERT INTO linea( iddocumento, idusuario, version, nrolinea, linea) VALUES ( (select idDoc from documento where nombre='"+nomDocumento
                   +"'), (select idUser from Usuarios where nombre='"+user+"'), 1, "+(i+1)+",'"+archivo.get(i)+"');");
       }
   }
   
    public String[] [] getDiferenciaLineas (String version)
    {
        Connection c= conectar();
        Statement st;
        Statement st1;
        
       try {
           st1 = c.createStatement();
            ResultSet rs1=st1.executeQuery(" select count(*) from linea where CAST(version AS INTEGER) >"+version);
            rs1.next();
             int size=rs1.getInt(1);
           st = c.createStatement();
            ResultSet rs=st.executeQuery(" select idlin, idusuario,nrolinea,linea from linea where CAST(version AS INTEGER) >"+version+"order by nrolinea;");
            int i=0;
            String[][] resultado = new String [size][4]   ;
            while(rs.next()){
                resultado[i][0]=String.valueOf(rs.getInt(1));
                resultado[i][1]=String.valueOf(rs.getInt(2));
                resultado[i][2]=String.valueOf(rs.getInt(3));
                resultado[i][3]=String.valueOf(rs.getString(4));
                i=i+1;
            }
            st.close();
            return resultado;            
           
       } catch (SQLException ex) {
           Logger.getLogger(dbSCM.class.getName()).log(Level.SEVERE, null, ex);
       }
            return null;        
    }
    
    
    public int[] getDiferencia (int idlin)
    {
        Connection c= conectar();
        Statement st;
        
       try {
           st = c.createStatement();
            ResultSet rs=st.executeQuery(" select  caracterinicio, caracterfin from diferencia where idlinea="+idlin);
            int resultado[] = new int[2];
            while(rs.next()){
                resultado[0]=rs.getInt(1);
                resultado[1]=rs.getInt(2);
            }
            st.close();
            return resultado;            
           
       } catch (SQLException ex) {
           Logger.getLogger(dbSCM.class.getName()).log(Level.SEVERE, null, ex);
       }
            return null;        
    }
    
   public void guardarlinea (String user, String nomDocumento, String linea, int nroLinea, int cInicial, int cFinal) throws SQLException{
            Connection c= conectar();
            Statement st1=c.createStatement();
            ResultSet rs=st1.executeQuery(" select (ultimaversion+1) from documento where  nombre='"+nomDocumento+"';");
            rs.next();
            int versionActual=rs.getInt(1);
            versionActual=versionActual+1;
            st1.close();
            
            Statement st=c.createStatement();
            st.executeUpdate("INSERT INTO linea( iddocumento, idusuario, version, nrolinea, linea) VALUES ( (select idDoc from documento where nombre='"+nomDocumento
                   +"') , (select idUser from Usuarios where nombre='"+user+"'), '"+versionActual+"', "+(nroLinea+1)+",'"+linea+"');");
            
            //diferencia
            Statement st2=c.createStatement();
            st2.executeUpdate("INSERT INTO diferencia(idlinea, caracterinicio, caracterfin) VALUES ((select idlin from linea where nrolinea="+(nroLinea+1)
                    +" and version ='"+versionActual+"'), '"+cInicial+"', '"+cFinal+"');");
            
            c.close();
            
       
   }
   
   public boolean existeDocumento(String name) throws SQLException
   {
       Connection c= conectar();
       Statement st=c.createStatement();
       ResultSet rs=st.executeQuery("select count(*) from documento where nombre='"+name+"'");
       rs.next();
      if(Integer.parseInt(rs.getString(1))==0){
            st.close();
            c.close();
            return false;
       }                
       st.close();
       c.close();
       return true;
   }
   public  ArrayList<String> getUltArchivo(String name) throws SQLException
   {       
       Connection c= conectar();
        PreparedStatement ps = c.prepareStatement("SELECT docUltimaVersion, LENGTH(docUltimaVersion) FROM documento WHERE nombre = ?");
        ps.setString(1, name);
            ResultSet result = ps.executeQuery();
            result.next();
           
            int len = result.getInt(2);
            byte[] buf = result.getBytes("docUltimaVersion");
            String arch = new String( buf, Charset.forName("UTF-8") );
            
            ArrayList<String> myList = new ArrayList<String>(Arrays.asList(arch.split("\\n")));
            c.close();
            
            return myList;
   }   
}
