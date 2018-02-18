import org.apache.log4j.Logger;

import java.time.LocalDateTime;

/**
 * Created by yeguo on 2018/2/16.
 */
public class Log4JToELK {
    private static final Logger logger = Logger.getLogger(Log4JToELK.class);
    public static void main(String[] args) throws Exception {
        LocalDateTime now = LocalDateTime.now();
        logger.debug("This is a debug message!"+now);
        logger.info("This is info message!"+now);
        logger.warn("This is a warn message!"+now);
        logger.error("This is error message!"+now);
        try{
            System.out.println(5/0);
        }catch(Exception e){
            logger.error(e);
        }

    }
}
