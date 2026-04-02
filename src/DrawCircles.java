import javax.swing.*;
import java.awt.*;

public class DrawCircles extends JPanel {
    Ball myBall;

    public DrawCircles(Ball ball) {
        this.myBall = ball;
    }


    // Override the paintComponent (make sure it looks the same) to make a big red circle!
    @Override
    public void paintComponent(Graphics g) {

        g.setColor(Color.red);
        g.fillOval((int)myBall.posX ,(int)myBall.posX, 200, 200);
    }
}
