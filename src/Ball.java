import java.awt.*;

public class Ball {

    // TODO: Have posX and posY not hard coded for it to remember, add a constructor

    // Ball movement and logic goes in here

    Color ballColor = Color.red;

    double gravity;
    double velX, velY;
    double posX, posY;
    double size;

     public Ball(double gravity, double velX, double velY, double size) {
        this.gravity = gravity;
        this.velX = velX;
        this.velY = velY;
        this.size = size;
        this.size = ballSize();
    }

    public void update(double deltaTime) {
        // Position of the ball and how fast the ball will move in set position

        velY += gravity * deltaTime;

        posX += velX * deltaTime;
        posY += velY * deltaTime;
    }

    public double ballSize(){
         return size = posY + posX;
    }
}