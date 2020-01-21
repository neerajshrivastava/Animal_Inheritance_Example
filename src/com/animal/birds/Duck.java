/**
 * 
 */
package com.animal.birds;

import com.animal.Bird;
import com.animal.interfaces.AnimalAbilities;

/**
 * @author neeraj
 * a. A duck says: “Quack, quack”
 * b. A duck can swim
 */
public class Duck extends Bird implements AnimalAbilities {

	@Override
	public void sing(String sound) {
		System.out.println("Duck syas Quack, quack");
	}

	/**
	 *  To know whether animal can swim or not.
	 */
	 public void swim (){
		System.out.println("I can swim");
	}
}
