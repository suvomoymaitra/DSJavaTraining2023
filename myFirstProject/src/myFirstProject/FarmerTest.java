package myFirstProject;

public class FarmerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather gf = new GrandFather();
		gf.wakeUp();
		gf.farming();
		
		Father f = new Father();
		f.wakeUp();
		f.farming();
		f.banking();
		
		Child c = new Child();
		c.wakeUp();
		c.farming();
		c.banking();
		c.javaCoding();
	}

}

class GrandFather{
	void wakeUp() {
		System.out.println("Grandfather wakes up at 4.30....");
	}
	
	void farming(){
		System.out.println("Grandfather is farming....");
	}
}

class Father extends GrandFather{
	void wakeUp() {
		System.out.println("Father wakes up at 5.30....");
	}
	
	void farming() {
		System.out.println("Father uses tractor for farming....");
	}
	
	void banking() {
		System.out.println("Father goes to bank physically....");
	}
}

class Child extends Father{
	void wakeUp() {
		System.out.println("Child wakes up at 6.30....");
	}
	
	void farming() {
		System.out.println("Child uses robot for farming....");
	}
	
	void banking() {
		System.out.println("Child uses mobile app for new banking....");
	}
	
	void javaCoding() {
		System.out.println("Child does JAVA coding");
	}
}
