/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author Ajay
 */
public class FinalProject extends JFrame implements ActionListener {
 JButton btnadmin,btnuser;
    /**
     * @param args the command line arguments
     */
 
 public FinalProject (){
       Container c = getContentPane();
       c.setLayout(null);
       setSize(400,400);
//       c.setTitle("Login & Regrestation");
       
       
       
        btnadmin = new JButton("Admin");
        btnuser = new JButton("User");
        
        btnadmin.setBounds(100, 120, 150, 40);
        btnuser.setBounds(100, 170, 150, 40);
        
        c.add(btnadmin);
        c.add(btnuser);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnadmin.addActionListener(this);
        btnuser.addActionListener(this);
        
        
 }
    public static void main(String[] args) {
        // TODO code application logic here
        
        FinalProject fp = new FinalProject();
        fp.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
       if(ae.getSource().equals(btnadmin))
       {
           AdminLogin al = new AdminLogin();
           al.setVisible(true);
       }
       
       if(ae.getSource().equals(btnuser))
       {
       new UserLogin().setVisible(true);
       }
    }
    
}
