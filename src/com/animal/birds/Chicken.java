/**
 * 
 */
package com.animal.birds;

import com.animal.Bird;

/**
 * @author neeraj
 *  a. A chicken says: “Cluck, cluck”
 *  b. A chicken cannot fly (assumption: its wings are clipped but ignore that)
 *
 */
public class Chicken extends Bird {

	
	@Override
	public void sing(String sound) {
		System.out.println("Chicken says : "+sound);
	}
	
	public void gender (String gen){
		System.out.println("I am "+gen+" chiken");
	}
   
}
