package com.gome.orderg.base.demo.keywordFinal;

/**
 *  A class that is declared final cannot be subclassed. This is particularly useful, 
 *  for example, when creating an immutable class like the String class.
 * @author weijianxing
 *
 */
public final class BanClassOverridden {
	public void desc(){
		System.out.println("Ha Ha you cann't extend me!");
	}

}
