package logging.example2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Log.class.getName());

        // log messages using log(Level level, String msg)
        logger.log(Level.INFO, "This is message 1");
        logger.info("This is message 2");
        logger.log(Level.WARNING,"This is message 3");
        logger.log(Level.SEVERE, "logging : {0}", "message 2");
        logger.log(Level.INFO, "logging : {0} {1}", new Object[]{"parameter1","parameter2"});
        logger.log(Level.WARNING, "logging : {0} {1}", new Object[]{"parameter1","parameter2"});
        logger.log(Level.WARNING, "logging : ", new RuntimeException(("Error")));
    }
    }

