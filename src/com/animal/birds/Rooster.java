/**
 * 
 */
package com.animal.birds;

/**
 * @author neeraj 
 * Rooster male chicken.
 *
 */
public class Rooster {

	// Chicken reference :Other ways to model a rooster without using inheritance
	Chicken maleChiken;
	
	/**
	 * To know gender of chicken
	 */
	public void mygender(){
		getMaleChiken().gender("male");
	}
	
	/**
	 * To know gender
	 */
	public void mySound(String sound){
		getMaleChiken().sing(sound);;
		
	}
	
	/**
	 * Set chicken object
	 * @param maleChiken
	 */
	public void setMaleChiken(Chicken maleChiken) {
		this.maleChiken = maleChiken;
	}

	/**
	 * Get chicken object
	 * @return
	 */
	public Chicken getMaleChiken() {
		return maleChiken;
	}

}
