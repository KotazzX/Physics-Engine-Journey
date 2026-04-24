import java.awt.*;

public class CollisionCheck{

    public static void check(Ball ball, Border border) {

        // Bottom of ball hits the top of the y pos and bounces in opposite direction.
        if (ball.posY + ball.radius > border.posY) {
            ball.velY *= -0.8;
            ball.ballColor = newColor();

            // Snaps back a bit so that it doesn't stay stuck in floor.
            ball.posY = border.posY - ball.radius;
        }

        // Side of ball hits the side of the x pos and bounces in opposite direction.
        if (ball.posX + ball.radius > border.sidePosX) {
            ball.velX *= -0.8;

            // Snaps back a little so that it doesn't stick to wall.
            ball.posX = border.sidePosX - ball.radius;
        }
    }

    private static Color newColor() {
        int r = 11;
        int g = 41;
        int b = 200;

        return new Color(r, g, b);
    }
}