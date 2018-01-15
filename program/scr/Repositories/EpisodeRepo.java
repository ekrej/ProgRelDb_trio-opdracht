package Repositories;

import Interface.Homepage;
import Constructors.Episodes;
import Controllers.Episode;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EpisodeRepo {
    private String s;

    // Create a variable for the connection string.
    String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
            "databaseName=NetflixStatistix;user=admin;password=admin";

    // Declare the JDBC objects.
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public EpisodeRepo() {

        //start de ui
        Homepage ui = new Homepage();
        SwingUtilities.invokeLater(ui);


        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT *\n" +
                    "FROM Episode, Program\n" +
                    "WHERE Episode.ID = Program.E_ID";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-32s | %-24s |\n", " ", " ", " ").replace(" ", "-"));
            Episodes episodes = new Episodes();
            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                int id = rs.getInt("ID");
                String title = rs.getString("Name");
                String runtime = rs.getString("Runtime");
                int episodeNo = rs.getInt("Episode_No");
                String season = rs.getString("Season");
                int seriesID = rs.getInt("Series_ID");
                int age = rs.getInt("Age");

                Episode episode = new Episode(id, title, runtime, episodeNo, season, seriesID, age);
                episodes.addEpisode(episode);

                // Print de kolomwaarden.
                System.out.println(id + " " + title + " " + runtime + " " + episodeNo + " " + season + " " + seriesID + " " + age);

                // Met 'format' kun je de string die je print het juiste formaat geven, als je dat wilt.
                // %d = decimal, %s = string, %-32s = string, links uitgelijnd, 32 characters breed.
                System.out.format("| %7d | %-32s | %-24s | \n", id, title, runtime);
            }
            System.out.println(String.format("| %7s | %-32s | %-24s |\n", " ", " ", " ").replace(" ", "-"));


        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }

    public void avgEpisodeWatched() {
        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT AVG(Percent_Watched) FROM Watched WHERE Program_Name = " + s ;
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
        }
    }
}
