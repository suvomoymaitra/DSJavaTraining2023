package myFirstProject;

import java.time.LocalDate;

public class DataTypes{
	public static void main(String[] args) {
		byte classRollNumber = 45;
		short univesityRollNumber = 20000;
		int internationalUniversityRollNumber = 235234523;
		long galacticUniversityRollNumber = 123414081341234L;
		
		
		System.out.println("Class Roll Number : " + classRollNumber);
		System.out.println("University Roll Number : " + univesityRollNumber);
		System.out.println("International University Roll Number : " + internationalUniversityRollNumber);
		System.out.println("Galactic University Roll Number : " + galacticUniversityRollNumber);
		
		float bankInterest = 5.67f;
		double molecularDistance = 0.00000238745;
		
		System.out.println("Bank Interest : " + bankInterest);
		System.out.println("Molecular Distance : " + molecularDistance);
		
		char gender = 'M';
		String introduction = "Hello I am Suvomoy!!";
		boolean flag = true;
		
		System.out.println("Gender : " + gender);
		System.out.println("Introduction : " + introduction);
		System.out.println("Flag : " + flag);
		
		LocalDate today = LocalDate.now();
		
		System.out.println("Today's date : " + today);
		
	}
}