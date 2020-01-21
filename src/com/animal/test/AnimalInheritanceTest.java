package com.animal.test;

import com.animal.Bird;
import com.animal.Fishes;
import com.animal.birds.Butterfly;
import com.animal.birds.Caterpillar;
import com.animal.birds.Chicken;
import com.animal.birds.Duck;
import com.animal.birds.Parrot;
import com.animal.birds.Rooster;
import com.animal.others.Cat;
import com.animal.others.Clownfish;
import com.animal.others.Dog;
import com.animal.others.Dolphins;
import com.animal.others.Sharks;

/**
 * @author neeraj
 * Test class to test animal inheritance.
 */
public class AnimalInheritanceTest {
	public static void main(String[] args) {
		//*** Answer of A -> 1
		Bird bird = new Bird();
		bird.walk("can walk");
		bird.fly();
		bird.sing("singing");
		System.out.println("***************"+"\n");
		//*** Answer of A -> 2
		Duck duck = new Duck();
		Chicken chicken = new Chicken();
		//Duck can sing & swim
		duck.sing("Quack, quack");
		duck.swim();
		//Chicken can sing but can not fly and swim
		chicken.sing("Cluck, cluck");
		System.out.println("***************"+"\n");
		//*** Answer of A -> 3
		Rooster rooster = new Rooster();
		rooster.setMaleChiken(chicken);
		rooster.mySound("Cock-a-doodle-doo");
		rooster.mygender();
		System.out.println("***************"+"\n");
		//*** Answer of A -> 4
		Parrot parrot = new Parrot();
		//A parrot living with dogs says: “Woof, woof”
		Dog dog = new Dog();
		parrot.livingWithAndSound(dog, "Woof, woof");
		//A parrot living with cats says: “Meow”
		Cat cat = new Cat();
		parrot.livingWithAndSound(cat, "Meow”");
		//A parrot living near the rooster says: “Cock-a-doodle-doo”
		parrot.livingWithAndSound(rooster.getMaleChiken(), "Cock-a-doodle-doo");
		//A parrot living near the duck says: “Quack, quack”
		parrot.livingWithAndSound(duck, "Quack, quack");
		System.out.println("***************"+"\n");
		//*** Answer of B -> 1 & 2
		Sharks sharks = new Sharks();
		sharks.size("large");
		sharks.color("gray");
		sharks.eat("other fishes");
		Clownfish clownfish = new Clownfish();
		clownfish.size("small");
		clownfish.color("orange");
		clownfish.makeJoke();
		System.out.println("***************"+"\n");
		//*** Answer of B -> 3
		Dolphins dolphins = new Dolphins();
		dolphins.swim();
		System.out.println("***************"+"\n");
		//*** Answer of D -> 1 & 2
		Butterfly butterfly = new Butterfly();
		System.out.println("I am Butterfly");
		butterfly.fly();
		butterfly.sing("SS");
		Caterpillar caterpillar = new Caterpillar();
		System.out.println("I am Caterpillar");
		caterpillar.fly();
		caterpillar.walk("crawl");
	}
}
