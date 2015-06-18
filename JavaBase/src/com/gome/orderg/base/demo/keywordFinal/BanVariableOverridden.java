package com.gome.orderg.base.demo.keywordFinal;
/**
 * When you declare a field final, you must set the value once by the time the constructor exits.
 * @author weijianxing
 * 
 *  http://www.infoq.com/cn/articles/java-memory-model-6
 *
 */

public class BanVariableOverridden {

	public static final double PI = 3.141592653589793;
	public static double diameter = 2;
	private final String name;
	private final int age = 30;
	private String addr = ""; 
	public BanVariableOverridden(String myName) {
		// TODO Auto-generated constructor stub
		name=myName;
	}
	
	public void setAddr(String newAddr){
		this.addr = newAddr;
	}
	
	
	//If you break the rule , Sorry you get a grammar mistake. 
	/*
	public void setName(String newName){
		this.name = newName;
	}
	*/
}
