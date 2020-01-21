/**
 * 
 */
package com.animal.others;

import com.animal.Animal;

/**
 * @author neeraj
 *
 */
public class Dog extends Animal {

	@Override
	public void walk(String walk) {
		System.out.println("I " +walk);
		
	}

	@Override
	public void sing(String sound) {
		System.out.println("I am " +sound);
	}

}
