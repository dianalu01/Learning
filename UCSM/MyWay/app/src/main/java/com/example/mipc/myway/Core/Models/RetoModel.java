package com.example.mipc.myway.Core.Models;
import java.sql.Time;
import java.sql.Date;

public class RetoModel {
   	private int IdReto;
	private String Descripcion;
	private Time TiempoLimite;
	private float PuntajeMeta;
	private Date FechaReto;
	private int Dificultad;
	private int Premio; 
   
    public int getIdReto (){return IdReto;}
    public String getDescripcion (){return Descripcion;}
	public Time getTiempoLimite (){return TiempoLimite;}
    public float getPuntajeMeta (){return PuntajeMeta;}
	public Date getFechaReto (){return FechaReto;}
	public int getDificultad (){return Dificultad;}
    public int getPremio (){return Premio;}
	
	public void setIdReto(int IdReto){this.IdReto=IdReto;}
    public void setDescripcion(String Descripcion){this.Descripcion=Descripcion;}
	public void setTiempoLimite(Time TiempoLimite){this.TiempoLimite=TiempoLimite;}
    public void setPuntajeMeta(float PuntajeMeta){this.PuntajeMeta=PuntajeMeta;}
	public void setFechaReto (Date FechaReto){this.FechaReto=FechaReto;}
	public void setDificultad (int Dificultad ){this.Dificultad=Dificultad;}
    public void setPremio (int Premio){this.Premio=Premio;}

    public RetoModel(){}
    public RetoModel( int IdReto, String Descripcion,Time TiempoLimite ,float PuntajeMeta,Date FechaReto,int Dificultad ,int Premio)
    {
        this.IdReto=IdReto;
		this.Descripcion=Descripcion; 
		this.TiempoLimite=TiempoLimite;		
		this.PuntajeMeta=PuntajeMeta;
		this.FechaReto=FechaReto; 
		this.Dificultad=Dificultad;		
		this.Premio=Premio;
    }
}
