/**
 * 
 */
package com.animal.others;

import com.animal.Fishes;

/**
 * @author neeraj
 *
 */
public class Clownfish extends Fishes{
	/* (non-Javadoc)
	 * @see com.animal.Fishes#size(java.lang.String)
	 */
	@Override
	public void size(String size) {
		System.out.println("I am "+size);
	}

	/* (non-Javadoc)
	 * @see com.animal.Fishes#color(java.lang.String)
	 */
	@Override
	public void color(String fishColor) {
		System.out.println("My color is "+fishColor);
	}

	/* (non-Javadoc)
	 * @see com.animal.Fishes#eat(java.lang.String)
	 */
	@Override
	public void eat(String foodName) {
		System.out.println("I can eat "+foodName);
	}

	/* (non-Javadoc)
	 * @see com.animal.Animal#walk(java.lang.String)
	 */
	@Override
	public void walk(String walk) {
		System.out.println("I "+walk);
		
	}

	/* (non-Javadoc)
	 * @see com.animal.Animal#sing(java.lang.String)
	 */
	@Override
	public void sing(String sound) {
		System.out.println("I can't say : "+sound);
		
	}

}
