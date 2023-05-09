import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question_1 implements ActionListener {
    JButton on = new JButton("On");
    JButton off = new JButton("Off");
    JFrame frame = new JFrame("On and Off");

    public Question_1()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        on.addActionListener(this);
        off.addActionListener(this);
        frame.setLayout(new FlowLayout());
        frame.add(on);
        frame.add(off);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {
        if (e.getSource() == on)
            frame.getContentPane().setBackground(Color.white);
        else
            frame.getContentPane().setBackground(Color.black);
    }
    
    public static void main(String[] args)
    {
        new Question_1();
    }
}