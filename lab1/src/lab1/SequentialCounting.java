/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author marty
 */
public class SequentialCounting {
    
    
        static int n=30;
        
    
        public static int fib(int n){
        
        if ((n==1)||(n==2))
        return 1;
        else
        return fib(n-1)+fib(n-2);
        
    }
        public static long fibo()
        {
            long startTime = System.currentTimeMillis();
            
            System.out.println(fib(n));
            
            long endTime = System.currentTimeMillis();
                    return endTime-startTime;
            
        }
        
        
    
}
