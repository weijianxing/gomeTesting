/**
 * 
 */
package com.gome.orderg.base.demo.keywordStatic;

/**
 * @author weijianxing
 *
 *
 */
public class SingletonPatternDemo {
    private static SingletonPatternDemo instance = null;
    private SingletonPatternDemo() { }
 
    public static synchronized SingletonPatternDemo getInstance() {
        if (instance == null) {
            instance = new SingletonPatternDemo();
        }
 
        return instance;
    }
}