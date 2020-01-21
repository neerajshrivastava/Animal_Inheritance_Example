/**
 * 
 */
package com.animal.birds;

import com.animal.Animal;
import com.animal.Bird;

/**
 * @author neeraj
 *
 */
public class Parrot extends Bird {
	
	@Override
	public void sing(String sound) {
		System.out.println("I say : "+sound);
	}

	/**
	 * Parrot living with different animals
	 * @param animalName
	 * @param sound
	 */
	public void livingWithAndSound(Animal animalName, String sound){
		System.out.println("I am living with : "+animalName.getClass());
		// Added condition in case we want to know only living with animal name.
		if(null!=sound)
		{
		  sing(sound);
		}
		
	}
}
