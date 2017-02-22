package com.example.mipc.myway.Core.Models;


public class PremioModel {
   	private int IdPremio;
	private String Descripcion;
	private int Cantidad;
	private String Imagen;
	private int Sponsor;
	private int CodigoReclamo;
	   
    public int getIdPremio (){return IdPremio;}
    public String getDescripcion (){return Descripcion;}
	public int getCantidad (){return Cantidad;}
    public String getImagen (){return Imagen;}
	public int getSponsor (){return Sponsor;}
	public int getCodigoReclamo (){return CodigoReclamo;}
	
	public void setIdPremio(int IdPremio){this.IdPremio=IdPremio;}
    public void setDescripcion(String Descripcion){this.Descripcion=Descripcion;}
	public void setCantidad(int Cantidad){this.Cantidad=Cantidad;}
    public void setImagen(String Imagen){this.Imagen=Imagen;}
	public void setSponsor(int Sponsor){this.Sponsor=Sponsor;}
	public void setCodigoReclamo(int Sponsor){this.CodigoReclamo=CodigoReclamo;}

    public PremioModel(){}
    public PremioModel( int IdPremio, String Descripcion,String Cantidad ,String Imagen, int Sponsor,  int CodigoReclamo)
    {
        this.IdPremio=IdPremio;
		this.Descripcion=Descripcion;
		this.Cantidad=Integer.getInteger(Cantidad);
		this.Imagen=Imagen;
		this.Sponsor=Sponsor;
		this.CodigoReclamo=CodigoReclamo;
    }
}
