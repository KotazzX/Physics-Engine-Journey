import java.awt.*;

public class CollisionCheck{

    public static void check(Ball ball, Border border) {

        /*
        TODO: get the Ball radius from the width and height and have the radius touch the border instead of the Y pos of Ball

         Might be slightly hard to do but you can do it! if you need to search something up go ahead
         (and also do pseudocode also, it helps!)


         radius of the ball = size / 2 (possibly) can probably add another circle in the main circle to show it better.
         */

        // Ball passes border with offset. Change color of ball and bounce it in the opposite direction.
        if (ball.posY > border.posY) {
            ball.ballColor = newColor();

            ball.velY *= -0.8;

            System.out.println("HIT: new ball vel: " + ball.velY  + "\n ball y pos: " + ball.posY);

            if (ball.velY == 0) {
                ball.gravity = 0;
            }
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
