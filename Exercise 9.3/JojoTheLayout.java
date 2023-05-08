import javax.swing.*;
import java.awt.*;

public class JojoTheLayout {
    public JojoTheLayout(){
        JFrame f = new JFrame("JojoTheLayout");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f.setResizable(false);
        f.setSize(200, 100);
        f.setLayout(new GridLayout(0, 6));
        f.setVisible(true);

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));
        f.add(new JButton("8"));
        f.add(new JButton("9"));
        f.add(new JButton("10"));
        f.add(new JButton("11"));
        f.add(new JButton("12"));
        f.add(new JButton("13"));
        f.add(new JButton("14"));
    }

    public static void main(String[] args){
        new JojoTheLayout();
    }
}