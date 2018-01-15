use NetflixStatistix

/*account data*/
INSERT INTO Account (Subnumber, Name, Email, Adress, Residence)
VALUES (1215426, 'Fam. van Raalte', 'Raalte@gmail.com', 'Schopenhauerdijkje 5 3991 ML', 'Houten' );

INSERT INTO Account (Subnumber, Name, Email, Adress, Residence)
VALUES (5602533, 'J. van Betlehem', 'JvBetlehem@hotmail.de', 'Nietzschestraat 99 8542 BE', 'Breda' );

INSERT INTO Account (Subnumber, Name, Email, Adress, Residence)
VALUES (5285824, 'F. de Kat', 'FitKat@gmail.com', 'Kantlaan 11 8542 CD', 'breda' );


/*profile data*/
INSERT INTO Profile(Subnumber, Name, Birthdate)
VALUES (1215426,'Frank', '1968-1-25');

INSERT INTO Profile(Subnumber, Name, Birthdate)
VALUES (1215426, 'Madelief', '2001-8-19');

INSERT INTO Profile(Subnumber, Name, Birthdate)
VALUES (5602533, 'Petrus', '1999-6-26');

INSERT INTO Profile(Subnumber, Name, Birthdate)
VALUES (5602533, 'Paulus', '1999-6-26');

INSERT INTO Profile(Subnumber, Name, Birthdate)
VALUES (5285824, 'Fritz', '1968-8-19');

INSERT INTO Profile(Subnumber, Name, Birthdate)
VALUES (5285824, 'Diana', '1988-12-25');


/*Serie Data*/
INSERT INTO Series(Name, Genre, Recommendation, Language)
Values('sherlock', 'Detective', 'Fargo', 'Engels');

INSERT INTO Series(Name, Genre, Recommendation, Language)
Values('Breaking Bad', 'Spanning', 'Fargo', 'Engels-Amerikaans');

INSERT INTO Series(Name, Genre, Recommendation, Language)
Values('fargo', 'Spanning', 'Breaking bad', 'Engels-Amerikaans');


/*Episode Data*/
	/*Sherlock*/
	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(1001, '01:18:00', 01, 'S01', 1);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(1002, '01:18:00', 02, 'S01', 1);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(1003, '01:18:00', 03, 'S01', 1);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(1004, '01:18:00', 01, 'S02', 1);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(1005, '01:18:00', 02, 'S02', 1);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(1006, '01:18:00', 03, 'S02', 1);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(1007, '01:18:00', 01, 'S03', 1);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(1008, '01:18:00', 02, 'S03', 1);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(1009, '01:18:00', 03, 'S03', 1);

	/*Breaking bad*/
	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2000, '00:58:00', 01, 'S01', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2001, '00:48:00', 02, 'S01', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2002, '00:48:00', 03, 'S01', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2003, '00:48:00', 04, 'S01', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2004, '00:48:00', 05, 'S01', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2005, '00:48:00', 06, 'S01', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2006, '00:48:00', 07, 'S01', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2007, '00:48:00', 01, 'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2008, '00:48:00', 02, 'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2009, '00:48:00', 03, 'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2010, '00:48:00', 04, 'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2011, '00:48:00', 05, 'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2012, '00:48:00', 06, 'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2013, '00:48:00', 07, 'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2014, '00:48:00', 08, 'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2015, '00:48:00', 09, 'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2016, '00:48:00', 10,'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2017, '00:48:00', 11,'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2018, '00:48:00', 12,'S02', 2);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(2019, '00:48:00', 13,'S02', 2);

	/*fargo*/
	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(3001, '01:08:00', 01, 'S01', 3);

	INSERT INTO Episode(ID, Runtime, Episode_No, Season, Series_ID)
	Values(3002, '01:08:00', 02, 'S01', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3003, '01:08:00', 03, 'S01', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3004, '01:08:00', 04, 'S01', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3005, '01:08:00', 05, 'S01', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3006, '01:08:00', 06, 'S01', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3007, '01:08:00', 07, 'S01', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3008, '01:08:00', 08, 'S01', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3009, '01:08:00', 09, 'S01', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3010, '01:08:00', 10, 'S01', 3);
	
	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3101, '01:08:00', 01, 'S02', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3102, '01:08:00', 02, 'S02', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3103, '01:08:00', 03, 'S02', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3104, '01:08:00', 04, 'S02', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3105, '01:08:00', 05, 'S02', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3106, '01:08:00', 06, 'S02', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3107, '01:08:00', 07, 'S02', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3108, '01:08:00', 08, 'S02', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3109, '01:08:00', 09, 'S02', 3);

	INSERT INTO Episode(ID, runtime, Episode_no, Season, series_ID)
	Values(3110, '01:08:00', 10, 'S02', 3);


/*film Data*/
INSERT INTO Film(ID, language, Runtime, Genre)
Values( 1010, 'Engels', '01:29:00', 'Detective');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8001, 'Engels', '01:34:00', 'Humor');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8002, 'Engels-Amerikaans', '02:34:00', 'Misdaad');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8004, 'Nederlands', '01:20:00', 'Erotiek');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8008, 'Engels-Amerikaans', '01:39:00', 'Misdaad');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8010, 'Engels-Amerikaans', '02:41:00', 'Western');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8011, 'Engels-Amerikaans', '01:43:00', 'Humor');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8012, 'Nederlands', '01:37:00', 'Humor');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8014, 'Duits', '02:58:00', 'Oorlog');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8016, 'Vlaams', '01:48:00', 'Humor');

INSERT INTO Film(ID, language, Runtime, Genre)
Values( 8017, 'Engels', '02:16:00', 'Sience Fiction');


/*program Data*/
	/*movies*/
	INSERT INTO program(F_ID, name, age)
	Values(1010, 'The Abominable Bride', 12);

	INSERT INTO program(F_ID, name, age)
	Values(8001, 'The Life of Brian', 12);

	INSERT INTO program(F_ID, name, age)
	Values(8002, 'Pulp Fiction', 16);

	INSERT INTO program(F_ID, name, age)
	Values(8004, 'Pruimebloesem', 18);

	INSERT INTO program(F_ID, name, age)
	Values(8008, 'Reservoir Dogs', 16);

	INSERT INTO program(F_ID, name, age)
	Values(8010, 'The Good, the Bad and the Ugly', 12);

	INSERT INTO program(F_ID, name, age)
	Values(8011, 'Andy Warhol’s Dracula', 16);

	INSERT INTO program(F_ID, name, age)
	Values(8012, 'Ober', 6);

	INSERT INTO program(F_ID, name, age)
	Values(8014, 'Der Untergang', 6);

	INSERT INTO program(F_ID, name, age)
	Values(8016, 'De helaasheid der dingen', 12);

	INSERT INTO program(F_ID, name, age)
	Values(8017, 'A Clockwork Orange', 16);

	/*afleveringen*/
		/*sherlock*/
	INSERT INTO program(E_ID, name, age)
	Values(1001, 'A Study in Pink', 12);

	INSERT INTO program(E_ID, name, age)
	Values(1002, 'The Blind Banker', 12);

	INSERT INTO program(E_ID, name, age)
	Values(1003, 'The Great Game', 12);

	INSERT INTO program(E_ID, name, age)
	Values(1004, 'A Scandal in Belgravia', 12);

	INSERT INTO program(E_ID, name, age)
	Values(1005, 'The Hounds of Baskerville', 12);

	INSERT INTO program(E_ID, name, age)
	Values(1006, 'The Reichenbach Fall', 12);

	INSERT INTO program(E_ID, name, age)
	Values(1007, 'The Empty Hearse', 12);

	INSERT INTO program(E_ID, name, age)
	Values(1008, 'The Sign of Three', 12);

	INSERT INTO program(E_ID, name, age)
	Values(1009, 'His Last Vow', 12);

		/*Breaking Bad*/
	INSERT INTO program(E_ID, name, age)
	Values(2000, 'Pilot', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2001, 'Cat’s in the Bag…', 16);

	INSERT INTO program(E_ID, name, Age)
	Values(2002, '…And the Bag’s in the River', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2003, 'Cancer Man', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2004, 'Gray Matter', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2005, 'Crazy Handful of Nothin’', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2006, 'A No-Rough-Stuff-Type Deal', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2007, 'Seven Thirty-Seven', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2008, 'Grilled', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2009, 'Bit by a Dead Bee', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2010, 'Down', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2011, 'Breakage', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2012, 'Peekaboo', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2013, 'Negro Y Azul', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2014, 'Better Call Saul', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2015, '4 Days Out', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2016, 'Over', 16 );

	INSERT INTO program(E_ID, name, age )
	Values(2017, 'Mandala', 16);
	
	INSERT INTO program(E_ID, name, age)
	Values(2018, 'Phoenix', 16);

	INSERT INTO program(E_ID, name, age)
	Values(2019, 'ABQ', 16);
	
		/*Fargo */
	INSERT INTO program(E_ID, name, age)
	Values(3001, 'The Crocodile’s Dilemma', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3002, 'The Rooster Prince', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3003, 'A Muddy Road', 16);
	
	INSERT INTO program(E_ID, name, age)
	Values(3004, 'Eating the Blame', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3005, 'The Six Ungraspables', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3006, 'Buridan’s Ass', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3007, 'Who Shaves the Barber?', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3008, 'The Heap', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3009, 'A Fox, a Rabbit, and a Cabbage', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3010, 'Morton’s Fork', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3101, 'Waiting for Dutch', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3102, 'Before the Law', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3103, 'The Myth of Sisyphus', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3104, 'The Gift of the Magi', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3105, 'Fear and Trembling', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3106, 'Rhinoceros', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3107, 'Did you do this? No, you did it!', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3108, 'Loplop', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3109, 'The Castle', 16);

	INSERT INTO program(E_ID, name, age)
	Values(3110, 'Palindrome', 16);


/*watched data*/
	/*Frank*/
INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (1, 'A Study in Pink', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (1, 'The Blind Banker', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (1, 'The Great Game', 78);

	/*Madelief*/
INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (2, 'A Study in Pink', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (2, 'The Blind Banker', 60);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (2, 'The Crocodile’s Dilemma', 91);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (2, 'Cat’s in the Bag…', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (2, '…And the Bag’s in the River', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (2, 'Cancer Man', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (2, 'Gray Matter', 22);

	/*Petrus*/
INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (3, 'The Crocodile’s Dilemma', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (3, 'The Rooster Prince', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (3, 'Morton’s Fork', 60);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (3, 'The Life of Brian', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (3, 'Pulp Fiction', 99);

	/*paulus*/
INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (4, 'The Crocodile’s Dilemma', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (4, 'The Rooster Prince', 74);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (4, 'Morton’s Fork', 60);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (4, 'The Life of Brian', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (4, 'ABQ', 10);

	/*Fritz*/
INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (5, 'A Study in Pink', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (5, 'The Blind Banker', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (5, 'The Abominable Bride', 5);

	/*Diana*/
INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (6, 'Pulp Fiction', 100);

INSERT INTO watched(profile_ID, program_name, Percent_watched)
VALUES (6, 'A Study in Pink', 45);
