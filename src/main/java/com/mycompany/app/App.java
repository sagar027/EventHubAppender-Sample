package com.eventhubappendersample.app;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App
{
         private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        int i;
                for(i=0; i<=10;i++)
                {
                        try {
                        TimeUnit.SECONDS.sleep(1);
                        logger.error("Hello World " + i);
                        }

                        catch(InterruptedException e)
                        {
                        }
                }
    }
}
