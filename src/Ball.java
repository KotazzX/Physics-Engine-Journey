import java.awt.*;

public class Ball {

    // TODO: Have posX and posY not hard coded for it to remember

    // Ball movement and logic goes in here

    Color ballColor = Color.red;

    double gravity = 400;

    double posX = 100.0;
    double posY = 100.0;

    double velX = 40.0;
    double velY = 0;

    public void update(double deltaTime) {
        // Position of the ball and how fast the ball will move in set position

        velY += gravity * deltaTime;

        posX += velX * deltaTime;
        posY += velY * deltaTime;
    }
}