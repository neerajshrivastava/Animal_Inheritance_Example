/**
 * 
 */
package com.animal.others;

import com.animal.interfaces.AnimalAbilities;

/**
 * @author neeraj
 *
 */
public class Dolphins implements AnimalAbilities {
	
	/* (non-Javadoc)
	 * @see com.animal.interfaces.AnimalAbilities#swim()
	 */
	@Override
	public void swim() {
		System.out.println("I can swim");
	}
}
