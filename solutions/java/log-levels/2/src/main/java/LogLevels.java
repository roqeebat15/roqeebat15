public class LogLevels {
    
    public static String message(String logLine) {
        
        return logLine.split(": ", 2)[1].trim();
    }

    public static String logLevel(String logLine) {
        logLine = logLine.split(":", 2)[0].toLowerCase();
            return logLine.substring(1,logLine.length()-1);
    }

    public static String reformat(String logLine) {

        return logLine.split(": ", 2)[1].trim() +  " " + "(" + logLine.split(": ", 2)[0].toLowerCase().substring(1, logLine.indexOf("]")) + ")";
    }
}
