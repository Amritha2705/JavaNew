import java.applet.Applet;
import java.awt.Graphics;

public class SmileyFaceApplet extends Applet {
    public void paint(Graphics g) {
        // Draw the head (circle)
        g.drawOval(50, 50, 200, 200); // x, y, width, height

        // Draw the eyes (two smaller ovals)
        g.fillOval(90, 100, 30, 30); // x, y, width, height
        g.fillOval(180, 100, 30, 30); // x, y, width, height

        // Draw the mouth (arc)
        g.drawArc(100, 150, 100, 50, 0, -180); // x, y, width, height, startAngle, arcAngle
    }
}




<html>
<body>
   <applet code="SmileyFaceApplet.class" width="300" height="300">
   </applet>
</body>
</html>
