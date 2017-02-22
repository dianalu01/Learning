/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public class logicaSCM {
    String Usuario="Diana";
    String documento="datos";
    FileReader leer(){
         FileReader arch = null;
        try {
            arch = new  FileReader("C:\\Users\\Mi Pc\\Documents\\DSBN\\ExamenFinal\\"+documento+".txt");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(logicaSCM.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arch;
    }
    private ArrayList<String> leerString() throws IOException {
        FileReader arch=leer();
        Scanner s = new Scanner(arch);
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
        return list;
    }
    
    String [][] diferenciasLineales (String version){ //compara la evrsion actual con el numero d version que se ingresa
        dbSCM db= new dbSCM();
            //select lineas y sus diferencias desde version+1 hasta la version final
            
            String[][] lineas= db.getDiferenciaLineas(version);
            int i=0;
            int j=-1;
            int nroLinea=0;
            int cIni=999;
            int cFin=0;
            String [][] resultado = new String [lineas.length][4];
            while(i<lineas.length) {
                
                if(Integer.parseInt(lineas[i][2])!=nroLinea){
                    j++;
                    nroLinea=Integer.parseInt(lineas[i][2]);
                    int [] res=db.getDiferencia(Integer.parseInt(lineas[i][0]));
                    resultado[j][0]=String.valueOf(nroLinea);
                    resultado[j][1]=String.valueOf(res[0]);
                    resultado[j][2]=String.valueOf(res[1]);
                    resultado[j][3]=lineas[i][3];
                }
                else{
                    int[] caracteres = new int [2];
                    if(caracteres[0]<cIni)
                        resultado[j][1]=String.valueOf(caracteres[0]);
                    if(caracteres[1]>cFin)
                        resultado[j][2]=String.valueOf(caracteres[1]);
                    
                }
                i++;
            }
            return resultado;
    }
    void guardar() throws IOException{        
        ArrayList<String> sCadena=leerString();
        dbSCM db= new dbSCM();
        try {
            if(!db.existeDocumento("datos"))
            {
                System.out.println("No Existe");
                File arch= new File("C:\\Users\\Mi Pc\\Documents\\DSBN\\ExamenFinal\\"+documento+".txt");
                db.guardarPrimeraVersion(sCadena, Usuario, documento,arch);
            }           
            else{
                System.out.println("Existe");
                  ArrayList<String> resultado =db.getUltArchivo(documento);
                int i=0;
                
                boolean cambio=false;
                
                while (i<sCadena.size() && i<resultado.size())
                {                
                    
                    int j=0;
                    int caracterInicial=0;
                    int caracterFinal=0;
                    while(j<sCadena.get(i).length()&& j<resultado.get(i).length()){
                        caracterInicial=0;
                        caracterFinal=0;
                        if(sCadena.get(i).charAt(j)!=resultado.get(i).charAt(j)){
                            if(cambio==false){
                                cambio=true;
                                caracterInicial=j;
                                caracterFinal=j;
                            }
                            else
                                caracterFinal=j;
                        }
                         j  =j+1;

                    }
                       if(cambio==true){
                            cambio=false;                         
                            db.guardarlinea(Usuario, documento,sCadena.get(i) , i, caracterInicial,caracterFinal);
                            System.out.println(j);
                       }
                    
                    i=i+1;
                    System.out.println(i);
                }
            }
            } catch (SQLException ex) {
            Logger.getLogger(logicaSCM.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
