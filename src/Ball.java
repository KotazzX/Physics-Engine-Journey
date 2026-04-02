public class Ball {

    // Ball movement and logic goes in here

    double posX = 100.0;
    double posY = 100.0;

    double velX = 2.0;
    double velY = 1.0;

    public void update() {
        // Position of the ball and how fast the ball will move in set position
        posX += velX;
        posY += velY;
    }
}