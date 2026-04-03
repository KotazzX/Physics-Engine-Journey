package time;

public class Time {
    private Time(){}

    public static double deltaTime(long lastTime, long currentTime) {
        return ((currentTime - lastTime) / 1_000_000_000.0);
    }
}