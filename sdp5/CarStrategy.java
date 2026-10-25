
public class CarStrategy implements RouteStrategy {

    private static final double ROAD_FACTOR = 1.3;
    private static final double AVERAGE_SPEED_KMH = 50;

    @Override
    public Route buildRoute(String from, String to, double straightLineKm) {
        double distance = straightLineKm * ROAD_FACTOR;
        int minutes = (int) Math.round(distance / AVERAGE_SPEED_KMH * 60);
        return new Route(from, to, distance, minutes, "By car via main roads");
    }
}