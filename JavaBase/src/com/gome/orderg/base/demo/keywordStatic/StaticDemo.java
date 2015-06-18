/**
 * 
 */
package com.gome.orderg.base.demo.keywordStatic;

/**
 * @author weijianxing
 *
 */
public class StaticDemo {

	/**
	 * 
	 */
	public StaticDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester tester = new Tester("Jason");
		System.out.println("I've executed " + tester.callTimes);
		Tester reTest = new Tester("Jason");
		
		tester.executeTesting("OMS");
		
		System.out.println("I've executed " + reTest.callTimes);
	
	}

}
