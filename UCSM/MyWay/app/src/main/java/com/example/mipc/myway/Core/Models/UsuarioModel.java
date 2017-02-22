package com.example.mipc.myway.Core.Models;


public class UsuarioModel {
    private String Usuario;
    private String Contraseña;
 
   
    public String getUsuario (){return Usuario;}
    public String getContraseña (){return Contraseña;}
	
	public void setUsuario(String Usuario){this.Usuario=Usuario;}
    public void setContraseña(String Contraseña){this.Contraseña=Contraseña;}

    public UsuarioModel(){}
    public UsuarioModel(String Usuario, String Contraseña)
    {
        this.Usuario = Usuario;
		this.Contraseña = Contraseña;        
    }

}
