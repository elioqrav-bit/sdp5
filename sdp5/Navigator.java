
import java.util.Objects;

public class Navigator {

    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }

    public Route plan(String from, String to, double straightLineKm) {
        return strategy.buildRoute(from, to, straightLineKm);
    }
}