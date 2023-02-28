package inhertianceProject;

public class LivingOrgainsmsTest {
	public static void main(String[] args) {
		LivingOrganisms l = new LivingOrganisms();
		l.live();
	}
}

class LivingOrganisms{
	void live() {
		System.out.println("The organism is living....");
	}
	
	void respiration() {
		System.out.println("The living organism is performing respiration....");
	}
}

class Animals extends LivingOrganisms{
	void eat() {
		System.out.println("The animal is eating....");
	}
	
	void sleep() {
		System.out.println("The animal is sleeping....");
	}
	
	void fear() {
		System.out.println("The animal is scared....");
	}
	
	void reproduce() {
		System.out.println("The animal is reproducing....");
	}
	
	void respiration() {
		System.out.println("The animal is preforming respiration....");
	}
}

class Plants extends LivingOrganisms{
	void transpiration() {
		System.out.println("The plant is performing transpiration....");
		doPhotosynthesis();
	}
	
	void doPhotosynthesis() {
		System.out.println("The plant is performing photosynthesis");
	}
	
	void growLeaves() {
		System.out.println("The plant is growing new leaves");
	}
}

class Herbs extends Plants{
	void produceFlowers() { 
		System.out.println("Herb is producing flower....");
	}
}

class Tree extends Plants{
	void produceFruits() {
		System.out.println("Tree is producing fruits....");
	}
}

class Creepers extends Plants{
	void produceFlowers() {
		System.out.println("Creeper is producing flower....");
	}
}

class Mint extends Herbs{
	void growLeaves() {
		System.out.println("Mint is producing minty leaves....");
	}
}

class Oregano extends Herbs{
	void growLeaves() {
		System.out.println("Oregano is producing leaves....");
	}
}

class MangoTree extends Tree{
	void produceFruits() {
		System.out.println("Mango tree is producing mango....");
	}
}

class CoconutTree extends Tree{
	void produceFruits() {
		System.out.println("Coconut tree is producing coconut....");
	}
}

class Cactus extends Creepers{
	void produceVeryLongRoots() {
		System.out.println("Cactus producing a very long root....");
	}
}

class Potato extends Creepers{
	
}

class Mammals extends Animals{
	 
}

class Bird extends Animals{
	
}

class Fish extends Animals{
	
}

class Reptiles extends Animals{
	
}


class Human extends Mammals{
	
}

class Dog extends Mammals{
	
}

class Sparrow extends Bird{
	
}

class Parrot extends Bird{
	
}

class Shark extends Fish{
	
}

class SwordFish extends Fish{
	
}

class Crocodile extends Reptiles{
	
}

class Snake extends Reptiles{
	
}