import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test implements ActionListener {
    JButton zeButton = new JButton("Change Color!");

    public Test(){
        JFrame f = new JFrame("Change color");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setVisible(true);
        zeButton.addActionListener(this);
        f.setLayout(new FlowLayout());
        f.add(zeButton);
    }

    public void actionPerformed(ActionEvent e){
        zeButton.setBackground(new Color(r(), r(), r()));
    }

    public static void main(String[] args){
        new Test();
    }

    public int r(){
        return (int) (256 * Math.random());
    }
}
