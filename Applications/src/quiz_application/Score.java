
package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
        Score(String name,int score){
        setBounds(400,150,750,550);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image image2 = image1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image1);
        image.setBounds(0 ,200 ,300,250);
        add(image);
        
        JLabel heading = new JLabel("thank you "+ name + " for your attempt!");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("cursive", Font.PLAIN,26));
        heading.setForeground(Color.black);
        add(heading);
        
        JLabel lblscore = new JLabel("your score is "+ score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("cursive", Font.PLAIN,26));
        lblscore.setForeground(Color.black);
        add(lblscore);
        
        JButton submit = new JButton("play again!");
        submit.setBounds(380,270,120,30);
        submit.setBackground(Color.blue);
        submit.setForeground(Color.red);
        submit.addActionListener(this);
        add(submit);
        
        
        setVisible(true);
}
        
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
        
    public void main(String[]args){
        new Score("user",0);
    }
}
