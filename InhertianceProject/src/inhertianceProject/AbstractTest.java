package inhertianceProject;

public class AbstractTest {

	public static void main(String[] args) {
		WashingMachine autoWashingMachine = new AutomaticWashingMachine();
		
		autoWashingMachine.performWork();
		autoWashingMachine.washClothes();
	}
}



abstract class Machine{
	void performWork() {
		System.out.println("Machine is performing some work....");
	}
}

abstract class WashingMachine extends Machine{
	abstract void washClothes();
}

class DrillingMachine extends Machine{
	void drill() {
		System.out.println("Drilling machine is drilling....");
	}
}

class AirConditioner extends Machine{
	void cooling() {
		System.out.println("The air conditioner is cooling....");
	}
}

class AutomaticWashingMachine extends WashingMachine{
	@Override
	void washClothes() {
		System.out.println("Wash clothes automatically....");
	}
}

class SemiAutomaticMachine extends WashingMachine{
	@Override
	void washClothes() {
		System.out.println("Wash then wait for user and drain then wait for user then rinse then wait for user then dry....");
	}
}


abstract class A{
	abstract void fun();
}

abstract class B extends A{
	abstract void fun2();
	void fun3() {
		System.out.println("Hello from B");
	}
}

class C extends B{
	void fun() {
		
	}
	void fun2() {
		
	}
}

abstract class D extends C{
	
}
