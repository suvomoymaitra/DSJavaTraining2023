import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DynamicAdding {

	public DynamicAdding() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ArrayList<CricketPlayer> teamIndia = new ArrayList<CricketPlayer>();
		
		int choice = 0;
		int rank = 0;
		
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter name : ");
			String name = scanner.nextLine();
			
			scanner = new Scanner(System.in);
			System.out.println("Enter total runs made : ");
			int totalRunsMade = scanner.nextInt();
			
			scanner = new Scanner(System.in);
			System.out.println("Enter total sixers hit : ");
			int totalSixers = scanner.nextInt();
			
			scanner = new Scanner(System.in);
			System.out.println("Enter total fours hit : ");
			int totalFours = scanner.nextInt();
			
			scanner = new Scanner(System.in);
			System.out.println("Enter current run : ");
			int currentRun = scanner.nextInt();
			
			scanner = new Scanner(System.in);
			System.out.println("Enter age : ");
			int age = scanner.nextInt();
			
			scanner = new Scanner(System.in);
			System.out.println("Enter strike rate : ");
			float sr = scanner.nextFloat();
			
			CricketPlayer cricketer = new CricketPlayer(++rank, name, "India", totalRunsMade, totalSixers, totalFours, currentRun, age, sr);
			teamIndia.add(cricketer);
			
			System.out.println("Added the player successfully....");
			
			scanner = new Scanner(System.in);
			System.out.println("Do you wish to continue adding players? (0 to continue or 1 to exit)");
			choice = scanner.nextInt();
			
		}while(choice==0);
		
		
		
		
		for(Iterator<CricketPlayer> iter = teamIndia.iterator();iter.hasNext();) {
			System.out.println(iter.next());
		}
		
		
		
	}

}
