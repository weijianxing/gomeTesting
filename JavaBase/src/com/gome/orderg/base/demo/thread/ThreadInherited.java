package com.gome.orderg.base.demo.thread;
/**
 * main code reference bellow link.
 * 
 * ref http://www.ibm.com/developerworks/cn/education/java/j-threads/j-threads.html
 */


/**
 * ThreadInherited -- calculate as many primes as we can in ten seconds 
 * 
 */ 


//this impl isn't recommend Jave only extends one baseClass 
// 
public class ThreadInherited extends Thread {

    public static final int MAX_PRIMES = 1000000;
    public static final int TWO_SECONDS = 2000;

    //volatile used for thread as light synchronized
    //about more volatile ref http://www.ibm.com/developerworks/cn/java/j-jtp06197.html
    public volatile boolean finished = false;

    public void run() {
        int[] primes = new int[MAX_PRIMES];
        int count = 0;

        for (int i=2; count<MAX_PRIMES; i++) {

            // Check to see if the timer has expired
            if (finished) {
                break;
            }

            boolean prime = true;
            for (int j=0; j<count; j++) {
                if (i % primes[j] == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                primes[count++] = i;
                System.out.println("Found prime: " + i);
            }
        }
    }

    //main method is also a main thread.
    public static void main(String[] args) {
        ThreadInherited calculator = new ThreadInherited();
        //the object start method to startup the thread.
        calculator.start();
        try {
            Thread.sleep(TWO_SECONDS);
        }
        catch (InterruptedException e) {
            // fall through
        }

        calculator.finished = true;
        //all the thread finish.
    }
}