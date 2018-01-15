use master;
DROP DATABASE IF EXISTS NetflixStatistix;
CREATE DATABASE NetflixStatistix;
GO
use NetflixStatistix;

	Drop Table IF EXISTS Account;
	CREATE TABLE Account(
		[Subnumber] [int] PRIMARY KEY NOT NULL,
		[Name] [varchar](50) NOT NULL,
		[Email] [varchar](60) NOT NULL,
		[Adress] [varchar](50) NOT NULL,
		[Residence] [varchar](50) NOT NULL,
	);

	Drop Table IF EXISTS Profile;
	CREATE TABLE Profile(
		ID int NOT NULL IDENTITY(1,1) PRIMARY KEY ,
		[Name] [varchar](50) NOT NULL,
		[Birthdate] [date] NOT NULL,
		[Subnumber] [int] NOT NULL,
			CONSTRAINT Profile_Acc 
			FOREIGN KEY (Subnumber) 
			REFERENCES Account (Subnumber)
			ON DELETE CASCADE,
	);

	Drop Table IF EXISTS Series;
	CREATE TABLE Series(
		[ID] int NOT NULL IDENTITY(1,1) PRIMARY KEY,
		[Name] varchar(50),
		[Genre] varchar(20),
		[Recommendation] varchar(15),
		[Language] varchar(25)
	);

	Drop Table IF EXISTS Episode;
	CREATE TABLE Episode(
		[ID] int NOT NULL  PRIMARY KEY,
		[Runtime] TIME NOT NULL,
		[Episode_No] int,
		[Season] varchar(3),
		[Series_ID] int NOT NULL,
			CONSTRAINT Episode_Series 
			FOREIGN KEY (Series_ID) 
			REFERENCES Series(ID)
	);


	Drop Table IF EXISTS Film;
	CREATE TABLE Film(
		[ID] int NOT NULL  PRIMARY KEY,
		[Genre] varchar(20),
		[Runtime] TIME NOT NULL,
		[Language] varchar(25)
	);


	Drop Table IF EXISTS Program;
	CREATE TABLE Program(
		[E_ID] int ,
		[F_ID] int ,
		[Name] VARCHAR(50) NOT NULL PRIMARY KEY,
		[Age] int not null,
			CONSTRAINT Episode_Program 
			FOREIGN KEY (E_ID) 
			REFERENCES Episode(ID),

			CONSTRAINT Film_Program 
			FOREIGN KEY (F_ID) 
			REFERENCES Film(ID)
	);

	
	Drop Table IF EXISTS Watched;
	CREATE TABLE Watched(
		[ID] int NOT NULL  PRIMARY KEY IDENTITY(1,1),
		[Profile_ID] int NOT NULL,
		[Program_Name] varchar(50) NOT NULL,
		[Percent_Watched] int NOT NULL,
			CONSTRAINT Profile_Watched 
			FOREIGN KEY (Profile_ID) 
			REFERENCES Profile(ID)
				ON DELETE CASCADE
				ON UPDATE CASCADE,

			CONSTRAINT Watched_Program 
			FOREIGN KEY (Program_Name) 
			REFERENCES Program(name)
				ON DELETE CASCADE
				ON UPDATE CASCADE,
	);
	



 



