public class LogLevels {

    public static String message(String logLine) {
        String[] words = logLine.split("]: ", 100);
        return words[1].trim();
    }

    public static String logLevel(String logLine) {
        // this is just faster
        return switch (logLine.charAt(1)) {
            case 'I' -> "info";
            case 'W' -> "warning";
            case 'E' -> "error";
            default -> "";
        };

//        if (logLine.contains("INFO"))
//            return "info";
//        else if (logLine.contains("WARNING"))
//            return "warning";
//        else if (logLine.contains("ERROR"))
//            return "error";
//        else
//            return "";
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
