package com.gome.orderg.base.demo.keywordFinal;


/**
 * practice final keyword usage.
 * @author weijianxing
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
	public void overriteWhatever(){
		System.out.println("BanMethodOverritten.overriteWhatever can be overidden by subclass" );
	}
}
