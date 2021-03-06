import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class Log4JTest {
    static final Logger logger = Logger.getLogger(Log4JTest.class);

    @Test
    public void Log4jTest() {
        logger.info("INFO: some action was performed");
        logger.debug("DEBUG: the content of data that was transfered, request content");
        logger.error("ERROR: an error occurred that can be fixed");
        logger.fatal("FATAL: error that can't be fixed. Everything crashed.");
    }
}