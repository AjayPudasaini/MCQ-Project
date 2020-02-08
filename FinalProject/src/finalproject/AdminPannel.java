/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import static com.sun.org.apache.xml.internal.serialize.LineSeparator.Web;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javafx.scene.paint.Color.color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;


/**
 *
 * @author Ajay
 */
public class AdminPannel extends JFrame implements ActionListener {
    JComboBox Combo;
    JLabel lblmodule, lblquestion, lblopt1, lblopt2, lblopt3,lblopt4, lblans;
    JTextField txtopt1, txtopt2, txtopt3, txtopt4, txtans;
    JTextArea txtquestion;
    JButton btnaddquestion, btnback;
    
    
   
   
   public AdminPannel()
   {
       Container c = getContentPane();
        c.setLayout(null);
        setSize(800,800);
        c.setBackground(new Color(0, 0, 51));
        c.setForeground(Color.white);
        
        c.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
       
       setTitle("Add Question 'Admin Pannel'");
       
       
      lblmodule = new JLabel("Module: ");
      lblmodule.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
      lblmodule.setForeground(Color.white);
      Combo = new JComboBox();
      Combo.addItem("CS");
      Combo.addItem("Java");
      Combo.addItem("Python");
      Combo.addItem("JavaScript");
      Combo.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
      Combo.setForeground(Color.black);
      lblquestion = new JLabel(" Questions:");
      lblquestion.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
      lblquestion.setForeground(Color.white);
      lblopt1= new JLabel("Option A: ");
      lblopt1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
      lblopt1.setForeground(Color.white);
      lblopt2= new JLabel("Option B: ");
      lblopt2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
      lblopt2.setForeground(Color.white);
      lblopt3= new JLabel("Option C: ");
      lblopt3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
      lblopt3.setForeground(Color.white);
      lblopt4= new JLabel("Option D: ");
      lblopt4.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
      lblopt4.setForeground(Color.white);
      lblans= new JLabel("Option ANS: ");
      lblans.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
      lblans.setForeground(Color.white);
      txtquestion = new JTextArea();
      txtquestion.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      txtquestion.setForeground(Color.black);
      txtopt1 = new JTextField();
      txtopt1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      txtopt1.setForeground(Color.black);
      txtopt2 = new JTextField();
      txtopt2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      txtopt2.setForeground(Color.black);
      txtopt3 = new JTextField();
      txtopt3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      txtopt3.setForeground(Color.black);
      txtopt4 = new JTextField();
      txtopt4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      txtopt4.setForeground(Color.black);
      txtans = new JTextField();
      txtans.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
      txtans.setForeground(Color.black);
      btnaddquestion = new JButton("Add Question");
      btnaddquestion.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
      btnaddquestion.setBackground(new Color(102, 102, 255));
      btnaddquestion.setForeground(Color.white);
      btnback = new JButton("Back to Login Dashboard");
      btnback.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
      btnback.setBackground(new Color(0, 230, 0));
      btnback.setForeground(Color.white);
      
       lblmodule.setBounds(30, 50, 150, 30);
       Combo.setBounds(210, 50, 150, 40);
       lblquestion.setBounds(30, 150, 150, 30);
       lblopt1.setBounds(30, 220, 150, 30);
       lblopt2.setBounds(30, 270, 150, 30);
       lblopt3.setBounds(30, 320, 150, 30);
       lblopt4.setBounds(30, 370, 150, 30);
       lblans.setBounds(30, 420, 150, 30);
       txtquestion.setBounds(210, 130, 400, 60);
       txtopt1.setBounds(210, 220, 200, 30);
       txtopt2.setBounds(210, 270, 200, 30);
       txtopt3.setBounds(210, 320, 200, 30);
       txtopt4.setBounds(210, 370, 200, 30);
       txtans.setBounds(210, 420, 200, 30);
       btnaddquestion.setBounds(130, 520, 280, 60);
       btnback.setBounds(100, 600, 420, 60);
       
        c.add(lblmodule);
        c.add(lblquestion);
        c.add(Combo);
        c.add(lblopt1);
        c.add(lblopt2);
        c.add(lblopt3);
        c.add(lblopt4);
        c.add(lblans);
        c.add(txtquestion);
        c.add(txtopt1);
        c.add(txtopt2);
        c.add(txtopt3);
        c.add(txtopt4);
        c.add(txtans);
        c.add(btnaddquestion);
        c.add(btnback);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnaddquestion.addActionListener(this);
        Combo.addActionListener(this);
        btnback.addActionListener(this);
        
        
   }

    @Override
    public void actionPerformed(ActionEvent fe) {
        if(fe.getSource().equals(btnback))
        {
            new FinalProject().setVisible(true);
        }
        
        if(fe.getSource().equals(btnaddquestion))
        {
            try {
                
                databse cd = new databse();
                
                String item;
                item = Combo.getSelectedItem().toString();
                
                 if(txtquestion.getText().trim().isEmpty() || txtopt1.getText().trim().isEmpty() || txtopt2.getText().trim().isEmpty() || txtopt3.getText().trim().isEmpty() || txtopt4.getText().trim().isEmpty() || txtans.getText().trim().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Text box is empty");
                        return;
                    }
                int result = cd.addquestion(item, txtquestion.getText(), txtopt1.getText(), txtopt2.getText(), txtopt3.getText(), txtopt4.getText(), txtans.getText());
                if(result>0)
                {
                    
                   
                    
                    JOptionPane.showMessageDialog(null, "Sucessfulley Added Question","Sucess", JOptionPane.OK_OPTION);
                    
                    txtquestion.setText("");
                    txtopt1.setText("");
                    txtopt2.setText("");
                    txtopt3.setText("");
                    txtopt4.setText("");
                    txtans.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Inserting Error","Error",
                    JOptionPane.OK_OPTION);
                }
            } catch (Exception ex) {
                System.out.println("Error: "+ex);
            }
           
            
            
           
        }
    }

   
    
}
