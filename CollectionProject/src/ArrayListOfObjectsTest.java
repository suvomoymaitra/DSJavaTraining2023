import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class ArrayListOfObjectsTest {

	public ArrayListOfObjectsTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		
		TreeSet<CricketPlayer> teamIndia1 = new TreeSet<CricketPlayer>();
		teamIndia1.add(new CricketPlayer(1, "Sachin", "India", 15000, 100, 200, 45, 40, 54.9f));
		teamIndia1.add(new CricketPlayer(2, "Virat" , "India", 12000,  95, 190, 70, 35, 80.5f));
		teamIndia1.add(new CricketPlayer(3, "Sehwag", "India", 10000, 100, 300, 50, 50, 60.8f));
		teamIndia1.add(new CricketPlayer(4,"Dhoni"  , "India", 10000, 120, 150, 40, 40, 70.5f));
		teamIndia1.add(new CricketPlayer(5, "Yuvraj", "India",  9000, 100, 130, 70, 50, 50.2f));
		

		ArrayList<CricketPlayer> teamIndia = new ArrayList<CricketPlayer>();
		teamIndia.add(new CricketPlayer(1, "Sachin", "India", 15000, 100, 200, 45, 40, 54.9f));
		teamIndia.add(new CricketPlayer(2, "Virat" , "India", 12000,  95, 190, 70, 35, 80.5f));
		teamIndia.add(new CricketPlayer(3, "Sehwag", "India", 10000, 100, 300, 50, 50, 60.8f));
		teamIndia.add(new CricketPlayer(4,"Dhoni"  , "India", 10000, 120, 150, 40, 40, 70.5f));
		teamIndia.add(new CricketPlayer(5, "Yuvraj", "India",  9000, 100, 130, 70, 50, 50.2f));
		
		
		Collections.sort(teamIndia,new CustomComparator());
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Printing teamIndia after sorting the ArrayList..................");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		
		for(Object i : teamIndia) {
			System.out.println(i);
		}
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Printing the TreeSet..................");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		
		for(Object i : teamIndia1) {
			System.out.println(i);
		}
		
	}

}

class CustomComparator implements Comparator<CricketPlayer>{

	@Override
	public int compare(CricketPlayer o1, CricketPlayer o2) {
		if(o1.totalRunsMadeTillNow>o2.totalRunsMadeTillNow) return 1;
		else if(o1.totalRunsMadeTillNow<o2.totalRunsMadeTillNow) return -1;
		return 0;
	}
	
}


class Player{
	
}

class CricketPlayer extends Player implements Comparable<CricketPlayer>{
	int rank;
	String name;
	String country;
	int totalRunsMadeTillNow;
	int totalSixersHit;
	int totalFoursRunsHit;
	int currentRun;
	int age;
	float strikeRate;
	@Override
	public String toString() {
		return "CricketPlayer [rank=" + rank + ", name=" + name + ", country=" + country + ", totalRunsMadeTillNow="
				+ totalRunsMadeTillNow + ", totalSixersHit=" + totalSixersHit + ", totalFoursRunsHit="
				+ totalFoursRunsHit + ", currentRun=" + currentRun + ", age=" + age + ", strikeRate=" + strikeRate
				+ "]";
	}
	public CricketPlayer(int rank, String name, String country, int totalRunsMadeTillNow, int totalSixersHit,
			int totalFoursRunsHit, int currentRun, int age, float strikeRate) {
		super();
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.totalRunsMadeTillNow = totalRunsMadeTillNow;
		this.totalSixersHit = totalSixersHit;
		this.totalFoursRunsHit = totalFoursRunsHit;
		this.currentRun = currentRun;
		this.age = age;
		this.strikeRate = strikeRate;
	}
	@Override
	public int compareTo(CricketPlayer o) {
		int x = Integer.compare(totalRunsMadeTillNow, o.totalRunsMadeTillNow);
		if(x==0) {
			return Integer.compare(totalFoursRunsHit, o.totalFoursRunsHit);
		}
		return x;
	}
}
