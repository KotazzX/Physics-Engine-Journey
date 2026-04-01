import javax.swing.*;

public class Main {

    /*
    This will be the Main class for the Physics Engine, first thing to try is a ball falling.
    It doesn't matter how long it takes and if you have to search something up you can!
    This is a huge project but don't stress too much about it!
    This is for you and you only, it's a learning process and you'll get much better!
     */

    // TODO: Make the ball drop or something gravity wise!

    // For the balls to have gravity, might have to update every frame?
    // While knowing its position, the velocity, and direction?


    static final JFrame window = new JFrame();


    static String title = "Physics Simulation";
    static int width = 1920;
    static int height = 1080;


    public static void main(final String[] args) {


        // Setting the title and size; when closing the window, exit code
        window.setTitle(title);
        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(new DrawCircles());
        window.setVisible(true);

    }
}