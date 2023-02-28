import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class FileInputTest {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\SMA71\\Documents\\First.txt","First.txt");
		File f2 = new File("C:\\Users\\SMA71\\Documents\\Second.txt","Second.txt");
		File f3 = new File("C:\\Users\\SMA71\\Documents\\Third.txt","Third.txt");
		
		ArrayList<File> fileList = new ArrayList<File>();
		
		fileList.add(f1);
		fileList.add(f2);
		fileList.add(f3);
		
		for (File file : fileList) {
			System.out.println("----------------------------------------------------------------------");
			file.readFile();
			file.closeFile();
			System.out.println("----------------------------------------------------------------------");
		}
	}
}

class File{
	String location;
	String name;
	FileInputStream fin;
	
	File(String location,String name){
		this.location = location;
		this.name = name;
		
		System.out.println("Trying to open the file " + name);
		try {
			fin = new FileInputStream(location);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Opened " + name + " successfully");
		
	}
	
	void readFile() {
		try {
			
			byte itr = (byte) fin.read();
			
			while(itr!=-1) {
				Thread.sleep(10);
				System.out.print((char)itr);
				itr = (byte)fin.read();
			}
			
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void closeFile() {
		System.out.println("\nTrying to close the file " + name);
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Closed the file " + name + " successfully");
	}
	
}



//public class FileInputTest {
//
//	public static void main(String[] args) {
//		MyFrame mf1 = new MyFrame("Counter 1", 550, 200, 100, 200);
//		Thread thread = new Thread(mf1);
//		thread.start();
//	}
//}
//
//class MyFrame extends JFrame implements Runnable{
//	TextArea area = new TextArea();
//	JTextField field = new JTextField(30);
//	JButton ok = new JButton("OK");
//	
//	MyFrame(String title,int w,int h,int x,int y){
//		setTitle(title);
//		setSize(w,h);
//		setLocation(x,y);
//		setVisible(true);
//		add(field);
//		setLayout(new FlowLayout());
//	}
//	
//	public void printInFrame() {
//		try {
//			System.out.println("Trying to open the file....");
//			FileInputStream fin = new FileInputStream("C:\\Users\\SMA71\\Documents\\CoreJavaNotes.txt");
//			System.out.println("Opened the file successfully....");
//			
//			byte b = (byte) fin.read();
//			
//			while(b!=-1) {
//				Thread.sleep(10);
//				
//				field.add((char)b + "", area);
//				
//				b = (byte) fin.read();
//			}
//			
//			System.out.println("Trying to close the file....");
//			fin.close();
//			System.out.println("Sucessfully closed the file");
//			
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("Handler 1 : " + e);
//		} catch (IOException e) {
//			System.out.println("Handler 2 : " + e);
//		} catch (InterruptedException e) {
//			System.out.println("Handler 3 : " + e);
//		}
//	}
//	
//	public void run() {
//		printInFrame();
//	}
//}