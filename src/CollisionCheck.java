import java.awt.*;

public class CollisionCheck{

    public static void check(Ball ball, Border border) {

        /*
        TODO: get the Ball radius from the width and height and have the radius touch the border instead of the Y pos of Ball

         Might be slightly hard to do but you can do it! if you need to search something up go ahead
         (and also do pseudocode also, it helps!)
         */

        System.out.println("\nBall Bottom: " + (ball.posY + ball.radius));
        System.out.println("Floor Top: " + border.posY);
        System.out.println("The Gap: " + (border.posY - (ball.posY + ball.radius)));

        // Center point of ball hits rectangle. Change color of ball and bounce it in the opposite direction.
        if (ball.posY + ball.radius > border.posY) {
            System.out.println("LOGGER -> Ball hit border, posY: " + (ball.posY + ball.radius) + "\n");

            ball.velY *= -0.8;
            ball.ballColor = newColor();

            // Snaps back a bit so that it doesn't stay stuck in floor
            ball.posY = border.posY - ball.radius;
        }
    }

    private static Color newColor() {
        // New color for ball
        int r = 11;
        int g = 41;
        int b = 200;

        return new Color(r, g, b);
    }
}