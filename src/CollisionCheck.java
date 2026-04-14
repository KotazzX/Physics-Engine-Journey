import java.awt.*;

public class CollisionCheck{

    // if the border touches the wall, let it move negative

    public static void check(Ball ball, Border border) {

        if (ball.posY > border.posY) {
            System.out.println("Boom, ball has hit the border" + ball.posY);
            ball.ballColor = newColor();

            ball.velY -= 100.0;
        }
    }

    private static Color newColor() {
        // New colors for when ball goes below the border

        int r = 11;
        int g = 41;
        int b = 200;

        return new Color(r, g, b);
    }

}
