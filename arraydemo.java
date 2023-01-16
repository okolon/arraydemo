import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;
import java.lang.Class;
import java.lang.reflect.*;

public class arraydemo implements ActionListener //The class allows for buttons to execute commands once clicked
{
    private static JButton add;
    private static JButton remove;
    private static Ball element;
    private static Ball element2;
    private static Ball element3;
    private static Ball element4;
    private static Text text;
    private static Text text2;
    private static Text text3;
    private static Text text4;
    private static Text text5;
    private static GameArena window;
    private static int clicked;

    public void actionPerformed(ActionEvent e)
    {
        clicked++;                              //Records number of times the ADD button is clicked
        if(e.getActionCommand().equals("ADD"))
        {
            window.addBall(element);            //Adds ball to window
            if(clicked == 1)
            {
                window.addBall(element2);
            }
            if(clicked == 2)
            {
                window.addBall(element3);
            }
            if(clicked == 3)
            {
                window.addBall(element4);
                window.removeText(text);
                window.removeText(text2);
                text3 = new Text("Cheers! Now that your array is full, the only thing left to do is remove elements", 20, 100, 300, "WHITE");
                window.addText(text3);
            }
        }
        if(e.getActionCommand().equals("REMOVE")) //Removes ball from window
        {
            text4 = new Text("When we remove an element from an array, say our array is a stack, the last element is removed", 20, 50, 300, "WHITE");
            text5 = new Text("End of array demo", 20, 100, 350, "WHITE");
            window.addText(text4);
            window.addText(text5);
            window.removeBall(element4);
            window.removeText(text3);
        }
    }
    public static void main(final String[] args) //Main method
    {
        window = new GameArena(1000, 600); //New instance of GameArena

        text = new Text("Here is your array. When populating an array, elements are added one after the other", 20, 100, 300, "WHITE");
        text2 = new Text("This array holds 4 elements. Please add 3 more", 20, 150, 350, "WHITE");
        window.addText(text);
        window.addText(text2);
        
        element = new Ball(300, 100, 100, "YELLOW"); //New instance of Ball
        element2 = new Ball(450, 100, 100, "YELLOW");
        element3 = new Ball(600, 100, 100, "YELLOW");
        element4 = new Ball(750, 100, 100, "YELLOW");
        window.addBall(element);

        //THE ADD BUTTON IS IN THE MIDDLE OF THE TOP EDGE OF THE SCREEN. Sorry I couldn't get the button to display properly
        add = new JButton("ADD"); // creating add jbutton
        add.setBounds(500, 200, 100, 100);
        add.addActionListener(new arraydemo());
        add.setVisible(true);
        window.add(add);

        //THE REMOVE BUTTON IS IN THE MIDDLE OF THE TOP EDGE OF THE SCREEN. Sorry I couldn't get the button to display properly
        remove = new JButton("REMOVE"); // creating remove jbutton
        remove.setBounds(500, 200, 100, 100);
        remove.addActionListener(new arraydemo());
        remove.setVisible(true);
        window.add(remove);
    }
}