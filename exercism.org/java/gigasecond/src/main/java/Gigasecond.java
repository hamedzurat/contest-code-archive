import java.time.*;


public class Gigasecond {
    private final Duration GIGASECOND = Duration.ofSeconds(1_000_000_000);
    private final Instant  future;

    public Gigasecond(LocalDate moment) {
        future = moment.atStartOfDay(ZoneId.systemDefault()).toInstant().plus(GIGASECOND);
    }

    public Gigasecond(LocalDateTime moment) {
        future = moment.atZone(ZoneId.systemDefault()).toInstant().plus(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.ofInstant(future, ZoneId.systemDefault());
    }
}
