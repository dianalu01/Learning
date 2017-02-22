package com.example.mipc.myway.Core.Models;


public class DificultadModel {
   	private String IdDificultad;
	private String Descripcion;
   
    public String getIdDificultad (){return IdDificultad;}
	public String getDescripcion (){return Descripcion;}
   
    public void setIdDificultad(String IdDificultad){this.IdDificultad=IdDificultad;}
	public void setDescripcion(String Descripcion){this.Descripcion=Descripcion;}
    
    public DificultadModel(){}
    public DificultadModel( String IdDificultad,String Descripcion)
    {
		this.IdDificultad=IdDificultad; 
		this.Descripcion=Descripcion;			
    }
}
