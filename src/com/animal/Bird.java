package com.animal;

/**
 * @author neeraj
 *
 */
public class Bird extends Animal {
	
	/**
	 * Birds can fly.
	 */
	public void fly() {
		System.out.println("I am flying");
		}

	/**
	 * Birds can fly.
	 */
	public void sing(String sound) {
		System.out.println("I am " +sound);
	}

	@Override
	public void walk(String walk) {
		System.out.println("I " +walk);
	}
	
}
