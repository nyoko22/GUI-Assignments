import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Question_2 implements ActionListener {
    int petalIndex = 0;
    int centerIndex = 0;
    Color[] petalColors = {Color.RED, Color.PINK, Color.MAGENTA, Color.ORANGE, Color.LIGHT_GRAY, Color.BLUE};
    Color[] centerColors = {Color.YELLOW, Color.CYAN, Color.BLACK, Color.WHITE};

    JButton changePetal = new JButton("Change petal color");
    JButton changeCenter = new JButton("Change center color");

    Drawing draw = new Drawing();

    public Question_2(){
        JFrame f = new JFrame("Mother's Day Card");
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(1100, 500);
        f.setResizable(false);
        f.setLayout(new BorderLayout());
        f.add(draw, BorderLayout.CENTER);

        // adding the buttons
        f.add(changePetal, BorderLayout.WEST);
        f.add(changeCenter, BorderLayout.EAST);

        changePetal.addActionListener(this);
        changeCenter.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == changePetal){
            petalIndex = (petalIndex + 1) % petalColors.length;
        } else if (e.getSource() == changeCenter){
            centerIndex = (centerIndex + 1) % centerColors.length;
        }
        draw.repaint();
    }

    public static void main(String[] args){
        new Question_2();
    }

    class Drawing extends JComponent {
        public void paint(Graphics g){
            // draws the background gradient
            for (int i = 1; i <= 200; i++){
                int scale = (int) (255 * (double) i / 200);
                g.setColor(new Color(scale, 255 - scale, scale));
                g.drawLine(0, getHeight() / 50 * i, getWidth() / 50 * i, 0);
            }

            // draws the two flowers on the sides
            g.setColor(Color.GREEN);
            g.fillRect(160, 200, 50, 500);
            g.setColor(petalColors[petalIndex]);
            g.fillOval(100, 80, 100, 100);
            g.fillOval(180, 80, 100, 100);
            g.fillOval(50, 150, 100, 100);
            g.fillOval(230, 150, 100, 100);
            g.fillOval(100, 220, 100, 100);
            g.fillOval(180, 220, 100, 100);

            g.setColor(centerColors[centerIndex]);
            g.fillOval(130, 145, 120, 120);

            g.setColor(Color.GREEN);
            g.fillRect(560, 200, 50, 500);
            g.setColor(petalColors[petalIndex]);
            g.fillOval(500, 80, 100, 100);
            g.fillOval(580, 80, 100, 100);
            g.fillOval(450, 150, 100, 100);
            g.fillOval(630, 150, 100, 100);
            g.fillOval(500, 220, 100, 100);
            g.fillOval(580, 220, 100, 100);
            g.setColor(centerColors[centerIndex]);
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