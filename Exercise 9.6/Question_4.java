import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question_4 implements ActionListener {
    JTextField a = new JTextField("0", 10);
    JTextField b = new JTextField("0", 10);
    JTextField result = new JTextField(10);

    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton times = new JButton("*");
    JButton divide = new JButton("/");

    public Question_4(){
        JFrame f = new JFrame("A Simple Calculator");
        f.setSize(500, 500);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setLayout(new GridLayout(4, 1));

        // first row
        JPanel r1 = new JPanel();
        r1.add(new JLabel("First Value:"));
        r1.add(a);
        a.addActionListener(this);
        f.add(r1);

        // second row
        JPanel r2 = new JPanel();
        r2.add(new JLabel("Second Value:"));
        r2.add(b);
        b.addActionListener(this);
        f.add(r2);
        
        // third row
        JPanel r3 = new JPanel();
        r3.add(new JLabel("Result:"));
        r3.add(result);
        result.setEditable(false);
        result.addActionListener(this);
        f.add(r3);

        // last row
        JPanel r4 = new JPanel();
        r4.setLayout(new GridLayout(1, 4));
        r4.add(plus);
        r4.add(minus);
        r4.add(times);
        r4.add(divide);
        plus.addActionListener(this);
        minus.addActionListener(this);
        times.addActionListener(this);
        divide.addActionListener(this);
        f.add(r4);
    }

    public void actionPerformed(ActionEvent e){
        int x = Integer.parseInt(a.getText().trim()), y = Integer.parseInt(b.getText().trim());
        // only when one of the four operations are pressed, evaluates the expression 
        if (e.getSource() == plus){
            result.setText("" + (x + y));
        } else if (e.getSource() == minus){
            result.setText("" + (x - y));
        } else if (e.getSource() == times){
            result.setText("" + (x * y));
        } else if (e.getSource() == divide){
            result.setText("" + ((int) (100 * (double) x / y) / 100.0));
        }
    }

    public static void main(String[] args){
        new Question_4();
    }
}
