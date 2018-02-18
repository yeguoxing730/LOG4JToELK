import org.apache.log4j.Logger;

/**
 * Created by yeguo on 2018/2/16.
 */
public class Log4JToELK {
    private static final Logger logger = Logger.getLogger(Log4JToELK.class);
    public static void main(String[] args) throws Exception {
        logger.debug("This is a debug message!");
        logger.info("This is info message!");
        logger.warn("This is a warn message!");
        logger.error("This is error message!");
        try{
            System.out.println(5/0);
        }catch(Exception e){
            logger.error(e);
        }

    }
}
