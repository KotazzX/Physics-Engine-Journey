import java.awt.*;

public class CollisionCheck{

    // if the ball touches the border make the ball or border switch color

    public static void check(Ball ball, Border border) {

        if (ball.posY > border.posY) {
            System.out.println("Boom, ball has hit the border" + ball.posY);
            ball.ballColor = newColor();
        }
    }

    private static Color newColor() {
        // New colors for when ball goes below the border

        int r = (int)(Math.random() * 256);
        int g = (int)(Math.random() * 256);
        int b = (int)(Math.random() * 256);

        return new Color(r, g, b);
    }

}
