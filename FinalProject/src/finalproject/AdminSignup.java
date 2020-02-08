/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.HeadlessException;
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
public class AdminSignup extends JFrame implements ActionListener {
    JLabel lblname, lblpassword, lblemail;
    JTextField txtname, txtpassword, txtemail;
    JButton btnsignup, btnback;
    
    public AdminSignup()
    {
        setLayout(null);
        setSize(800,800);
        setTitle("Admin Regrestation");
        
        
        lblname = new JLabel(" Username:");
        lblpassword = new JLabel(" Password:");
        lblemail = new JLabel("Email Address:");
        btnsignup = new JButton("sign up");
        btnback = new JButton("I have Alredy Account");
        
        
        txtname = new JTextField();
        txtpassword = new JPasswordField();
        txtemail = new JTextField();
        
        lblname.setBounds(10, 10, 150, 30);
        lblpassword.setBounds(10, 60, 150, 30);
        lblemail.setBounds(10,100,150,30);
        txtname.setBounds(130, 10, 150, 30);
        txtpassword.setBounds(130, 60, 150, 30);
        txtemail.setBounds(130, 100, 150, 30);
        btnsignup.setBounds(130, 150, 150, 50);
        btnback.setBounds(300, 150, 150, 50);
        
        add(lblemail);
        add(lblname);
        add(lblpassword);
        add(txtname);
        add(txtpassword);
        add(txtemail);
        add(btnsignup);
        add(btnback);
        
        btnback.addActionListener(this);
        btnsignup.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==btnsignup)
        {
            try {
                databse db = new databse();
                if(txtname.getText().trim().isEmpty() || txtpassword.getText().trim().isEmpty() || txtemail.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(rootPane, "Please fill the Email, Username & password");
                            return;
                        }
                int result = db.adminsignup(txtname.getText(), txtpassword.getText(), txtemail.getText());
                if(result>0)
                {
                    JOptionPane.showMessageDialog(null, " Admin Account Created Sucessfulley");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,  "Admin Database Error");
                }
            } catch (Exception ex) {
                System.out.println("Error: "+ex);
            }
        }

        //open AdminLogin Form
        if(ae.getSource()==btnback)
      {
         new AdminLogin().setVisible(true);
      }
    }

    
}
