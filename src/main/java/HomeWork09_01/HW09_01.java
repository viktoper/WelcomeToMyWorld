package HomeWork09_01;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

import static java.sql.Connection.TRANSACTION_READ_UNCOMMITTED;

public class HW09_01 {
    // JDBC test connect to ORACLE DB
    public static void main(String[] args) {

        System.out.println("1) Test connection to oracle: javahibernate@LDR11U");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;
        }
        System.out.println("Oracle JDBC Driver Registered!");

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@leader:1521:LDR11U", "javahibernate", "hibernate");
            //connection.setTransactionIsolation(READ_COMMITTED);
            connection.setAutoCommit(false);

            if (connection != null) {
                System.out.println("Connetion successfull!");
                Statement stmt = connection.createStatement();

                System.out.println("Try to insert 7, Наливайченко!");
                stmt.executeUpdate("insert into abonent (abonent_id,first_name,last_name,gender,age) values(7,'Наливайченко','Петр','ж',40)");
                connection.commit();
                System.out.println("Commited..");

                System.out.println("Try to get all abonents:");
                stmt.executeQuery("select * from abonent");
                ResultSet rs = stmt.getResultSet();

                if (rs != null) {
                    while (rs.next()) {

                        // ABONENT_ID, FIRST_NAME, LAST_NAME, GENDER, AGE
                        int iABONENT_ID = rs.getInt("ABONENT_ID");
                        String sFIRST_NAME = rs.getString("FIRST_NAME");
                        String sLAST_NAME = rs.getString("LAST_NAME");
                        String sGENDER = rs.getString("GENDER");
                        int iAGE = rs.getInt("AGE");

                        System.out.println("ROW = " + iABONENT_ID + " " + sFIRST_NAME + " " + sLAST_NAME + " " + sGENDER + " " + iAGE);
                    }
                }
            } else {
                System.out.println("Failed to make connection!");
                connection.rollback();
            }
        }
        catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

    }
}