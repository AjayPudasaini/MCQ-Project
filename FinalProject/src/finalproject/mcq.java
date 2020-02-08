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
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


/**
 *
 * @author Ajay
 */
public class mcq extends JFrame implements ActionListener{
    JLabel  lblquestion;
    JButton btnprev, btnnext, btnsubmit;
    JRadioButton rbopt1 = new JRadioButton("A ");
    
    JRadioButton rbopt2 = new JRadioButton("B ");
    JRadioButton rbopt3 = new JRadioButton("C ");
    JRadioButton rbopt4 = new JRadioButton("D ");
    int current = 0;
    String getMod;
    int marks = 0;
    String ans, correctans;
    ButtonGroup bg = new ButtonGroup();
    
    
    
        
        
        
    
    public mcq(String module)
    {
        
        Container c = getContentPane();
        c.setLayout(null);
        setSize(1000,800);
        c.setBackground(new Color(0, 0, 51));
        c.setForeground(Color.white);
        
        c.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        
        
        setTitle("MULTIPLE CHOOSEN QUESTION");
        
        
        
        lblquestion = new JLabel("Questions");
        lblquestion.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        lblquestion.setForeground(Color.white);
        
        
        getMod = module;
        
        btnprev = new JButton("Previous");
        btnprev.setBackground(new Color(102, 102, 255));
        btnprev.setForeground(Color.white);
        btnprev.setFont(new Font("Comic Sans MS", Font.PLAIN,24));
        btnnext = new JButton("Next");
        btnnext.setBackground(new Color(102, 102, 255));
        btnnext.setForeground(Color.white);
        btnnext.setFont(new Font("Comic Sans MS", Font.PLAIN,24));
        btnsubmit = new JButton("Submit Answer & Show Result");
        btnsubmit.setBackground(new Color(102, 102, 255));
        btnsubmit.setForeground(Color.white);
        btnsubmit.setFont(new Font("Comic Sans MS", Font.PLAIN,24));
        
        
        lblquestion.setBounds(20, 30, 900, 40);
        rbopt1.setBounds(20, 80, 400, 40);
        rbopt2.setBounds(20, 120, 400, 40);
        rbopt3.setBounds(20, 150, 400, 40);
        rbopt4.setBounds(20, 180, 400, 40);
        btnprev.setBounds(10, 250, 150, 40);
        btnnext.setBounds(300, 250, 150, 40);
        btnsubmit.setBounds(170, 320, 400, 40);
        
        
        rbopt1.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        rbopt1.setBackground(new Color(0, 0, 51));
        rbopt1.setForeground(Color.white);
        rbopt2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        rbopt2.setBackground(new Color(0, 0, 51));
        rbopt2.setForeground(Color.white);
        rbopt3.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
       rbopt3.setBackground(new Color(0, 0, 51));
        rbopt3.setForeground(Color.white);
        rbopt4.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        rbopt4.setBackground(new Color(0, 0, 51));
        rbopt4.setForeground(Color.white);
        
        
        
        add(lblquestion);
        bg.add(rbopt1);
        bg.add(rbopt2);
        bg.add(rbopt3);
        bg.add(rbopt4);
        c.add(btnprev);
        c.add(btnnext);
        add(btnsubmit);
        this.add(rbopt1);
        this.add(rbopt2);
        this.add(rbopt3);
        this.add(rbopt4);
        
        
        
        btnprev.addActionListener(this);
        btnnext.addActionListener(this);
        btnsubmit.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        databse db = new databse();
        
        try
        {
        ArrayList<String> q = db.showquestion(module);
        lblquestion.setText(q.get(0));
        rbopt1.setText(q.get(1));
        rbopt2.setText(q.get(2));
        rbopt3.setText(q.get(3));
        rbopt4.setText(q.get(4));
        }
        
        catch(IndexOutOfBoundsException ib)
        {
            JOptionPane.showMessageDialog(rootPane, "Out of questions");
        }
    }

    mcq() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getSelectedButton() {
        for (Enumeration<AbstractButton> buttons = bg.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
  

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(btnnext))
        {
            try {
                databse db = new databse();
                
                ArrayList<String> q = db.showquestion(getMod);
                ans = getSelectedButton();
                if(ans.equals(q.get(current +5)))
                {
                    marks +=10;
                }
                
                lblquestion.setText(q.get(current + 6));
                rbopt1.setText(q.get(current +1 +6));
                rbopt2.setText(q.get(current +2 +6));
                rbopt3.setText(q.get(current +3 +6));
                rbopt4.setText(q.get(current +4 +6));
                
                current += 6;
            } catch (IndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "end question");
                
                btnnext.setEnabled(false);
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(null,"Select Option");
            }
        }
        
        if(ae.getSource().equals(btnprev))
            
        {
            try {
                databse db = new databse();
            ArrayList<String> q = db.showquestion(getMod);
            
            current -= 10;
            
            lblquestion.setText(q.get(current + 5));
            rbopt1.setText(q.get(current +1 +5));
            rbopt2.setText(q.get(current +2 +5));
            rbopt3.setText(q.get(current +3 +5));
            rbopt4.setText(q.get(current +4 +5));
            
            current = current + 10;
             

                
            } catch (IndexOutOfBoundsException ex) {
                if(current < 0)
                {
                    current = 0;
                    JOptionPane.showMessageDialog(null, "You Reached" + "of the question", "Error", JOptionPane.OK_OPTION);
//                    btnprev.setEnabled(false);
                }
                
            }
        }
        
        if(ae.getSource().equals(btnsubmit))
        {
            JOptionPane.showMessageDialog(null, marks, "Your Result is:",
            JOptionPane.INFORMATION_MESSAGE);
            //db.saveAnswers(marks);
            btnprev.setEnabled(false);
            btnnext.setEnabled(false);
            
            
        }
    }
    

   
    
}
