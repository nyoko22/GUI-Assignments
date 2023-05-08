import javax.swing.*;
import java.awt.*;

public class Question_2 {
    public Question_2(){
        JFrame f = new JFrame("Question 1");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);
        f.add(new Drawing());
        f.setVisible(true);
    }

    /*
    public static void main(String[] args){
        new Question_2();
    }
    */

    class Drawing extends JComponent {
        public void paint(Graphics g){
            // top and bottom lines
            g.setColor(new Color(0, 255, 0));
            g.drawLine(150, 50, 250, 50);
            g.drawLine(150, 150, 250, 150);
        
            // left and right lines
            g.setColor(new Color(255, 0, 0));
            g.drawLine(150, 50, 150, 150);
            g.drawLine(250, 50, 250, 150);
        }
    }
}