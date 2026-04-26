import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {
    Border border = new Border();

    Ball ball;

    public Renderer(Ball ball) {
        this.ball = ball;
        this.setDoubleBuffered(true);
        this.setOpaque(true);
    }


    // Override the paintComponent (make sure it looks the same) to make a big red circle!
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // NOTE: I draw with (posX - radius) because fillOval starts at the corner,
        // but my physics treats (posX) as the center

        // Rendering objects on the window
        g.setColor(ball.ballColor);
        int drawX = (int) ball.posX - ball.radius;
        int drawY = (int) ball.posY - ball.radius;

        g.fillOval(drawX, drawY, ball.size, ball.size);

        // Second ball position in the middle of main ball
        g.setColor(Color.black);
        g.fillOval((int) ball.posX, (int) ball.posY, 5, 5);


        // Bottom border
        g.setColor(Color.green);
        g.fillRect(border.posX, border.posY, border.width, border.height);

        g.setColor(Color.GREEN);
        g.fillRect(border.sideRPosX, border.sideRPosY, border.sideRWidth, border.sideRHeight);

        g.setColor(Color.GREEN);
        g.fillRect(border.sideTPosX, border.sideTPosY, border.sideTWidth, border.sideTHeight);

        Toolkit.getDefaultToolkit().sync();
    }
}