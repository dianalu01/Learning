package com.example.mipc.myway.Core.Models;
import java.sql.Time;
import java.sql.Date;

public class CodigoReclamoModel {
   	private int IdReclamo;
	private Time TiempoReclamo;
	private Date FechaEmision;
   
    public int getIdReclamo (){return IdReclamo;}
    public Time getTiempoReclamo (){return TiempoReclamo;}
	public Date getFechaEmision (){return FechaEmision;}
   
	public void setIdReclamo(int IdReclamo){this.IdReclamo=IdReclamo;}
    public void setTiempoReclamo(Time TiempoReclamo){this.TiempoReclamo=TiempoReclamo;}
	public void setFechaEmision(Date FechaEmision){this.FechaEmision=FechaEmision;}
    
    public CodigoReclamoModel(){}
    public CodigoReclamoModel( int IdReclamo, Time TiempoReclamo,Date FechaEmision)
    {
        this.IdReclamo=IdReclamo;
		this.TiempoReclamo=TiempoReclamo; 
		this.FechaEmision=FechaEmision;			
    }
}
