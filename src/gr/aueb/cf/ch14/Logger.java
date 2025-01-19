package gr.aueb.cf.ch14;

import java.time.LocalTime;

public class Logger {
    private static final Logger INSTANCE = new Logger();

    private Logger() {

    }

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void logMessage(String message) {
        LocalTime localTime = LocalTime.now();
        System.err.println(message + " at " + localTime);
    }
}
