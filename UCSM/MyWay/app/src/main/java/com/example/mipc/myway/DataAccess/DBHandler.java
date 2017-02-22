package com.example.mipc.myway.DataAccess;
import com.example.mipc.myway.Core.Models;
public class DBHandler extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "ImprovingRespectDB";
	// tUsuario table name
	private static final String tUsuario  = "tUsuario";
	private static final String Usuario     = "Usuario";
	private static final String Contraseña = "Contraseña";
	// tTipoExpresion table name
	private static final String tTipoExpresion = "tTipoExpresion";
	private static final int IdTipoExpresion = "IdTipoExpresion";
	private static final float ValorPuntaje= "ValorPuntaje ";
	// tExpresion table name
	private static final String tExpresion= "tExpresion";
	private static final int tExpresion= "IdExpresion";
	private static final int TipoExpresion = "TipoExpresion";
	private static final String Contenido  = "Contenido";
	// tSponsor table name
	private static final String tSponsor = "tSponsor ";
	private static final int IdSponsor   = "IdSponsor";
	private static final String Descripcion_Sponsor = "Descripcion_Sponsor";
	private static final String Direccion   = "Direccion";
	private static final String Telefono    = "Telefono";
	// tCodigoReclamo table name
	private static final String tCodigoReclamo  = "tCodigoReclamo";
	private static final int IdReclamo     = "IdReclamo";
	private static final String TiempoReclamo = "TiempoReclamo";
	private static final String FechaEmision = "FechaEmision";
	// tPremio table name
	private static final String tPremio   = "tPremio";
	private static final int IdPremio    = "IdPremio";
	private static final String Descripcion_Premio = "Descripcion_Premio";
	private static final int Cantidad    = "Cantidad";
	private static final String Imagen      = "Imagen";
	private static final int Sponsor	= "Sponsor";
	private static final int CodigoReclamo = "CodigoReclamo ";
	// tDificultad table name	
	private static final String tDificultad   = "tDificultad";
	private static final int IdDificultad    = "IdDificultad";
	private static final String Descripcion_Dificultad = "Descripcion_Dificultad";
	// tReto table name	
	private static final String tReto   = "tReto";
	private static final int IdReto    = "IdReto";
	private static final String Descripcion_Reto = "Descripcion_Reto";
	private static final String TiempoLimite = "TiempoLimite";
	private static final float PuntajeMeta = "PuntajeMeta";
	private static final String FechaReto = "FechaReto";
	private static final int Dificultad = "Dificultad";
	private static final String Premio = "Premio";
	// tPersona table name	
	private static final String tPersona   = "tPersona";
	private static final int Dni    = "Dni";
	private static final String Usuario = "Usuario";
	private static final String Nombre = "Nombre";
	private static final String Apellido = "Apellido";
	private static final String Telefono = "Telefono";
	private static final int Reto = "Reto";
	// tLogExpresion table name	
	private static final String tLogExpresion = "tLogExpresion ";
	private static final int IdLog = "IdLog";
	private static final int Expresiones = "Expresiones";
	private static final int Persona = "Persona";
	private static final String Hora = "Hora";
	private static final String Fecha = "Fecha";	
);
	public DBHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_tUsuario = "CREATE TABLE " + tUsuario + "("
		+ Usuario     + " TEXT PRIMARY KEY," 
		+ Contraseña + " TEXT"+")";
		db.execSQL(CREATE_tUsuario);

		String CREATE_tTipoExpresion = "CREATE TABLE " + tTipoExpresion+ "("
		+ IdTipoExpresion+ " INTEGER PRIMARY KEY," 
		+ ValorPuntaje+ " INTEGER"+")";
		db.execSQL(CREATE_tTipoExpresion);

		String CREATE_tExpresion = "CREATE TABLE " + tExpresion+ "("
		+ IdExpresion+ " INTEGER PRIMARY KEY,"  
		+ TipoExpresion+ " INTEGER "+
		+ Contenido + "TEXT"+")"
		db.execSQL(CREATE_tExpresion);

		String CREATE_tSponsor = "CREATE TABLE " + tSponsor+ "("
		+ IdSponsor+ " INTEGER PRIMARY KEY,"  
		+ Descripcion_Sponsor+ " TEXT ,"+
		+ Direccion+ " TEXT ,"+
		+ Telefono+ "TEXT"+")"
		db.execSQL(CREATE_tSponsor);

		String CREATE_tCodigoReclamo = "CREATE TABLE " + tCodigoReclamo+ "("
		+ IdReclamo+ " INTEGER PRIMARY KEY,"  
		+ TiempoReclamo+ " TEXT ,"+
		+ FechaEmision+ " TEXT"+")"
		db.execSQL(CREATE_tCodigoReclamo);

		String CREATE_tPremio = "CREATE TABLE " + tPremio+ "("
		+ IdPremio+ " INTEGER PRIMARY KEY,"  
		+ Descripcion_Premio+ " TEXT, "+
		+ Cantidad+ " INTEGER, "+
		+ Imagen+ " TEXT, "+
		+ Sponsor+ " INTEGER, "+
		+ CodigoReclamo+ "INTEGER"+")"
		db.execSQL(CREATE_tPremio);

		String CREATE_tDificultad = "CREATE TABLE " + tDificultad+ "("
		+ IdDificultad+ " INTEGER PRIMARY KEY,"  
		+ Descripcion_Dificultad+ " TEXT")";
		db.execSQL(CREATE_tDificultad );

		String CREATE_tReto = "CREATE TABLE " + tReto+ "("
		+ IdReto+ " INTEGER PRIMARY KEY,"  
		+ Descripcion_Reto+ " TEXT,"+
		+ TiempoLimite+ " TEXT,"+
		+ PuntajeMeta+ " INTEGER,"+
		+ FechaReto+ " TEXT,"+
		+ Dificultad+ " TEXT,"+
		+ Premio+ " TEXT"+")"
		db.execSQL(CREATE_tReto);

		String CREATE_tPersona = "CREATE TABLE " + tPersona+ "("
		+ Dni+ " INTEGER PRIMARY KEY,"  
		+ Usuario+ " TEXT,"+
		+ Nombre+ " TEXT,"+
		+ Apellido+ " TEXT,"+
		+ Telefono+ " TEXT,"+
		+ Reto+ " INTEGER"+")"
		db.execSQL(CREATE_tPersona);

		String CREATE_tLogExpresion = "CREATE TABLE " + tLogExpresion+ "("
		+ IdLog+ " INTEGER PRIMARY KEY,"  
		+ Expresiones+ " INTEGER,"+
		+ Persona+ " INTEGER,"+
		+ Hora+ " TEXT"+
		+ Fecha+ " TEXT")";
		db.execSQL(CREATE_tLogExpresion);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_tUsuario );
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_tTipoExpresion );
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_tExpresion );
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_tSponsor );
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_tCodigoReclamo );
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_tPremio );
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_tDificultad );
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_tReto );
		db.execSQL("DROP TABLE IF EXISTS " + CREATE_tPersona );
		onCreate(db);
	}
	//Insert Tables
	public void addUsuarioModel(UsuarioModel UsuarioModel) {
	SQLiteDatabase db = this.getWritableDatabase();
	ContentValues values = new ContentValues();
	values.put(Usuario, UsuarioModel.getUsuario()); 
	values.put(Contraseña, UsuarioModel.getContraseña()); 
	db.insert(tUsuario, null, values);
	db.close();
	}
	public void addCodigoReclamoModel(CodigoReclamoModel CodigoReclamoModel) {
	SQLiteDatabase db = this.getWritableDatabase();
	ContentValues values = new ContentValues();
	values.put(IdReclamo, CodigoReclamoModel.getIdReclamo()); 
	values.put(TiempoReclamo, CodigoReclamoModel.getTiempoReclamo());
	values.put(FechaEmision, CodigoReclamoModel.getFechaEmision()); 
	db.insert(tCodigoReclamo, null, values);
	db.close();
	}
	public void addPremioModel(PremioModel PremioModel) {
	SQLiteDatabase db = this.getWritableDatabase();
	ContentValues values = new ContentValues();
	values.put(IdPremio, PremioModel.getIdPremio()); 
	values.put(Descripcion_Premio, PremioModel.getDescripcion()); 
	values.put(Cantidad, PremioModel.getCantidad()); 
	values.put(Imagen, PremioModel.getImagen()); 
	values.put(Sponsor, PremioModel.getSponsor()); 
	values.put(CodigoReclamo, PremioModel.getCodigoReclamo()); 
	db.insert(tPremio, null, values);
	db.close();
	}
	public void addSponsorModel(SponsorModel SponsorModel) {
	SQLiteDatabase db = this.getWritableDatabase();
	ContentValues values = new ContentValues();
	values.put(IdSponsor, SponsorModel.getIdSponsor()); 
	values.put(Descripcion_Sponsor, SponsorModel.getDescripcion()); 
	values.put(Direccion, SponsorModel.getDireccion()); 
	values.put(Telefono, SponsorModel.getTelefono()); 
	db.insert(tSponsor, null, values);
	db.close();
	}	
	public void addDificultadModel(DificultadModel DificultadModel) {
	SQLiteDatabase db = this.getWritableDatabase();
	ContentValues values = new ContentValues();
	values.put(IdDificultad, DificultadModel.getIdDificultad()); 
	values.put(Descripcion_Dificultad, DificultadModel.getDescripcion()); 
	db.insert(tDificultad, null, values);
	db.close();
	}
	public void addRetoModel(RetoModel RetoModel) {
	SQLiteDatabase db = this.getWritableDatabase();
	ContentValues values = new ContentValues();
	values.put(IdReto, RetoModel.getIdReto()); 
	values.put(Descripcion_Reto, RetoModel.getDescripcion()); 
	values.put(TiempoLimite, RetoModel.getTiempoLimite()); 
	values.put(PuntajeMeta, RetoModel.getPuntajeMeta()); 	
	values.put(FechaReto, RetoModel.getFechaReto());
	values.put(Dificultad, RetoModel.getDificultad());
	values.put(Premio, RetoModel.getPremio()); 	
	db.insert(tReto, null, values);
	db.close();
	}
	public void addPersonaModel(PersonaModel PersonaModel) {
	SQLiteDatabase db = this.getWritableDatabase();
	ContentValues values = new ContentValues();
	values.put(Dni, PersonaModel.getDni()); 
	values.put(Usuario, PersonaModel.getUsuario()); 
	values.put(Nombre, PersonaModel.getNombre()); 
	values.put(Apellido, PersonaModel.getApellido()); 	
	values.put(Telefono, PersonaModel.getTelefono());
	values.put(Reto, PersonaModel.getReto());
	db.insert(tPersona, null, values);
	db.close();
	}
}