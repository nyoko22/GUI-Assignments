import javax.swing.*;
import java.awt.*;

public class Question_3 {
    public Question_3(){
        JFrame f = new JFrame("Bottom Buttons");
        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());

        // top button 
        JPanel top = new JPanel();
        top.setLayout(new FlowLayout());
        top.add(new Button("Top"));

        // bottom buttons
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(1, 3));
        bottom.add(new Button("Yes"));
        bottom.add(new Button("No"));
        bottom.add(new Button("??"));

        // combining them
        f.add(top, BorderLayout.NORTH);
        f.add(bottom, BorderLayout.SOUTH);
    }

    public static void main(String[] args){
        new Question_3();
    }
}
