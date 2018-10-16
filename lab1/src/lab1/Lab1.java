/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.Console;
import static lab1.SequentialCounting.fib;

/**
 *
 * @author marty
 */
public class Lab1 {

    

    
    public static void main(String[] args) {
        
        
        System.out.println(SequentialCounting.fibo());
        System.out.println(ConcurrentlyDownload.download());
        System.out.println(SequentialDownload.download());
        System.out.println(ConcurrentlyCounting.calc(20));
        
        
        
    }
    
}
