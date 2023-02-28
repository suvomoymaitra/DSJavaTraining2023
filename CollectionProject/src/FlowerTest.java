import java.util.Scanner;

public class FlowerTest {

	public FlowerTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the hint : ");
		String hint = scan.nextLine();
		
		FlowerShop shop = new FlowerShop();
		Flower flower = shop.getFlower(hint);
		flower.flowering();
		flower.whatIsTheFragrance();
		
	}
}


class FlowerShop{
	
	Flower getFlower(String hint) {
		Flower flower = null;
		if(hint.equals("valentine")) {
			flower = new Rose();
		}
		else if(hint.equals("oil")) {
			flower = new Sunflower();
		}
		else if(hint.equals("arab")) {
			flower = new ArabRose();
		}
		else if(hint.equals("diwali")) {
			flower = new Lotus();
		}
		return flower;
	}
	
	
}

interface fragrancing{
	void whatIsTheFragrance();
}

abstract class Flower implements fragrancing{
	abstract void flowering();
}

class Rose extends Flower{

	@Override
	public void whatIsTheFragrance() {
		// TODO Auto-generated method stub
		System.out.println("Rose is smelling like rose....");
		
	}

	@Override
	void flowering() {
		// TODO Auto-generated method stub
		System.out.println("Rose is flowering....");
	}
}


class ArabRose extends Rose{

	@Override
	public void whatIsTheFragrance() {
		// TODO Auto-generated method stub
		System.out.println("ArabRose is smelling like rose....");
		
	}

	@Override
	void flowering() {
		// TODO Auto-generated method stub
		System.out.println("ArabRose is flowering....");
	}
}
class Lotus extends Flower{

	@Override
	public void whatIsTheFragrance() {
		// TODO Auto-generated method stub
		System.out.println("Lotus is smelling like rose....");
		
	}

	@Override
	void flowering() {
		// TODO Auto-generated method stub
		System.out.println("Lotus is flowering....");
	}
}
class Sunflower extends Flower{

	@Override
	public void whatIsTheFragrance() {
		// TODO Auto-generated method stub
		System.out.println("Sunflower is smelling like rose....");
		
	}

	@Override
	void flowering() {
		// TODO Auto-generated method stub
		System.out.println("Sunflower is flowering....");
	}
}

