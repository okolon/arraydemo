import javax.swing.*; //Importing the relevant libraries needed to execute certain functions and have access to certain components
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener  //The class allows for buttons to execute commands once clicked
{
    private static JPanel p;            //Creating private variables that can accessed throughout this class but in no other class
    private static JPanel p2;
    private static JFrame window;
    private static JLabel label;
    private static JLabel welcome;
    private static JLabel label2;
    private static JTextField userInput;
    private static JButton button;
    private static JButton button2;
    private static JButton button3;
    private static JButton button4;

    public void actionPerformed(ActionEvent e)     //Event method that allows the jbuttons execute their instructions
    {
        String user = userInput.getText();

        if(user.length() < 15 && user.length() > 0)
        {
            welcome.setText("Hi " + userInput.getText() + "! Let's get started");
            p.add(button2);
        }

        if(e.getActionCommand().equals("Okay")) //JButton for confirmation of participation
        {
            window.add(p2);
            p2.setVisible(true);
            p.setVisible(false);
        }

        if(e.getActionCommand().equals("Arrays")) //JButton to take user to Array demo
        {
            arraydemo.main(new String[0]);
            p2.setVisible(false);
        }

        if(e.getActionCommand().equals("Linkedlists")) //JButton to take user to linkedlist demo
        {
            linkedlist.main(new String[0]);
            p2.setVisible(false);
        }
    }

    public static void main(final String[] args)  //Main method
    {
        p = new JPanel();  //Creating JPanel for components
        p.setLayout(null);
        p.setVisible(true);
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setVisible(false);
    
        window = new JFrame(); //Creating window to store all of my content
        window.setSize(1000, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Ensures the program is escapable
        window.setVisible(true);
        window.add(p);
        window.setTitle("Intro to: Data Structures");

        label = new JLabel("Welcome! What's your name?"); //Creates label prompting the user to enter their name
        label.setBounds(385, 180, 200, 25);
        p.add(label);

        userInput = new JTextField();            //Field for user to enter name
        userInput.setBounds(375, 200, 200, 25);
        p.add(userInput);

        button = new JButton("Confirm");
        button.setBounds(425, 230, 100, 25);
        button.addActionListener(new Main());
        p.add(button);
        button2 = new JButton("Okay");
        button2.setBounds(425, 320, 100, 25);
        button2.addActionListener(new Main());

        welcome = new JLabel();
        welcome.setBounds(405, 300, 200, 25);
        p.add(welcome);

        label2 = new JLabel("Which data structure demo would you like to see?");  
        label2.setBounds(355, 180, 300, 25);
        p2.add(label2);
        
        button3 = new JButton("Arrays");
        button3.setBounds(435, 200, 100, 25);
        button3.addActionListener(new Main());
        p2.add(button3);

        button4 = new JButton("Linkedlists");
        button4.setBounds(435, 220, 100, 25);
        button4.addActionListener(new Main());
        p2.add(button4);   
    }
}