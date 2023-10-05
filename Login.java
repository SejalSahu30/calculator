package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
//import java.awt.event.*;

public class Login extends JFrame{

    JButton rules, back;
    //JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/log.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        setSize(1100, 500);
        setLocation(200, 150);
        setVisible(true);

       JLabel heading = new JLabel("This  is  Quiz");
        heading.setBounds(650, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(114,47,55));
        add(heading);

       JLabel name = new JLabel("Enter your name");
        name.setBounds(710, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(114, 47, 55));
        add(name);

        JTextField tfname = new JTextField();
        tfname.setBounds(635, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(114,47,55));
        rules.setForeground(Color.WHITE);
        rules.addActionListener((ActionListener) this);
        add(rules);

       back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(114,47,55));
        back.setForeground(Color.WHITE);
        back.addActionListener((ActionListener) this);
        add(back);

    }

/*    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }*/
    

    public static void main(String[] args) {
        new Login();
    }
}