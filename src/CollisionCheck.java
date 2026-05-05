import java.awt.*;
import java.util.ArrayList;

public class CollisionCheck{

    static double bounceVel = -0.8;

    public static void check(Ball ball, Border border, ArrayList<Ball> allBalls) {


        int bottomRectCollision = border.topPosY + border.topHeight;

        // AABB Collision Check
        ballCollision(allBalls);


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


        // Side of ball hits the right side of the x pos and bounces in opposite direction.
        if (ball.posX + ball.radius > border.rightPosX) {
            ball.velX *= bounceVel;

            // Snaps back a little so that it doesn't stick to wall.
            ball.posX = border.rightPosX - ball.radius;
        }


        // Side of left border detection
        if (ball.posX - ball.radius < border.leftPosX) {
            ball.velX *= bounceVel;

            ball.posX = border.leftPosX + ball.radius;
        }

    }

    public static void ballCollision(ArrayList<Ball> ball) {
        for (int i = 0; i < ball.size(); i++){
            Ball a = ball.get(i);
            for (int j = i + 1; j < ball.size(); j++){
                Ball b = ball.get(j);

                double dx = a.posX - b.posX;
                double dy = a.posY - b.posY;

                double distance = (dx * dx) + (dy * dy);
                double combinedRadii = a.radius + b.radius;
                double checkValue = combinedRadii * combinedRadii;


                if (distance < checkValue) {

                }
            }
        }
    }

    private static Color newColor() {
        int r = 11;
        int g = 41;
        int b = 200;

        return new Color(r, g, b);
    }

    private static Color AABBColor() {
        int r = 50;
        int g = 100;
        int b = 21;

        return new Color(r, g, b);
    }
}