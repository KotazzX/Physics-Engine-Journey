public class CollisionCheck{

    // if the ball touches the border make the ball or border switch color

    public static void check(Ball ball, Border border) {

        if (ball.posY > border.posY) {
            System.out.println("Boom, ball has hit the border" + ball.posY);
        }
    }
}
