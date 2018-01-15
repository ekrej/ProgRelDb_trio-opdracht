package Repositories;

import Interface.Homepage;
import Domains.Watched;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class WatchedRepo {
    public WatchedRepo() {
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                "databaseName=NetflixStatistix;user=admin;password=admin";

        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        //start de ui
        Homepage ui = new Homepage();
        SwingUtilities.invokeLater(ui);


        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl,"admin","admin");

            // Stel een SQL query samen.
            String SQL = "SELECT * FROM watched";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-32s | %-24s |\n", " ", " ", " ").replace(" ", "-"));
            //Accounts accounts = new Accounts();
            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                int profile_ID = rs.getInt("profile_ID");
                String program_name = rs.getString("program_name");
                int Percent_watched = rs.getInt("Percent_watched");

                //Account account = new Account(id, title, language, duration, genre, age);
                //accounts.addAccount(account);

                // Print de kolomwaarden.
                System.out.println(profile_ID + " " + program_name + " " + Percent_watched);

                // Met 'format' kun je de string die je print het juiste formaat geven, als je dat wilt.
                // %d = decimal, %s = string, %-32s = string, links uitgelijnd, 32 characters breed.
                System.out.format("| %7d | %-32s | %-24s | \n", profile_ID, program_name, Percent_watched);
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
}
