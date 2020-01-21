/**
 * 
 */
package com.animal.birds;

/**
 * @author neeraj
 *
 */
public class Caterpillar extends Butterfly {

	/**
	 * Caterpillar can not fly.
	 */
	@Override
	public void fly() {
		System.out.println("I can not fly");
		}

	@Override
	public void walk(String walk) {
		System.out.println("I " +walk);
	}
	
	
	
}
