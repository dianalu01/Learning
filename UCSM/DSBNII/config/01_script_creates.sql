CREATE TABLE RepositoryDB (
	ID_REPOSITORY nvarchar(2) PRIMARY KEY,
	PATH_RESPOSITORY nvarchar(100) NOT NULL
)
GO

CREATE TABLE FileDB (
	ID_FILE nvarchar(2) PRIMARY KEY,
	NAME_FILE nvarchar(40) NOT NULL,
	PATH_FILE nvarchar(100) NOT NULL
)
GO

CREATE TABLE UsersDB (
	ID_USER nvarchar(2) PRIMARY KEY,
	NAME_USER nvarchar(40) NOT NULL,
	NICK_USER nvarchar(40) NOT NULL
)
GO
 