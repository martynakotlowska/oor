/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

/**
 *
 * @author marty
 */
public class ConcurrentlyDownload{
    
    @SuppressWarnings("unused")
    public static long download()
    {
        long startTime = System.currentTimeMillis();
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++)
            es.execute(new Runnable() {
                public void run()
                {
                    Image image = null;
                    try {
                        URL url = new URL("https://loremflickr.com/320/240/dog");
                        image = ImageIO.read(url);
                    } catch (IOException e) {
                    }
                }
            });
        es.shutdown();
        try {
            boolean finshed = es.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    
}
