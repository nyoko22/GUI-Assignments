import javax.swing.*;
import java.awt.*;

public class Question_3 {
    public Question_3(){
        JFrame f = new JFrame("Question 1");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);
        f.add(new Drawing());
        f.setVisible(true);
    }

    /* 
    public static void main(String[] args){
        new Question_3();
    }
    */

    class Drawing extends JComponent {
        public void paint(Graphics g){
            // smallest square - length 20
            int[] x1 = {190, 210, 210, 190};
            int[] y1 = {90, 90, 110, 110};
            g.drawPolygon(x1, y1, 4);

            // second smallest square - length 20√2
            int[] x2 = {220, 200, 180, 200};
            int[] y2 = {100, 120, 100, 80};
            g.drawPolygon(x2, y2, 4);

            // third smallest square - length 40
            int[] x3 = {220, 220, 180, 180};
            int[] y3 = {80, 120, 120, 80};
            g.drawPolygon(x3, y3, 4);

            // fourth smallest square - length 40√2
            int[] x4 = {200, 240, 200, 160};
            int[] y4 = {60, 100, 140, 100};
            g.drawPolygon(x4, y4, 4);

            // fifth smallest square - length 80
            int[] x5 = {160, 240, 240, 160};
            int[] y5 = {60, 60, 140, 140};
            g.drawPolygon(x5, y5, 4);

            // sixth smallest square - length 80√2
            int[] x6 = {120, 200, 280, 200};
            int[] y6 = {100, 20, 100, 180};
            g.drawPolygon(x6, y6, 4);
        }
    }
}
