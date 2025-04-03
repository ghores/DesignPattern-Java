package creational.singleton.example3singleton;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private List<Log> logs;

    private Logger() {
        logs = new ArrayList<>();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public List<Log> getAllLogs() {
        return logs;
    }

    public void log(LogLevel level, String message) {
        logs.add(new Log(
                message,
                LocalDate.now(),
                level
        ));
    }

    public void log(String message) {
        logs.add(new Log(
                message,
                LocalDate.now(),
                LogLevel.INFO
        ));
    }
}
