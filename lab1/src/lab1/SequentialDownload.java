/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author marty
 */
public class SequentialDownload {
    
        @SuppressWarnings("unused")
    public static long download()
    {
        long startTime = System.currentTimeMillis();
        Image image = null;
        for(int i=0;i<10;i++)
        {
            try {
                URL url = new URL("https://loremflickr.com/320/240/dog");
                image = ImageIO.read(url);
            } catch (IOException e) {
            }
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    
}
