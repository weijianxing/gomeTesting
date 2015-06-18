package com.gome.orderg.base.demo.keywordStatic;

public class Tester {

	public static int age = 26;
	private static String name ="";
	private int SAPCode = 8888;
	
	//At the app lifetime callTimes will increase.
	public static int callTimes = 0;
	
	public static void executeTesting( String caseName){
		System.out.println("Hi I'm "+ name + " test case " + caseName + " today I'll execute it.");
	}
	public Tester(String testerName) {
		// TODO Auto-generated constructor stub
		name = testerName;
		callTimes++;
	}

}
