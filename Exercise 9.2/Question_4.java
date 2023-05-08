import javax.swing.*;
import java.awt.*;

public class Question_4 {
    public Question_4(){
        JFrame f = new JFrame("Mother's Day Card");
        f.add(new Drawing());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(800, 500);
    }

    public static void main(String[] args){
        new Question_4();
    }

    class Drawing extends JComponent {
        public void paint(Graphics g){
            // draws the background gradient
            for (int i = 1; i <= 200; i++){
                int scale = (int) (255 * (double) i / 200);
                g.setColor(new Color(scale, 255 - scale, scale));
                g.drawLine(0, 5 * i, 8 * i, 0);
            }

            // draws the two flowers on the sides
            g.setColor(Color.GREEN);
            g.fillRect(160, 200, 50, 500);
            g.setColor(Color.RED);
            g.fillOval(100, 80, 100, 100);
            g.fillOval(180, 80, 100, 100);
            g.fillOval(50, 150, 100, 100);
            g.fillOval(230, 150, 100, 100);
            g.fillOval(100, 220, 100, 100);
            g.fillOval(180, 220, 100, 100);
            g.setColor(Color.YELLOW);
            g.fillOval(130, 145, 120, 120);

            g.setColor(Color.GREEN);
            g.fillRect(560, 200, 50, 500);
            g.setColor(Color.RED);
            g.fillOval(500, 80, 100, 100);
            g.fillOval(580, 80, 100, 100);
            g.fillOval(450, 150, 100, 100);
            g.fillOval(630, 150, 100, 100);
            g.fillOval(500, 220, 100, 100);
            g.fillOval(580, 220, 100, 100);
            g.setColor(Color.YELLOW);
            g.fillOval(530, 145, 120, 120);

            // drawing the text
            g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 45));

            String str = "Happy Mother's Day!";
            for (int i = 0; i < 19; i++){
                int y = (int) (20 * Math.sin(((double) i / 19) * 6.2831853));
                int scale = (int) (255 * (double) i / 19);
                g.setColor(new Color(255 - scale, scale, scale));
                g.drawString(str.substring(i, i + 1), 25 + 40 * i, 50 + y);
            }
        }
    }
}
