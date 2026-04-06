import javax.swing.*;

public class CollisionCheck extends JPanel{

    private CollisionCheck(){}

    // if the ball touches the border make the ball or border switch color

    static Ball myBall = new Ball();
    static Border border = new Border();
    Renderer render = new Renderer(myBall);

    public static void Collision() {
        if (myBall.posY < border.posY) {

            System.out.println("Ball y Pos:" + myBall.posY);

        }
    }
}
