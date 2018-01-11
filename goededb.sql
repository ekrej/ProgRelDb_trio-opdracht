use master;
DROP DATABASE IF EXISTS NetflixStatistix;
CREATE DATABASE NetflixStatistix;
GO
use NetflixStatistix;

Drop Table IF EXISTS account;
CREATE TABLE account(
	[Subnumber] [int] PRIMARY KEY IDENTITY(1,1) NOT NULL,
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
	);

	Drop Table IF EXISTS Episode;
	CREATE TABLE Episode(
	[ID] int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[runtime] TIME NOT NULL,
	[Episode_no] int,
	[Season] int,
	[series_ID] int NOT NULL,
	);
	ALTER TABLE Episode
	ADD CONSTRAINT Episode_Series FOREIGN KEY (series_ID) REFERENCES series(ID);
	Drop Table IF EXISTS Film;
CREATE TABLE Film(
	[ID] int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	[Name] varchar(50),
	[Genre] varchar(20),
	[Runtime] TIME NOT NULL,
	);


	Drop Table IF EXISTS program;
CREATE TABLE program(
	[ID] int NOT NULL ,
	[name] VARCHAR(50) NOT NULL PRIMARY KEY,
	[Age] int not null,
	);
	ALTER TABLE program
	ADD CONSTRAINT Episode_Program FOREIGN KEY (ID) REFERENCES Episode(ID);
	ALTER TABLE program
	ADD CONSTRAINT film_program FOREIGN KEY (ID) REFERENCES film(ID);
	
Drop Table IF EXISTS watched;
CREATE TABLE watched(
	[profile_ID] int NOT NULL,
	[programma_naam] varchar(50) NOT NULL,
	[Percent_watched] int NOT NULL,
	CONSTRAINT Profile_watched FOREIGN KEY (profile_ID) REFERENCES profile(ID)
		ON DELETE CASCADE
		ON UPDATE CASCADE,

	CONSTRAINT watched_program FOREIGN KEY (program_name) REFERENCES program(name)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	);
	



 



