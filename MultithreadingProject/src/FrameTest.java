import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTest{
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		MyFrame mf1 = new MyFrame("Counter 1", 550, 200, 100, 200,t);
		MyFrame mf2 = new MyFrame("Counter 2", 550, 200, 400, 500,t);
		MyFrame mf3 = new MyFrame("Counter 3", 550, 200, 700, 800,t);
		Thread t1 = new Thread(mf1);
		Thread t2 = new Thread(mf2);
		Thread t3 = new Thread(mf3);
		
		System.out.println("Is MAIN alive : " + t.isAlive() + ", Priority : " + t.getPriority());
		
		System.out.println("Is thread1 alive : " + t1.isAlive() + ", Priority : " + t1.getPriority());
		System.out.println("Is thread2 alive : " + t2.isAlive() + ", Priority : " + t2.getPriority());
		System.out.println("Is thread3 alive : " + t3.isAlive() + ", Priority : " + t3.getPriority());
		
		
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Is thread1 alive : " + t1.isAlive());
		System.out.println("Is thread2 alive : " + t2.isAlive());
		System.out.println("Is thread3 alive : " + t3.isAlive());
		
		System.out.println("Is MAIN alive : " + t.isAlive() + ", Priority : " + t.getPriority());
	}
}

class MyFrame extends JFrame implements Runnable{
	JTextField field = new JTextField(30);
	JTextField msg = new JTextField(30);
	JButton ok = new JButton("OK");
	Thread t;
	
	MyFrame(String title,int w,int h,int x,int y,Thread t){
		this.t = t;
		setTitle(title);
		setSize(w,h);
		setLocation(x,y);
		setVisible(true);
		add(field);
		add(msg);
		setLayout(new FlowLayout());
	}
	
	public void countNumbers() {
		for(int i=0;i<100000;i++) {
			field.setText("Counter is : " + i);
			msg.setText("IS MAIN ALIVE? : " + t.isAlive());
		}
	}
	
	public void run() {
		countNumbers();
	}
}



//public class FrameTest {
//
//	public static void main(String[] args) {
//		
//		Thread t = Thread.currentThread();
//		
//		MyFrame mf1 = new MyFrame("Counter 1", 550, 200, 100, 200,t);
//		MyFrame mf2 = new MyFrame("Counter 2", 550, 200, 400, 500,t);
//		MyFrame mf3 = new MyFrame("Counter 3", 550, 200, 700, 800,t);
//		Thread t1 = new Thread(mf1);
//		Thread t2 = new Thread(mf2);
//		Thread t3 = new Thread(mf3);
//		
//		System.out.println("Is MAIN alive : " + t.isAlive() + " Priority : " + t.getPriority());
//		
//		System.out.println("Is thread1 alive : " + t1.isAlive() + " Priority : " + t1.getPriority());
//		System.out.println("Is thread2 alive : " + t2.isAlive() + " Priority : " + t2.getPriority());
//		System.out.println("Is thread3 alive : " + t3.isAlive() + " Priority : " + t3.getPriority());
//		
//		
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
//		
//		
//		System.out.println("Is thread1 alive : " + t1.isAlive());
//		System.out.println("Is thread2 alive : " + t2.isAlive());
//		System.out.println("Is thread3 alive : " + t3.isAlive());
//		
//		System.out.println("Is MAIN alive : " + t.isAlive() + " Priority : " + t.getPriority());
//		
//	}
//
//}

//class MyFrame extends Frame implements Runnable{
//
//	TextArea area = new TextArea();
//	TextArea msg = new TextArea();
//	Thread t;
//
//	MyFrame(String title, int w, int h, int x, int y,Thread t) {
//		this.t = t;
//		setTitle(title);
//		setSize(w, h);
//		setLocation(x, y);
//	}
//
//	void displayNumbers() {
//		setVisible(true);
//		add(area);
//		add(msg);
//		for (int i = 1; i <= 4000; i++) {
//			area.setText(i + " ");
//			msg.setText("Is main alive? : " + t.isAlive());
//		}
//	}
//	@Override
//	public void run() {
//		displayNumbers();
//	}
//
//}
