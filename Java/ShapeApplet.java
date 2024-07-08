import java.applet.Applet;
import java.awt.Graphics;

public class ShapeApplet extends Applet {
    public void paint(Graphics g) {
        // Draw a rectangle
        g.drawRect(50, 50, 150, 100); 
        // Draw a circle
        g.drawOval(250, 50, 100, 100); 
        // Draw a line
        g.drawLine(50, 200, 200, 300); 
    }
}
