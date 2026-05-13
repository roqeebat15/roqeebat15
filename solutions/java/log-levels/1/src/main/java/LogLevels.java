public class LogLevels {
    
    public static String message(String logLine) {
        
        return logLine.split(": ", 2)[1].trim();
    }

    public static String logLevel(String logLine) {
        
        String text = logLine.split(":")[0].toLowerCase();
            return text.substring(1,text.length()-1);
    }

    public static String reformat(String logLine) {

        String[] words = logLine.split(":");
        String word = words[0].toLowerCase();
        word = word.substring(1, word.length()-1);
        return words[1].trim() + " "+ "(" + word + ")";
    }
}
