import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Renderer extends JPanel {
    Border border = new Border();

    ArrayList<Ball> ball;

    public Renderer(ArrayList<Ball> ball) {
        this.ball = ball;
        this.setDoubleBuffered(true);
        this.setOpaque(true);
    }


    // Override the paintComponent (make sure it looks the same)
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // NOTE: I draw with (posX - radius) because fillOval starts at the corner,
        // but my physics treats (posX) as the center
        // having a for loop like the one below basically tells the computer
        // for each Ball b IN ball - telling it to reach into the class and get the numbers from main

        // Rendering objects on the window
        for (Ball b : ball) {

            g.setColor(b.ballColor);
            int drawX = (int) b.posX - b.radius;
            int drawY = (int) b.posY - b.radius;

            g.fillOval(drawX, drawY, b.size, b.size);


            // Second ball position in the middle of main ball
            g.setColor(Color.black);
            g.fillOval((int) b.posX, (int) b.posY, 5, 5);

        }



        // Bottom border
        g.setColor(Color.GREEN);
        g.fillRect(border.bottomPosX, border.bottomPosY, border.bottomWidth, border.bottomHeight);

        g.setColor(Color.GREEN);
        g.fillRect(border.rightPosX, border.rightPosY, border.rightWidth, border.rightHeight);

        g.setColor(Color.GREEN);
        g.fillRect(border.topPosX, border.topPosY, border.topWidth, border.topHeight);

        g.setColor(Color.GREEN);
        g.fillRect(border.leftPosX, border.leftPosY, border.leftWidth, border.leftHeight);

        Toolkit.getDefaultToolkit().sync();
    }
}