public class LogLine {
    private final LogLevel l;
    private final String   message;

    public LogLine(String logLine) {
        l = switch (logLine.substring(1, 4)) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };

        message = logLine.split("]: ", 100)[1].trim();
    }

    public LogLevel getLogLevel() {
        return l;
    }

    public String getOutputForShortLog() {
        return l.getCode() + ":" + message;
    }
}
