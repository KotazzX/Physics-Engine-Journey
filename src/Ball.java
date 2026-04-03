public class Ball {

    // Ball movement and logic goes in here

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