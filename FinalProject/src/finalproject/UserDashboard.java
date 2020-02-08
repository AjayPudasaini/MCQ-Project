/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.awt.Color;
import java.awt.Container;
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
       String getToken;
       
       
       public UserDashboard(String token)
       {
            Container c = getContentPane();
            c.setLayout(null);
            setSize(500,500);
            c.setBackground(new Color(0, 0, 51));
            c.setForeground(Color.white);

            c.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));

           setTitle("Choose Module || Enter Token No '");
           
           getToken = token;
           
            
            setTitle("Select Your Module Title");
            
            
            lblmodule = new JLabel("Module: ");
            lblmodule.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
            lblmodule.setForeground(Color.white);
            combo = new JComboBox();
            combo.addItem("CS");
            combo.addItem("Java");
            combo.addItem("Python");
            combo.addItem("JavaScript");
            combo.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
            combo.setForeground(Color.black);
            lbltokenbumber = new JLabel("Token Number");
            lbltokenbumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
            lbltokenbumber.setForeground(Color.white);
            txttokennumber = new JTextField();
            txttokennumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
            txttokennumber.setForeground(Color.black);
            btnstartquiz = new JButton("Start Quiz");
            btnstartquiz.setBackground(new Color(102, 102, 255));
            btnstartquiz.setForeground(Color.white);
            btnstartquiz.setFont(new Font("Comic Sans MS", Font.PLAIN,24));
            
            lblmodule.setBounds(40, 50, 100, 40);
            combo.setBounds(220, 50, 150, 40);
            lbltokenbumber.setBounds(50,130,180,40);
            txttokennumber.setBounds(220,130,150,40);
            btnstartquiz.setBounds(100, 200, 200, 40);
           
            
            c.add(lblmodule);
            c.add(combo);
            c.add(lbltokenbumber);
            c.add(txttokennumber);
            c.add(btnstartquiz);
            
            
            btnstartquiz.addActionListener(this);
     
            setDefaultCloseOperation(EXIT_ON_CLOSE);
       }
       
    public static void main(String[] args)
    {
        mcq mq = new mcq();
        mq.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnstartquiz))
        { 
            try {
                
                if(txttokennumber.getText().equals(getToken))
                {
                
                new mcq(combo.getSelectedItem().toString()).setVisible(true);  
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Incorrect token input");
                }
            } 
            catch (Exception de) {
                System.out.println("Error: "+de);
                
            }
           
            
        }
    }

    
}
