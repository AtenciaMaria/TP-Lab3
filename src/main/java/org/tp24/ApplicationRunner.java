package org.tp24;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ApplicationRunner {
    protected static final Logger logger= LoggerFactory.getLogger(ApplicationRunner.class);
    public void run() {
        //log de confirmacion
        logger.info("App ejecutada exitosamente");
    }
}
