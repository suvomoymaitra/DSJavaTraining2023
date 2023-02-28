public class Test {

	public static void main(String[] args) {
		Disp1 dis1 = new Disp1();
		Disp2 dis2 = new Disp2();
		Disp3 dis3 = new Disp3();
		Disp4 dis4 = new Disp4();
		
		dis1.start();
		dis2.start();
		dis3.start();
		dis4.start();
		
	}
}

class Disp1 extends Thread{
	
	void disp() {
		for(int i=0;i<100;i++) {
			System.out.println("disp1");
		}
	}
	
	public void run() {
		disp();
	}
	
}


class Disp2 extends Thread{
	
	void disp() {
		for(int i=0;i<100;i++) {
			System.out.println("\tdisp2");
		}
	}
	
	public void run() {
		disp();
	}
	
}

class Disp3 extends Thread{
	
	void disp() {
		for(int i=0;i<100;i++) {
			System.out.println("\t\tdisp3");
		}
	}
	
	public void run() {
		disp();
	}
	
}
class Disp4 extends Thread{
	
	void disp() {
		for(int i=0;i<100;i++) {
			System.out.println("\t\t\tdisp4");
		}
	}
	
	public void run() {
		disp();
	}
	
}




































//public class Test {
//
//	public static void main(String[] args) {
//		Pen pen = new Pen();
//		pen.write();
//		
//		System.out.println("----------------------------------");
//		Chalk chalk = new Chalk();
//		Pen pen1 = new Pen(chalk);
//		pen1.start();
//		
//		//Make a pen object, and on calling pen's start
//		//it must invoke the chalks's write
//	
//	}
//}




//interface Writeable
//{
//	void write(); //public abstract
//}
//class Pen implements Writeable
//{
//	Writeable w;
//	
//	Pen(){
//		w = this;
//	}
//	
//	Pen(Writeable w){
//		this.w = w;
//	}
//	
//	void start() {
//		System.out.println("Lets start to write...");
//		System.out.println("Lets take paper");
//		System.out.println("Lets take a surface for the paper......");
//		
//		write();
//	}
//	public void write() { //MANDATORY OR NOT? YES
//		System.out.println("Writing with pen.....");
//	}
//}
//
//class FountainPen extends Pen //isA
//{
//	public void write() { //IS IT MANDATORY??? NO - overridden
//		System.out.println("Writing with fountain pen.....");
//	}
//}
//
//class Stone
//{
//		
//}
//class Chalk extends Stone implements Writeable
//{
//	public void write() { //mandatory
//		System.out.println("Chalk is writing on the blackboard.....");
//	}
//}