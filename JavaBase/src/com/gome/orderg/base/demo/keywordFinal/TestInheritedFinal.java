package com.gome.orderg.base.demo.keywordFinal;


/**
 * practice final keyword usage.
 * @author weijianxing
 * 
 * Once a final variable has been assigned, it always contains the same value. 
 * If a final variable holds a reference to an object, then the state of the object may be changed by operations on the object, 
 * but the variable will always refer to the same object. This applies also to arrays, 
 * because arrays are objects; if a final variable holds a reference to an array,
 * then the components of the array may be changed by operations on the array, but the variable will always refer to the same array.[1]
 * (ref https://en.wikipedia.org/wiki/Final_%28Java%29)
 * 
 */
//If you overrite final Class , you'll get a grammar mistake.
public class TestInheritedFinal extends BanMethodOverridden {

	public TestInheritedFinal() {
		// TODO Auto-generated constructor stub
	}
	
	// If you overrite final method , you'll get a grammar mistake.
	/*public final void banOverrite(){
		System.out.println("Sorry you can be overidden me!" );
	}*/
	
	// If you overrite final  method , you'll get a grammar mistake.
	
//	public  void banOverriteStaticFinal(){
//		System.out.println("Sorry you can be overidden final static method!" );
//	}
	
	public void overriteWhatever(){
		System.out.println("BanMethodOverritten.overriteWhatever can be overidden by subclass" );
		//BanVariableOverridden
	}
	
	
}
