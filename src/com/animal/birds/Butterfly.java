/**
 * 
 */
package com.animal.birds;

import com.animal.Animal;
import com.animal.interfaces.InsectAbilities;

/**
 * @author neeraj
 *
 */
public class Butterfly extends Animal implements InsectAbilities{
	
	/* (non-Javadoc)
	 * @see com.animal.Animal#sing(java.lang.String)
	 */
	@Override
	public void sing(String sound) {
		System.out.println("I can't say : "+sound);
		
	}


	@Override
	public void fly() {
		System.out.println("I can fly");
	}


	@Override
	public void walk(String walk) {
		System.out.println("I "+walk);
	}


	
}
