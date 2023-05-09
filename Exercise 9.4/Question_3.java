import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question_3 implements ActionListener
{
    int choice = 0;
    int extra = 0;

    JButton square = new JButton("Square");
    JButton rectangle = new JButton("Rectangle");
    JButton circle = new JButton("Circle");

    JButton larger = new JButton("Larger");
    JButton smaller = new JButton("Smaller");

    Drawing draw = new Drawing();

    public Question_3(){
        JFrame frame = new JFrame("Draw Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        square.addActionListener(this);
        rectangle.addActionListener(this);
        circle.addActionListener(this);
        JPanel panel = new JPanel();

        frame.setSize(500, 500);

        // top buttons
        panel.add(square);
        panel.add(rectangle);
        panel.add(circle);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(draw);

        // bottom buttons
        JPanel panel2 = new JPanel();
        panel2.add(larger);
        panel2.add(smaller);
        larger.addActionListener(this);
        smaller.addActionListener(this);
        frame.add(panel2, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == square)
            choice = 1;
        else if (e.getSource() == rectangle)
            choice = 2;
        else if (e.getSource() == circle)
            choice = 3;
        else if (e.getSource() == larger)
            extra = Math.min(extra + 5, 200);
        else if (e.getSource() == smaller)
            extra = Math.max(extra - 5, -50);
            
        draw.repaint();
    }

    class Drawing extends JComponent {
        public void paint(Graphics g){
            g.setColor(Color.red);

            if (choice == 1)
                g.fillRect(92 - (extra / 2), 80 - (extra / 2), 300 + extra, 300 + extra);
            else if (choice == 2)
                g.fillRect(62 - (extra / 2), 200 - (extra / 2), 350 + extra, 100 + extra);
            else if (choice == 3)
                g.fillOval(150 - (extra / 2), 100 - (extra / 2), 200 + extra, 200 + extra);
        }
    }
    public static void main(String[] args)
    {
        new Question_3();
    }
}