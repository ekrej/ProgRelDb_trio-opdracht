package Repositories;

import Interface.Homepage;
import Constructors.Accounts;
import Controllers.Account;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountRepo {

    // Create a variable for the connection string.
    String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
            "databaseName=NetflixStatistix;user=admin;password=admin";

    // Declare the JDBC objects.
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;


    public AccountRepo() {

//      start de ui
        Homepage ui = new Homepage();
        SwingUtilities.invokeLater(ui);


        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT * FROM Account";
            stmt = con.createStatement();
            // Voer de query uit op de database.
            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-32s | %-24s |\n", " ", " ", " ").replace(" ", "-"));
            Accounts accounts = new Accounts();
            // Als de resultset waarden bevat dan lopen we hier door deze waarden en printen ze.
            while (rs.next()) {
                // Vraag per row de kolommen in die row op.
                int subNo = rs.getInt("Subnumber");
                String name = rs.getString("Name");
                String email = rs.getString("Email");
                String adress = rs.getString("Adress");
                String residence = rs.getString("Residence");

                Account account = new Account(subNo, name, email, adress, residence);
                accounts.addAccount(account);

                // Print de kolomwaarden.
                System.out.println(subNo + " " + name + " " + email + " " + adress + " " + residence);

                // Met 'format' kun je de string die je print het juiste formaat geven, als je dat wilt.
                // %d = decimal, %s = string, %-32s = string, links uitgelijnd, 32 characters breed.
                System.out.format("| %7d | %-32s | %-24s | \n", subNo, name, email);
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

    public void showAccountWithOneProfile() {
        try {
            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            con = DriverManager.getConnection(connectionUrl);

            // Stel een SQL query samen.
            String SQL = "SELECT Account.Email, Account.Name FROM Profile JOIN Account ON profile.Subnumber = Account.Subnumber GROUP BY Account.Email, Account.Name HAVING (COUNT(Profile.Subnumber) = 1)";
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
