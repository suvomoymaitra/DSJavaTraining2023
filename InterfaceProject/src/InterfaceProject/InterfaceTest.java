package InterfaceProject;

public class InterfaceTest {
	
	public static void main(String[] args) {
		Machine autoWashingMachine = new AutomaticWashingMachine();
		autoWashingMachine.performWork();
		
		System.out.println("----------------------------------------------------------------------------");
		
		AutomaticWashingMachine autoWashingMachine2 = new AutomaticWashingMachine();
		autoWashingMachine2.performWork();
		Clothes clothes = new Clothes();
		Detergent detergent = new Detergent();
		
		Laundry washedClothes = autoWashingMachine2.washClothes(clothes, detergent);
		
		System.out.println("Clean clothes are produced....");
	}
}

class Clothes{
	
}
class Detergent{
	
}

class Laundry{
	
}

interface PerformingWork {
	void performWork();
}

abstract class Machine implements PerformingWork{
	public void performWork() {
		System.out.println("Machine is performing some work....");
	}

	public void washClothes() {
		// TODO Auto-generated method stub
		
	}
}

abstract class WashingMachine extends Machine{
	
}

interface Drilling{
	void drill();
}

class DrillingMachine extends Machine implements Drilling{
	public void drill() {
		System.out.println("Drilling machine is drilling....");
	}

	@Override
	public void performWork() {
		System.out.println("Drilling machine is performing some work....");
		
	}
}

interface Cooling extends PerformingWork{
	void cool();
}

class AirConditioner extends Machine implements Cooling{
	public void cool() {
		System.out.println("The air conditioner is cooling....");
	}

	@Override
	public void performWork() {
		System.out.println("Air conditioner is performing some work....");
		
	}
}

interface WashingClothes extends PerformingWork{
	Laundry washClothes(Clothes c,Detergent d);
}

class AutomaticWashingMachine extends WashingMachine implements WashingClothes{
	@Override
	public void performWork() {
		System.out.println("Automatic Washing machine is performing some work....");
	}

	@Override
	public Laundry washClothes(Clothes c, Detergent d) {
		System.out.println("Produced by automatic washing machine....");
		Laundry l = new Laundry();
		return l;
	}
}

class SemiAutomaticMachine extends WashingMachine implements WashingClothes{
	@Override
	public void performWork() {
		System.out.println("Automatic Washing machine is performing some work....");
	}
	@Override
	public Laundry washClothes(Clothes c, Detergent d) {
		System.out.println("Produced by semi-automatic washing machine....");
		Laundry l = new Laundry();
		return l;
	}
}


//interface A{
//	void a();
//}
//
//interface B extends A{
//	
//}
//
//interface C extends A{
//	
//}
//
//class D implements B,C{
//	public void a() {
//		
//	}
//}