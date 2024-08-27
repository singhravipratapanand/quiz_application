package quiz_application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(null);
        
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(image1);
        image.setBounds(0 ,0 ,600,500);
        add(image);
        
        JLabel heading = new JLabel("Are you ready for Quiz?");
        heading.setBounds(650,60,600,45);
        heading.setFont(new Font("Lobster", Font.BOLD,40));
        heading.setForeground(Color.red);
        add(heading);
        
        JLabel name = new JLabel("Enter your name:");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Lobster", Font.BOLD,20));
        name.setForeground(Color.red);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Lobster", Font.BOLD,18));
        add(tfname);
        
        rules  = new JButton("rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.MAGENTA);
        rules.addActionListener(this);
        add(rules);
        
        back  = new JButton("back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(Color.MAGENTA);
        back.addActionListener(this);
        add(back);

        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}