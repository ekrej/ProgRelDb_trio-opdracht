use master;
DROP DATABASE IF EXISTS NetflixStatistix;
CREATE DATABASE NetflixStatistix;
GO
use NetflixStatistix;

Drop Table IF EXISTS account;
CREATE TABLE account(
	[Abonneenummer] [int] PRIMARY KEY IDENTITY(1,1) NOT NULL,
	[Naam] [varchar](50) NOT NULL,
	[Email] [varchar](60) NOT NULL,
	[Adres] [varchar](50) NOT NULL,
	[Woonplaats] [varchar](50) NOT NULL,
	)
	;

Drop Table IF EXISTS profiel;
CREATE TABLE profiel(
	[Naam] [varchar](50) NOT NULL,
	[GebDatum] [date] NOT NULL,
	[Abonneenummer] [int] NOT NULL,
	ID int NOT NULL IDENTITY(1,1) PRIMARY KEY ,
	CONSTRAINT Profiel_Acc 
	FOREIGN KEY (Abonneenummer) 
	REFERENCES account (Abonneenummer)
	ON DELETE CASCADE,
	);

	Drop Table IF EXISTS Serie;
	CREATE TABLE serie(
	ID int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	naam varchar(50),
	genre varchar(20),
	recomendation varchar(15),
	);

	Drop Table IF EXISTS Aflevering;
	CREATE TABLE aflevering(
	ID int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	tijdsduur TIME NOT NULL,
	aflevering_no int,
	season int,
	serie_ID int NOT NULL,
	);
	ALTER TABLE Aflevering
	ADD CONSTRAINT aflevering_Serie FOREIGN KEY (serie_ID) REFERENCES serie(ID);
	Drop Table IF EXISTS Film;
CREATE TABLE Film(
	ID int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	naam varchar(50),
	genre varchar(20),
	tijdsduur TIME NOT NULL,
	);


	Drop Table IF EXISTS programma;
CREATE TABLE programma(
	ID int NOT NULL ,
	naam VARCHAR(50) NOT NULL PRIMARY KEY,
	leeftijd int not null,
	);
	ALTER TABLE programma
	ADD CONSTRAINT aflevering_programma FOREIGN KEY (ID) REFERENCES aflevering(ID);
	ALTER TABLE programma
	ADD CONSTRAINT film_programma FOREIGN KEY (ID) REFERENCES film(ID);
	
Drop Table IF EXISTS bekeken;
CREATE TABLE bekeken(
	profiel_ID int NOT NULL,
	programma_naam varchar(50) NOT NULL,
	Percentage_gezien int NOT NULL,
	CONSTRAINT Profiel_bekeken FOREIGN KEY (profiel_ID) REFERENCES profiel(ID)
		ON DELETE CASCADE
		ON UPDATE CASCADE,

	CONSTRAINT bekeken_programma FOREIGN KEY (programma_naam) REFERENCES programma(naam)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	);
	



 



