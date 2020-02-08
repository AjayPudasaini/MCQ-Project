/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Ajay
 */
public class AdminLogin extends JFrame implements ActionListener {
    JLabel lblname, lblpassword;
    JTextField txtname, txtpassword;
    JButton btnlogin, btnsignup;
    
    public AdminLogin()
    {
        Container c = getContentPane();
        c.setLayout(null);
        setSize(500,500);
        c.setBackground(new Color(0, 0, 51));
        c.setForeground(Color.white);
        setTitle("Admin Login Form");
        c.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        
        lblname = new JLabel(" Username:");
        lblname.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        lblname.setForeground(Color.white);
        lblpassword = new JLabel(" Password:");
        lblpassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        lblpassword.setForeground(Color.white);
        txtname = new JTextField();
        txtname.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        txtname.setForeground(Color.black);
        txtpassword = new JPasswordField();
        txtpassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        txtpassword.setForeground(Color.black);
        btnlogin = new JButton("Log In");
        btnlogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        btnlogin.setForeground(Color.white);
        btnlogin.setBackground(new Color(102, 102, 255));
        btnlogin.setForeground(Color.white);
        btnsignup = new JButton("Sign Up");
        btnsignup.setBackground(new Color(0, 230, 0));
        btnsignup.setForeground(Color.white);
        btnsignup.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        btnsignup.setForeground(Color.white);
        
        
        lblname.setBounds(10, 10, 150, 30);
        lblpassword.setBounds(10, 60, 150, 30);
        txtname.setBounds(140, 10, 150, 30);
        txtpassword.setBounds(140, 60, 150, 30);
        btnlogin.setBounds(130, 150, 150, 50);
        btnsignup.setBounds(300, 150, 150, 50);
        
        
        c.add(lblname);
        c.add(lblpassword);
        c.add(txtname);
        c.add(txtpassword);
        c.add(btnlogin);
        c.add(btnsignup);
        
        btnsignup.addActionListener(this);
        btnlogin.addActionListener(this);
        
         setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==btnsignup)
      {
         new AdminSignup().setVisible(true);
      }
        
        
        if(ae.getSource().equals(btnlogin))
                {
                    try {
                        databse db = new databse();
                        
                        if(txtname.getText().trim().isEmpty() || txtpassword.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(rootPane, "incorrect username & Password");
                            return;
                        }
                        
                        int result = db.adminlogin(txtname.getText(), txtpassword.getText());
                        if(result==1)
                        {
                            JOptionPane.showMessageDialog(null, "Welcome " +txtname.getText());
                            new AdminPannel().setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "incorrect username & Password");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: "+e);
                    }
 
                }
        
        
        
        
       
    }

   
    
}
