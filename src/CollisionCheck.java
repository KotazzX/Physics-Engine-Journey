import java.awt.*;

public class CollisionCheck{

    public static void check(Ball ball, Border border) {

        // Bottom of ball hits the top of the y pos and bounces in opposite direction.
        if (ball.posY + ball.radius > border.posY) {
            ball.velY *= -1.5;
            ball.ballColor = newColor();

            // Snaps back a bit so that it doesn't stay stuck in floor.
            ball.posY = border.posY - ball.radius;
        }

        // Bottom of ball hits the top of the y pos and bounces in opposite direction.
        if (ball.posY - ball.radius < border.sideTPosY) {
            ball.velY *= -1.5;
            ball.ballColor = newColor();

            // Snaps back a bit so that it doesn't stay stuck in floor.
            ball.posY = border.sideTPosY + ball.radius;
        }


        // Side of ball hits the side of the x pos and bounces in opposite direction.
        if (ball.posX + ball.radius > border.sideRPosX) {
            ball.velX *= -1.5;

            // Snaps back a little so that it doesn't stick to wall.
            ball.posX = border.sideRPosX - ball.radius;
        }
    }

    private static Color newColor() {
        int r = 11;
        int g = 41;
        int b = 200;

        return new Color(r, g, b);
    }
}