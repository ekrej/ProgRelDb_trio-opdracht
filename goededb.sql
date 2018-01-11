use master;
DROP DATABASE IF EXISTS NetflixStatistix;
CREATE DATABASE NetflixStatistix;
GO
use NetflixStatistix;

Drop Table IF EXISTS account;
CREATE TABLE account(
	[Subnumber] [int] PRIMARY KEY NOT NULL,
	[Name] [varchar](50) NOT NULL,
	[Email] [varchar](60) NOT NULL,
	[Adress] [varchar](50) NOT NULL,
	[Residence] [varchar](50) NOT NULL,
	)
	;

Drop Table IF EXISTS profile;
CREATE TABLE profile(
	[Name] [varchar](50) NOT NULL,
	[Birthdate] [date] NOT NULL,
	[Subnumber] [int] NOT NULL,
	ID int NOT NULL IDENTITY(1,1) PRIMARY KEY ,
	CONSTRAINT Profile_Acc 
	FOREIGN KEY (Subnumber) 
	REFERENCES account (Subnumber)
	ON DELETE CASCADE,
	);

	Drop Table IF EXISTS Series;
	CREATE TABLE series(
	[ID] int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[Name] varchar(50),
	[Genre] varchar(20),
	[Recommendation] varchar(15),
	[language] varchar(25)
	);

	Drop Table IF EXISTS Episode;
	CREATE TABLE Episode(
	[ID] int NOT NULL  PRIMARY KEY,
	[runtime] TIME NOT NULL,
	[Episode_no] int,
	[Season] varchar(3),
	[series_ID] int NOT NULL,
	CONSTRAINT Episode_Series FOREIGN KEY (series_ID) REFERENCES series(ID)
	);


	Drop Table IF EXISTS Film;
CREATE TABLE Film(
	[ID] int NOT NULL  PRIMARY KEY,
	[Genre] varchar(20),
	[Runtime] TIME NOT NULL,
	[language] varchar(25)
	);


	Drop Table IF EXISTS program;
CREATE TABLE program(
	[E_ID] int ,
	[F_ID] int ,
	[name] VARCHAR(50) NOT NULL PRIMARY KEY,
	[Age] int not null,
	CONSTRAINT Episode_Program FOREIGN KEY (E_ID) REFERENCES Episode(ID),
	CONSTRAINT film_program FOREIGN KEY (F_ID) REFERENCES film(ID)
	);

	
Drop Table IF EXISTS watched;
CREATE TABLE watched(
	[ID] int NOT NULL  PRIMARY KEY IDENTITY(1,1),
	[profile_ID] int NOT NULL,
	[program_name] varchar(50) NOT NULL,
	[Percent_watched] int NOT NULL,
	CONSTRAINT Profile_watched FOREIGN KEY (profile_ID) REFERENCES profile(ID)
		ON DELETE CASCADE
		ON UPDATE CASCADE,

	CONSTRAINT watched_program FOREIGN KEY (program_name) REFERENCES program(name)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	);
	



 



