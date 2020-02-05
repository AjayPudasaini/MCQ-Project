/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Ajay
 */
public class UserDashboard extends JFrame implements ActionListener{
       JLabel lblmodule, lbltokenbumber;
       JComboBox combo;
       JTextField txttokennumber;
       JButton btnstartquiz;
       
       
       
       public UserDashboard()
       {
           
            setLayout(null);
            setSize(400,400);
            setTitle("Select Your Module Title");
            setBackground(Color.yellow);
            
            lblmodule = new JLabel("Module: ");
            combo = new JComboBox();
            combo.addItem("CS");
            combo.addItem("Java");
            combo.addItem("Python");
            combo.addItem("JavaScript");
            lbltokenbumber = new JLabel("Token Number");
            txttokennumber = new JTextField();
            btnstartquiz = new JButton("Start Quiz");
            
            lblmodule.setBounds(50, 50, 80, 40);
            combo.setBounds(120, 50, 150, 40);
            lbltokenbumber.setBounds(50,130,150,40);
            txttokennumber.setBounds(150,130,150,40);
            btnstartquiz.setBounds(100, 200, 200, 40);
            btnstartquiz.setBackground(Color.green);
            btnstartquiz.setForeground(Color.white);
            btnstartquiz.setFont(new Font("Arial", Font.BOLD,20));
            
            add(lblmodule);
            add(combo);
            add(lbltokenbumber);
            add(txttokennumber);
            add(btnstartquiz);
            
            
            btnstartquiz.addActionListener(this);
     
            setDefaultCloseOperation(EXIT_ON_CLOSE);
       }
       
    public static void main(String[] args)
    {
        mcq mq = new mcq();
        mq.setVisible(true);
//        new mcq().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnstartquiz))
        { 
             new mcq(combo.getSelectedItem().toString()).setVisible(true);
        }
    }
    
}
