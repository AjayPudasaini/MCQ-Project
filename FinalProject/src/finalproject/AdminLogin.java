/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
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
        setLayout(null);
        setSize(800,800);
        
        lblname = new JLabel(" Username:");
        lblpassword = new JLabel(" Password:");
        txtname = new JTextField();
        txtpassword = new JPasswordField();
        btnlogin = new JButton("Log In");
        btnsignup = new JButton("Sign Up");
        
        
        lblname.setBounds(10, 10, 150, 30);
        lblpassword.setBounds(10, 60, 150, 30);
        txtname.setBounds(130, 10, 150, 30);
        txtpassword.setBounds(130, 60, 150, 30);
        btnlogin.setBounds(130, 150, 150, 50);
        btnsignup.setBounds(300, 150, 150, 50);
        
        
        add(lblname);
        add(lblpassword);
        add(txtname);
        add(txtpassword);
        add(btnlogin);
        add(btnsignup);
        
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
                        int result = db.adminlogin(txtname.getText(), txtpassword.getText());
                        if(result==1)
                        {
                            JOptionPane.showMessageDialog(null, "login successfully");
                            new AdminPannel().setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "login fail");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: "+e);
                    }
 
                }
        
        
        
        
       
    }

   
    
}
