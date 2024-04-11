import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Info written to stdout.log!");
        logger.error("Errors written to stderr.log!");
        logger.debug("Debug written to console!");
    }
}
