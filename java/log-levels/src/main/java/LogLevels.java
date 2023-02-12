public class LogLevels {
    
    public static String message(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        String[] splited = logLine.split("]:");
        String str = splited[1].trim();
        return str;
        
    }

    public static String logLevel(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
        if(logLine.contains("INFO")) {
            return "info";
        } else if (logLine.contains("ERROR")) {
            return "error";
        } else if (logLine.contains("WARNING")) {
            return "warning";
        } else {
            return "Invalid logline";
        }
        
    }

    public static String reformat(String logLine) {
//        throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
