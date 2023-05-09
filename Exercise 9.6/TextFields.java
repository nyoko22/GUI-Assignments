import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TextFields implements ActionListener
{
JTextField givenName;
JTextField familyName;
JTextField fullName;
JButton submitButton = new JButton("Submit");
public TextFields()
{
JFrame frame = new JFrame("Text Fields");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create fields for I/O
givenName = new JTextField(10);
familyName = new JTextField(10);
fullName = new JTextField(10);
fullName.setEditable(false);
// Add labelled input fields to display
JPanel inFieldPane = new JPanel();
inFieldPane.setLayout(new GridLayout(2,2));
inFieldPane.add(new JLabel("Given Name"));
inFieldPane.add(givenName);
givenName.addActionListener(this);
inFieldPane.add(new JLabel("Family Name"));
inFieldPane.add(familyName);

familyName.addActionListener(this);
frame.add(inFieldPane,BorderLayout.NORTH);
// Add submission button
JPanel submitPane = new JPanel();
submitPane.setLayout(new FlowLayout());
submitPane.add(new JLabel("Press Button to Enter Names"));
submitButton.addActionListener(this);
submitPane.add(submitButton);
frame.add(submitPane,BorderLayout.CENTER);
// Add Output fields
JPanel outFieldPane = new JPanel();
outFieldPane.setLayout(new GridLayout(1,2));
outFieldPane.add(new JLabel("Full Name"));
outFieldPane.add(fullName);
frame.add(outFieldPane,BorderLayout.SOUTH);
// Display the final product
frame.pack();
frame.setVisible(true);
}
public void actionPerformed (ActionEvent e){
    String fullString = familyName.getText().trim() + ", " + givenName.getText().trim();

    // Display full name if either of the names were updated and the button was pressed
    if (e.getSource() == submitButton){
        fullName.setText(fullString);
    } else if (e.getSource() == givenName){
        fullName.setText(fullString);
    } else if (e.getSource() == familyName){
        fullName.setText(fullString);
    }   
}
public static void main(String[] args)
{
new TextFields();
}
}