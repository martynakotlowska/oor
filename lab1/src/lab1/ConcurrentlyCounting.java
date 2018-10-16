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
public class ConcurrentlyCounting extends Thread{
    
     public int x;
        public int result;
        public ConcurrentlyCounting(int x)
        {
                this.x=x;
        }
        public void  run(){
               
        if ((x==1)||(x==2))
        result = 1;
        else
        {
                ConcurrentlyCounting fib1 = new ConcurrentlyCounting(x-1);
                ConcurrentlyCounting fib2 = new ConcurrentlyCounting(x-2);
               
                fib1.start();
                fib2.start();
                try {
                fib1.join();
                fib2.join();
                }
                catch(Exception e)
                {
                       
                }
                result = fib1.result+fib2.result;
               
        }
    }
        public static long calc(int n)
        {
            long startTime = System.currentTimeMillis();
            ConcurrentlyCounting fib = new ConcurrentlyCounting(n);
            fib.start();
            try {
                                fib.join();
                        } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
            System.out.println(fib.result);
           
            long endTime = System.currentTimeMillis();
                    return endTime-startTime;
           
        }
    
}
