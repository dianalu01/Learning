
use SCM


create table Repositorio(
id_repositorio nvarchar(8) not null PRIMARY KEY,
Path_repo nvarchar(100) not null)
GO

create table Archivo(
id_archivo nvarchar(8) not null PRIMARY KEY,
Nombre_Archivo nvarchar(80) not null,
nombre_Path nvarchar(80) not null)
GO


create table Usuario(
id_usuario varchar(8) not null PRIMARY KEY,
Nombre_Usuario varchar(80) not null,
Nick_Usuario nvarchar(80)not null)
Go



 select * from Archivo
 select * from Repositorio
 select * from Usuario





