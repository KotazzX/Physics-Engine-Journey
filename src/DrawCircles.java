import javax.swing.*;
import java.awt.*;

public class DrawCircles extends JPanel {

    // Override the paintComponent (make sure it looks the same) to make a big red circle!
    @Override
    public void paintComponent(Graphics g) {

        g.setColor(Color.red);
        g.fillOval(0,0, 200, 200);

    }
}
