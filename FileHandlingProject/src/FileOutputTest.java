import java.io.FileOutputStream;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//public class FileOutputTest {
//
//	public static void main(String[] args) {
//		String s = "\nLets add this string to the file\nHello there this is Suvomoy!!!!";
//		
//		MyFile f1 = new MyFile("C:\\Users\\SMA71\\Documents\\Fourth.txt","Fourth.txt",true);
//		MyFile f2 = new MyFile("C:\\Users\\SMA71\\Documents\\Fifth.txt","Fifth.txt",true);
//		MyFile f3 = new MyFile("C:\\Users\\SMA71\\Documents\\Sixth.txt","Sixth.txt",true);
//		
//		ArrayList<MyFile> files = new ArrayList<MyFile>();
//		files.add(f1);
//		files.add(f2);
//		files.add(f3);
//		
//		ArrayList<String> sentence = new ArrayList<String>();
//		sentence.add("Hello from the fourth file");
//		sentence.add("Hello from the fifth file");
//		sentence.add("Hello from the sixth file");
//		
//		for(int i=0;i<sentence.size();i++) {
//			System.out.println("-----------------------------------------------------------------------");
//			files.get(i).writeInFile(sentence.get(i));
//			files.get(i).closeFile();
//			System.out.println("-----------------------------------------------------------------------");
//		}
//		
//	}
//}
//
//
//class MyFile{
//	String location;
//	String name;
//	FileOutputStream fout;
//	
//	MyFile(String location,String name,boolean append){
//		this.location = location;
//		this.name = name;
//		
//		System.out.println("Trying to open the file " + name);
//		try {
//			fout = new FileOutputStream(location,append);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Opened " + name + " successfully");
//		
//	}
//	
//	void writeInFile(String sentence) {
//		byte barray[] = sentence.getBytes();
//		
//		try {
//			fout.write(barray);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	void closeFile() {
//		System.out.println("\nTrying to close the file " + name);
//		try {
//			fout.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Closed the file " + name + " successfully");
//	}
//	
//}



public class FileOutputTest {

	public static void main(String[] args) {
		MyFrame frame1 = new MyFrame();
		Thread t1 = new Thread(frame1);
		t1.start();
		
		MyFrame frame2 = new MyFrame();
		Thread t2 = new Thread(frame2);
		t2.start();
	}
}

class MyFrame extends JFrame implements ActionListener,Runnable{
	JLabel label1 = new JLabel("Enter file name : ");
	JTextField fileName = new JTextField(30);
	
	JLabel label2 = new JLabel("Enter file data : ");
	JTextArea dataArea = new JTextArea(15,30);
	
	JButton save = new JButton("Save");
	JButton clear = new JButton("Clear");
	JButton clearFile = new JButton("Clear File");
	JButton addFromStart = new JButton("Add from start");
	JButton getText = new JButton("Load from file");
	
	MyFrame(){
		setLayout(new FlowLayout());
		setSize(400,500);
		setLocation(100,100);
		setTitle("My notepad");
		add(label1);
		add(fileName);
		add(label2);
		add(dataArea);
		add(save);
		add(clear);
		add(clearFile);
		add(addFromStart);
		add(getText);
		save.addActionListener(this);
		clear.addActionListener(this);
		clearFile.addActionListener(this);
		addFromStart.addActionListener(this);
		getText.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==save) {
			try {
				FileOutputStream fout = new FileOutputStream(fileName.getText(),true);
				
				byte barray[] = dataArea.getText().getBytes();
				
				fout.write(barray);
				
				fout.close();
				
				JOptionPane.showMessageDialog(this, "File saved successfully");
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==clear) {
			dataArea.setText("");
			fileName.setText("");
		}
		else if(e.getSource()==clearFile) {
			try {
				FileOutputStream fout = new FileOutputStream(fileName.getText(),false);
				
				
				fout.close();
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==addFromStart) {
			try {
				FileOutputStream fout = new FileOutputStream(fileName.getText(),false);
				
				byte barray[] = dataArea.getText().getBytes();
				
				fout.write(barray);
				
				fout.close();
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==getText) {
			try {
				FileInputStream fin = new FileInputStream(fileName.getText());
				
				byte itr = (byte) fin.read();
				String str = "";
				while(itr!=-1) {
					str += (char)itr;
					itr = (byte)fin.read();
				}
				dataArea.setText(str);
				fin.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		setVisible(true);
	}
	
	
	
}