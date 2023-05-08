import javax.swing.*;
import java.awt.*;

public class Question_5 {
    public Question_5(){
        JFrame frame = new JFrame("Joshua Wang's Envelope");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.add(new Drawing());
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new Question_5();
    }

    class Drawing extends JComponent {
        public void paint(Graphics g){
            g.setFont(new Font("Serif", Font.BOLD, 40));
            g.drawString("Joshua Wang", 120, 100);

            g.setFont(new Font("Serif", Font.PLAIN, 20));
            g.drawString("16 Craigmore Crescent", 140, 150);
        }
    }
}
