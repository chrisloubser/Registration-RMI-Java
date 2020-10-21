
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christo
 */
public class ConnectionImplement implements ConnectInterface{
    
    
    public ConnectionImplement() {
        
    }
    
    

    public void insert(String ID, String name, String surname, String age, String cellnumber, String degree) throws Exception {
        //DB URL string with admin(connection) details
        String myURL = "jdbc:mysql://localhost:3306/registrants";
        String username = "root";
        String password = "";
        Connection conn = null;
        java.sql.Statement stmt = null;

        try {
            System.out.println("Connecting to DB");
            //connection statement
            conn = DriverManager.getConnection(myURL, username, password);
            System.out.println("connection made");
            stmt = conn.createStatement();
            //SQL string for adding
            String sql = "INSERT INTO students (idnumber, name, surname, age, cellnumber, degree) "
                    + "VALUES ('"+ID+"', '"+name+"', '"+surname+"', '"+age+"', '"+cellnumber+"', '"+degree+"');";
            //execute the string 
            stmt.executeUpdate(sql);
            
            }catch(Exception e){
            System.out.println(e);
        }
        }
        //return myProvince;

    
    }

