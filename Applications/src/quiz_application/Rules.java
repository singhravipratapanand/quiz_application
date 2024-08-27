
package quiz_application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel heading = new JLabel("welcome " + name);
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("cursive", Font.BOLD,28));
        heading.setForeground(Color.red);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("cursive", Font.PLAIN,16));
        rules.setText(
                "<html>"+ 
                "1. Duration: Exam time is 60 minutes." + "<br><br>" +
                "2. Answering: You can change answers before submitting." + "<br><br>" +
                "3. Navigation: Use \"Next\" to move between questions." + "<br><br>" +
                "4. Questions: Each question has four options. Select the correct one." + "<br><br>" +
                "5. Scoring: Each correct answer gives 10 points. No negative marking." + "<br><br>" +
                "6. Timer: Keep an eye on the timer. Your answers auto-submit when time is up." + "<br><br>" +
                "7. Lifelines: Use \"50-50\" lifelines if available to remove two wrong options." + "<br><br>" +
                "8. Issues: Report any technical issues to the invigilator immediately." + "<br><br>" +
            "<html>"
        );
        add(rules);
     
        back  = new JButton("back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(Color.MAGENTA);
        back.addActionListener(this);
        add(back);
           
        start  = new JButton("start");
        start.setBounds(400, 500, 100, 25);
        start.setBackground(Color.MAGENTA);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }else{
            setVisible(false);
            new Login();
        }
        
    } 
    
    
    public static void main(String[] args){
        new Rules("User");
    }
    
}
