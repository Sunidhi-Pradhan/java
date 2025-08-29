import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="AddApplet" width=300 height=200></applet> */

public class AddApplet extends Applet implements ActionListener {
    TextField t1, t2;
    Button b;
    int sum = 0;

    public void init() {
        t1 = new TextField(5);
        t2 = new TextField(5);
        b = new Button("Add");

        add(t1);
        add(t2);
        add(b);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        sum = a + b;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Sum is: " + sum, 50, 150);
    }
}
