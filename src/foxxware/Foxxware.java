package foxxware;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author Mako. Created for Mackintosh Tool from Scratch.
 * 
 */
public class Foxxware {
   //X counts builds.
    public static int x;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
     
        
        // STARTS BY OPENING LOGIN MENU!!
      login loginframe = new login();//new instance 
        loginframe.setVisible(true);//make it visible
        loginframe.setLocationRelativeTo(null);//center on screen
        loginframe.getFOCUS();
         String user = System.getProperty("user.name");//get user of computer
         
         System.out.println(user);
        ImageIcon icon = new ImageIcon("images//icon.jpg");//opening properties of project and adding images to sources makes the image
        //compile with the program and displays the mack icon to the start toolbar on bottom of scree
loginframe.setIconImage(icon.getImage());
//actually sets the icon.


    
    // So every time program turns on a build number increases by One.
}
}




/*  The versioning will proceed as follows:
    0.0.1 - A lot of minor things complete: like finishing the menus, or fixing a few bugs.
    0.1.0 - Major Screen is complete. AKA - The ordering screen is completely functional.
    1.0.0 - The whole thing 'functions.' It is ready for testing.
*/