import javax.swing.*;
import javax.swing.JComponent;
import java.awt.Graphics;

public class GUIGreet {
    public GUIGreet(){
        JFrame frame = new JFrame("Graphical Greeting");
        frame.setSize(400, 100);
        frame.add(new Drawing());
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new GUIGreet();
    }

    public class Drawing extends JComponent {
        public void paint (Graphics g){
            g.drawString("Hello, world!", 150, 50);
        }
    }
}

