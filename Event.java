import java.time.ZonedDateTime;  

public class Event {
    private double[] position;
    private double strength;
    private double releaseTime;

    public Event(double[] position, double strength){
        this.position = position;
        this.strength = strength;
        Object t = ZonedDateTime.now();
    }
}
