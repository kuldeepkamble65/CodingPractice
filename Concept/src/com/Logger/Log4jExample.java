package com.Logger;


import java.util.logging.Logger;

public class Log4jExample {
    private static Logger LogManager;
    private static System.Logger logger = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}
}
