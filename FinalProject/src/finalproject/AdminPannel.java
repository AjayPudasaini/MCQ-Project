/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import static com.sun.org.apache.xml.internal.serialize.LineSeparator.Web;
import java.awt.Color;
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
    JLabel lblquestion, lblopt1, lblopt2, lblopt3,lblopt4, lblans;
    JTextField txtopt1, txtopt2, txtopt3, txtopt4, txtans;
    JTextArea txtquestion;
    JButton btnaddquestion;
    
    
   
   
   public AdminPannel()
   {
       setLayout(null);
       setSize(800,800);
       setTitle("Admin Pannel");
       setBackground(Color.black);
       setForeground(Color.white);
       setFont(new Font("Arial", Font.BOLD,20));
       
       
      Combo = new JComboBox();
      Combo.addItem("CS");
      Combo.addItem("Java");
      Combo.addItem("Python");
      Combo.addItem("JavaScript");
      lblquestion = new JLabel(" Questions:");
      lblopt1= new JLabel("Option A: ");
      lblopt2= new JLabel("Option B: ");
      lblopt3= new JLabel("Option C: ");
      lblopt4= new JLabel("Option D: ");
      lblans= new JLabel("Option ANS: ");
      txtquestion = new JTextArea();
      txtopt1 = new JTextField();
      txtopt2 = new JTextField();
      txtopt3 = new JTextField();
      txtopt4 = new JTextField();
      txtans = new JTextField();
      btnaddquestion = new JButton("Add Question");
      
      
       Combo.setBounds(100, 50, 150, 40);
       lblquestion.setBounds(30, 150, 100, 30);
       lblopt1.setBounds(30, 220, 100, 30);
       lblopt2.setBounds(30, 270, 100, 30);
       lblopt3.setBounds(30, 320, 100, 30);
       lblopt4.setBounds(30, 370, 100, 30);
       lblans.setBounds(30, 420, 100, 30);
       txtquestion.setBounds(120, 130, 400, 60);
       txtopt1.setBounds(120, 220, 200, 30);
       txtopt2.setBounds(120, 270, 200, 30);
       txtopt3.setBounds(120, 320, 200, 30);
       txtopt4.setBounds(120, 370, 200, 30);
       txtans.setBounds(120, 420, 200, 30);
       btnaddquestion.setBounds(160, 470, 200, 60);
       btnaddquestion.setBackground(Color.green);
       btnaddquestion.setForeground(Color.white);
        add(lblquestion);
        add(Combo);
        add(lblopt1);
        add(lblopt2);
        add(lblopt3);
        add(lblopt4);
        add(lblans);
        add(txtquestion);
        add(txtopt1);
        add(txtopt2);
        add(txtopt3);
        add(txtopt4);
        add(txtans);
        add(btnaddquestion);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnaddquestion.addActionListener(this);
        Combo.addActionListener(this);
        
        
   }

    @Override
    public void actionPerformed(ActionEvent fe) {
        if(fe.getSource().equals(btnaddquestion))
        {
            try {
                
                databse cd = new databse();
                
                String item;
                item = Combo.getSelectedItem().toString();
            
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
