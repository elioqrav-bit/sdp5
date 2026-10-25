
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, RouteStrategy> strategies = Map.of(
                "car", new CarStrategy(),
                "walk", new WalkStrategy(),
                "cycle", new CycleStrategy());

        Navigator navigator = new Navigator(strategies.get("car"));
        String from = "Home";
        String to = "Astana IT University";
        double km = 6.0;

        System.out.println("[car]   " + navigator.plan(from, to, km));

        navigator.setStrategy(strategies.get("cycle"));
        System.out.println("[cycle] " + navigator.plan(from, to, km));

        navigator.setStrategy(strategies.get("walk"));
        System.out.println("[walk]  " + navigator.plan(from, to, km));
    }
}