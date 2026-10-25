
public record Route(String from, String to, double distanceKm, int durationMinutes, String description) {

    @Override
    public String toString() {
        return String.format("%s -> %s | %.1f km | %d min | %s",
                from, to, distanceKm, durationMinutes, description);
    }
}