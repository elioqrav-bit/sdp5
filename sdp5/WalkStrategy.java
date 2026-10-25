
public class WalkStrategy implements RouteStrategy {

    private static final double PATH_FACTOR = 1.1;
    private static final double AVERAGE_SPEED_KMH = 5;

    @Override
    public Route buildRoute(String from, String to, double straightLineKm) {
        double distance = straightLineKm * PATH_FACTOR;
        int minutes = (int) Math.round(distance / AVERAGE_SPEED_KMH * 60);
        return new Route(from, to, distance, minutes, "On foot via sidewalks and parks");
    }
}