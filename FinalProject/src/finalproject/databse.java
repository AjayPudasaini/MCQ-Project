/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Ajay
 */
public class databse {
    public Connection conn; 
    PreparedStatement psmt;
    
    //connecting database
    public databse()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mcqproject","root","");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+e);
        }
    }
    
    //adminsignup
   public int adminsignup(String name, String password, String email)
   {
       int result=0;
       try {
           psmt=conn.prepareStatement("insert into admin values(?,?,?)");
           psmt.setString(1, name);
           psmt.setString(2, password);
           psmt.setString(3, email);
           result=psmt.executeUpdate();
           
       } catch (SQLException e) {
           System.out.println("Error: "+e);
       }
        return result;
   }
   
 
   
   //usersignup
   public int usersignup(String name, String password, String email)
   {
       int result=0;
       try {
           psmt=conn.prepareStatement("insert into user values(?,?,?)");
           psmt.setString(1, name);
           psmt.setString(2, password);
           psmt.setString(3, email);
           result=psmt.executeUpdate();
           
       } catch (SQLException e) {
           System.out.println("Error: "+e);
       }
        return result;
   }
   
   
   //adminlogin
   public int adminlogin(String name, String password)
   {
       int result=0;
       try {
           psmt=conn.prepareStatement(" select * from admin where name=? and password=? ");
           psmt.setString(1, name);
           psmt.setString(2, password);
           ResultSet rs = psmt.executeQuery();
           if(rs.next())
           {
               result=1;
               return result;
           }
           else
           {
               return result;
           }
           
           
       } catch (Exception ex) {
           System.out.println("Error: "+ex);
       }
       return result;
   }
   
   public int userlogin(String name, String password)
   {
       int result=0;
       try {
           psmt=conn.prepareStatement(" select * from User where name=? and password=? ");
           psmt.setString(1, name);
           psmt.setString(2, password);
           ResultSet rs = psmt.executeQuery();
           if(rs.next())
           {
               result=1;
               return result;
           }
           else
           {
               return result;
           }
           
           
       } catch (Exception ex) {
           System.out.println("Error: "+ex);
       }
       return result;
   }
   
 

    public int addquestion(String item, String question, String option_A, String option_B, String option_C, String option_D, String option_Ans) {
       int result=0;
       try {
           psmt=conn.prepareStatement("insert into addquestion values(?,?,?,?,?,?,?)");
           psmt.setString(1, item);
           psmt.setString(2, question);
           psmt.setString(3, option_A);
           psmt.setString(4, option_B);
           psmt.setString(5, option_C);
           psmt.setString(6, option_D);
           psmt.setString(7, option_Ans);
           result=psmt.executeUpdate();
           
       } catch (SQLException e) {
           System.out.println("Error: "+e);
       }
        return result;
    }
    
    
    public ArrayList<String> showquestion(String question)
    {
        ArrayList<String> ar = new ArrayList<>();
        try {
            String query = ("SELECT * FROM addquestion WHERE module = ?");
            
            psmt = conn.prepareStatement(query);
            psmt.setString(1, question);
            ResultSet result = psmt.executeQuery();
            while(result.next())
            {
                ar.add(result.getString("question"));
                ar.add(result.getString("option_A"));
                ar.add(result.getString("option_B"));
                ar.add(result.getString("option_C"));
                ar.add(result.getString("option_D"));
                ar.add(result.getString("option_Ans"));
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return ar;
    }

   
      
    

    
    public String GenerateToken()
    {
        String charSet;
        String TokenNum;
        
        charSet="ghsoftwaricaantacoventryjastoncclixodearwhjfdlygagtdotkht34nxasieg5818345nccid";
        TokenNum="";
        
        for (int i=1;i<=10;i++)
        {
            TokenNum+=charSet.charAt(new Random().nextInt(charSet.length()));
        }
        
        return TokenNum;
    }

  
   
}



    
    

