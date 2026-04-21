import java.awt.*;

public class Ball {
    // Ball movement and logic goes in here

    Color ballColor = Color.red;

    double gravity;
    double velX, velY;
    double posX, posY;
    int size;
    int radius;

     public Ball(double gravity, double velX, double velY, double posX, double posY, int size) {
        this.gravity = gravity;
        this.velX = velX;
        this.velY = velY;
        this.posX = posX;
        this.posY = posY;
        this.size = size;
        this.radius = size / 2;
    }

    public void update(double deltaTime) {
        // Position of the ball and how fast the ball will move in set position

        velY += gravity * deltaTime;

        posX += velX * deltaTime;
        posY += velY * deltaTime;
    }
}