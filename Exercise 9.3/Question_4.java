import javax.swing.*;
import java.awt.*;

public class Question_4 {
    public Question_4(){
        JFrame f = new JFrame("Two Red Circles");

        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Drawing());
    }

    class Drawing extends JComponent {
        public void paint(Graphics g){
            // top left 
            g.setColor(Color.RED);
            g.fillOval(getWidth() / 4 - getWidth() / 8, getHeight() / 4 - getHeight() / 8, getWidth() / 4, getHeight() / 4);

            // bottom right
            g.fillOval(3 * getWidth() / 4 - getWidth() / 8, 3 * getHeight() / 4 - getHeight() / 8, getWidth() / 4, getHeight() / 4);
        }
    }

    public static void main(String[] args){
        new Question_4();
    }
}
