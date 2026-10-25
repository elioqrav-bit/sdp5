
public class CycleStrategy implements RouteStrategy {

    private static final double LANE_FACTOR = 1.2;
    private static final double AVERAGE_SPEED_KMH = 15;

    @Override
    public Route buildRoute(String from, String to, double straightLineKm) {
        double distance = straightLineKm * LANE_FACTOR;
        int minutes = (int) Math.round(distance / AVERAGE_SPEED_KMH * 60);
        return new Route(from, to, distance, minutes, "By bike via bike lanes");
    }
}
