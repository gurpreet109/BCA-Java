// AWT Event Handling Example
// Name: Gurpreet Kaur

import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame implements ActionListener {
    TextField tf;
    Button b;

    AWTExample() {
        setLayout(new FlowLayout());

        Label l = new Label("Enter your name:");
        tf = new TextField(20);
        b = new Button("Click Me");

        add(l);
        add(tf);
        add(b);

        b.addActionListener(this);

        setTitle("AWT Example - Gurpreet Kaur");
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = tf.getText();
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        new AWTExample();
    }
}
