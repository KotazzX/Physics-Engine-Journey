import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {
    Border border = new Border();

    Ball myBall;

    public Renderer(Ball ball) {
        this.myBall = ball;
        this.setDoubleBuffered(true);
        this.setOpaque(true);
    }


    // Override the paintComponent (make sure it looks the same) to make a big red circle!
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Rendering objects on the window
        g.setColor(myBall.ballColor);
        g.fillOval((int)myBall.posX ,(int)myBall.posY, myBall.size, myBall.size);

        g.setColor(Color.green);
        g.fillRect(border.posX, border.posY, border.width, border.height);

        Toolkit.getDefaultToolkit().sync();
    }
}
