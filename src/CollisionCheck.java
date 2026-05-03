import java.awt.*;

public class CollisionCheck{

    public static void check(Ball ball, Border border) {

        double bounceVel = -0.8;
        int bottomRectCollision = border.topPosY + border.topHeight;

        // Bottom border collision
        if (ball.posY + ball.radius > border.bottomPosY) {
            ball.velY *= bounceVel;
            ball.ballColor = newColor();

            // Snaps back a bit so that it doesn't stay stuck in floor.
            ball.posY = border.bottomPosY - ball.radius;
        }

        // Top border collision
        if (ball.posY - ball.radius < bottomRectCollision) {
            ball.velY *= bounceVel;
            ball.ballColor = newColor();

            // Snaps back a bit so that it doesn't stay stuck in floor.
            ball.posY = bottomRectCollision + ball.radius;
        }


        // Side of ball hits the side of the x pos and bounces in opposite direction.
        if (ball.posX + ball.radius > border.rightPosX) {
            ball.velX *= bounceVel;

            // Snaps back a little so that it doesn't stick to wall.
            ball.posX = border.rightPosX - ball.radius;
        }
    }

    private static Color newColor() {
        int r = 11;
        int g = 41;
        int b = 200;

        return new Color(r, g, b);
    }
}