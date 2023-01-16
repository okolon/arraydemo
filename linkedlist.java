import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;
import java.lang.Class;
import java.lang.reflect.*;

public class linkedlist implements ActionListener //The class allows for buttons to execute commands once clicked
{
    private static JButton add;
    private static JButton remove;
    private static Ball node;
    private static Ball node2;
    private static Ball node3;
    private static Ball node4;
    private static Line line;
    private static Line line2;
    private static Line line3;
    private static Text text;
    private static Text text2;
    private static Text text3;
    private static Text text4;
    private static Text text5;
    private static Text text6;
    private static Text text7;
    private static Text text8;
    private static GameArena window;
    private static int clicked;

    public void actionPerformed(ActionEvent e)
    {
        clicked++;
        if(e.getActionCommand().equals("add(E e)")) //allows node to be added
        {
            window.addBall(node);

            if(clicked == 1)
            {
                text3 = new Text("Linked List are linear data structures where the elements are not stored in neighbouring locations...", 20, 25, 300, "WHITE");
                window.addBall(node2);
                window.addLine(line);
                window.removeText(text);
                window.removeText(text2);
                window.addText(text3);
            }
            if(clicked == 2)
            {
                text4 = new Text("and every element is a separate object with a data part and address part", 20, 100, 300, "WHITE");
                text5 = new Text("These elements are known as nodes", 20, 100, 350, "WHITE");
                window.addBall(node3);
                window.addLine(line2);
                window.removeText(text3);
                window.addText(text4);
                window.addText(text5);
            }
            if(clicked == 3)
            {
                window.addBall(node4);
                window.addLine(line3);
                window.removeText(text4);
                window.removeText(text5);
                text6 = new Text("Cheers! Now that your linkedlist is complete, the only thing left to do is remove a node", 20, 100, 300, "WHITE");
                window.addText(text6);
            }
        }
        if(e.getActionCommand().equals("remove()")) // allows node to be removed
        {
            text7 = new Text("remove() is a function that removes the first node in the linkedlist", 20, 100, 300, "WHITE");
            text8 = new Text("End of linkedlist demo", 20, 100, 350, "WHITE");
            window.addText(text7);
            window.addText(text8);
            window.removeBall(node4);
            window.removeLine(line3);
            window.removeText(text6);
        }
    }
    public static void main(String[] args) //main method
    {
        window = new GameArena(1000, 600); //New instance of GameArena

        text = new Text("Here is your linkedlist. We can populate a linkedlist using add(E e)", 20, 100, 300, "WHITE");
        text2 = new Text("Please add 3 more nodes to the linkedlist", 20, 150, 350, "WHITE");
        window.addText(text);
        window.addText(text2);
        
        node = new Ball(300, 100, 100, "YELLOW");
        node2 = new Ball(450, 100, 100, "YELLOW");
        node3 = new Ball(600, 100, 100, "YELLOW");
        node4 = new Ball(750, 100, 100, "YELLOW");
        window.addBall(node);

        line = new Line(300, 100, 450, 100, 5, "WHITE");
        line2 = new Line(450, 100, 600, 100, 5, "WHITE");
        line3 = new Line(600, 100, 750, 100, 5, "WHITE");

        //THE BUTTON IS IN THE MIDDLE OF THE TOP EDGE OF THE SCREEN. Sorry I couldn't get the button to display properly
        add = new JButton("add(E e)");
        add.setBounds(500, 200, 100, 100);
        add.addActionListener(new linkedlist());
        add.setVisible(true);
        window.add(add);

        //THE BUTTON IS IN THE MIDDLE OF THE TOP EDGE OF THE SCREEN. Sorry I couldn't get the button to display properly
        remove = new JButton("remove()");
        remove.setBounds(500, 200, 100, 100);
        remove.addActionListener(new linkedlist());
        remove.setVisible(true);
        window.add(remove);
    }
}