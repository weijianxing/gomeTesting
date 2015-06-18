package com.gome.orderg.base.demo.keywordFinal;

import java.util.ArrayList;
import java.util.List;

public class AdvanceFinalUsage {

	public AdvanceFinalUsage() {
		// TODO Auto-generated constructor stub
	}

	private final List<String> testTeam = new ArrayList<String>();
	
	private List<String> tempTeam = new ArrayList<String>();
	private List<String> devTema = new ArrayList<String>();
	
	//
	public void overrideTempteam(List<String> newTestTeam){
		tempTeam = newTestTeam;
	}
	
	//If you override final Object ,sorry you'll get a grammar mistake.
	/*public void overrideFinalArray(List<String> newTestTeam){
		testTeam = newTestTeam;
	}*/
	
	// if a final variable holds a reference to an array,
	//then the components of the array may be changed by operations on the array, but the variable will always refer to the same array.
	public void operateTempteam(String newTester){
		testTeam.add(newTester);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanVariableOverridden varOverride = new BanVariableOverridden("Jason testing");
		
		//You cann't override final static variable.
		//varOverride.PI = 2;
		varOverride.diameter = 15;
		System.out.println("Get new diameter is : " + varOverride.diameter);
		System.out.println("Get PI is : " + varOverride.PI);
		
	}
	

}
