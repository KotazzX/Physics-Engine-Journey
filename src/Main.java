import javax.swing.*;

import java.util.ArrayList;

import static time.Time.deltaTime;

public class Main {

    /*
    This will be the Main class for the Physics Engine, first thing to try is a ball falling.
    It doesn't matter how long it takes and if you have to search something up you can!
    This is a huge project but don't stress too much about it!
    This is for you and you only, it's a learning process and you'll get much better!
     */

    // TODO: Add another ball that can also collide (and possibly change size)

    static ArrayList<Ball> ballList = new ArrayList<>();

    static Renderer render = new Renderer(ballList);
    static final JFrame window = new JFrame();


    static String title = "Physics Simulation";
    static int width = 1920;
    static int height = 1080;

    static long lastTime = System.nanoTime();



    public static void main(final String[] args) {

        // Setting the title and size; when closing the window, exit code
        window.setTitle(title);
        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(render);

        window.setVisible(true);


        // Add in more balls into the simulation
        ballList.add(new Ball(400.0, 320, 10.0, 25, 100, 200));
        ballList.add(new Ball(400.0, 300, 10.0, 500, 250, 200));



        while (true) {
            long currentTime = System.nanoTime();

            for (Ball b : ballList) {
                b.update(deltaTime(lastTime, currentTime));
                render.repaint();

                CollisionCheck.check(b, render.border, ballList);
            }

            lastTime = currentTime;

            // Have the program "sleep" to get about 60 frames
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}