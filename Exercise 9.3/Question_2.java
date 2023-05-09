import javax.swing.*;
import java.awt.*;

public class Question_2 {
    public Question_2(){
        JFrame f = new JFrame("3 Buttons");
        f.setVisible(true);
        f.setSize(140, 70);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(0, 3));
        f.add(new Button("A"));
        f.add(new Button("B"));
        f.add(new Button("C"));
    }

    public static void main(String[] args){
        new Question_2();
    }
}