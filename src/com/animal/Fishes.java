/**
 * 
 */
package com.animal;

import com.animal.interfaces.AnimalAbilities;

/**
 * @author neeraj
 *
 */
public abstract class Fishes extends Animal implements AnimalAbilities{

	/* (non-Javadoc)
	 * @see com.animal.interfaces.AnimalAbilities#swim()
	 */
	@Override
	public void swim() {
		System.out.println("I can swim");
	}
	
	/**
	 * Size of fish.
	 * @param size
	 */
	public abstract void size(String size);
	
	/**
	 * Color of fish.
	 * @param fishColor
	 */
	public abstract void color(String fishColor);
	
	/**
	 * Fishes eat food.
	 * @param foodName
	 */
	public abstract void eat(String foodName);
	
	/**
	 * Can make joke
	 */
	public void makeJoke() {
		System.out.println("I make jokes");
	}
	

}
