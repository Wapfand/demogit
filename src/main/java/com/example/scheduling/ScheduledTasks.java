package com.example.scheduling;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;


import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
@Component
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    public static int i=0;
    @Scheduled(fixedRate = 2000)
    public void scheduleTaskWithFixedRate(){

            LOGGER.info("Send email to producers to inform quantity sold items, time "+i++);
    }
    @Scheduled(fixedDelay = 10000)
    public void scheduleTaskWithFixedDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("Send email to producers to inform quantity sold items delay, time "+i++);
    }

    public void scheduleTaskWithInitialDelay() {
    }

    public void scheduleTaskWithCronExpression() {
    }
}
