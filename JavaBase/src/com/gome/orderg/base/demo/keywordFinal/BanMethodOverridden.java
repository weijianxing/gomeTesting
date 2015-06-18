package com.gome.orderg.base.demo.keywordFinal;

/**
 * 
 * @author weijianxing
 *You can declare some or all of a class's methods final. 
 *You use the final keyword in a method declaration to indicate that the method cannot be overridden by subclasses. 
 *The Object class does this¡ªa number of its methods are final.
 */
public class BanMethodOverridden {

	public BanMethodOverridden() {
		// TODO Auto-generated constructor stub
	}
	
	
	public final void banOverrite(){
		System.out.println("Sorry you can be overidden final method!" );
	}
	public  final static void banOverriteStaticFinal(){
		System.out.println("Sorry you can be overidden final static method!" );
	}
	public void overriteWhatever(){
		System.out.println("BanMethodOverritten.overriteWhatever can be overidden by subclass" );
	}
}
