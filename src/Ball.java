import java.awt.*;

public class Ball {

    // TODO: Have posX and posY not hard coded for it to remember, add a constructor

    // Ball movement and logic goes in here

    Color ballColor = Color.red;

    double gravity;
    double velX, velY;
    double posX, posY;

     public Ball(double gravity, double velX, double velY, double posX, double posY) {
        this.gravity = gravity;
        this.velX = velX;
        this.velY = velY;
        this.posX = posX;
        this.posY = posY;
    }

    public void update(double deltaTime) {
        // Position of the ball and how fast the ball will move in set position

        velY += gravity * deltaTime;

        posX += velX * deltaTime;
        posY += velY * deltaTime;
    }
}