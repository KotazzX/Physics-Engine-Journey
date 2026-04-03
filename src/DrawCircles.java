import javax.swing.*;
import java.awt.*;

public class DrawCircles extends JPanel {
    Ball myBall;

    public DrawCircles(Ball ball) {
        this.myBall = ball;
        this.setDoubleBuffered(true);
        this.setOpaque(true);
    }


    // Override the paintComponent (make sure it looks the same) to make a big red circle!
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.red);
        g.fillOval((int)myBall.posX ,(int)myBall.posY, 200, 200);

        Toolkit.getDefaultToolkit().sync();
    }
}
