import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		HashSet<Integer> numberSet = new HashSet<Integer>();
		
		numberSet.add(50);
		numberSet.add(60);
		numberSet.add(40);
		numberSet.add(20);
		numberSet.add(50);
		
		System.out.println(numberSet);
		
		for (Object object : numberSet) {
			System.out.println(object + "");
		}
		
		
		TreeSet<String> chemicalSet = new TreeSet<String>();
		chemicalSet.add("Oxygen");
		chemicalSet.add("Hydrogen");
		chemicalSet.add("Helium");
		chemicalSet.add("Bromine");
		chemicalSet.add("Carbon dioxide");
		
		System.out.println(chemicalSet);
		
		for (Object object : chemicalSet) {
			System.out.println(object + "");
		}
		
//		TreeSet players = new TreeSet();
//		players.add(new CricketPlayer(1, "Sachin", "India", 15000, 100, 200, 45, 40, 54.9f));
//		players.add(new CricketPlayer(2, "Virat" , "India", 12000,  95, 190, 70, 35, 80.5f));
//		players.add(new CricketPlayer(3, "Sehwag", "India", 10000, 100, 300, 50, 50, 60.8f));
//		players.add(new CricketPlayer(4,"Dhoni"  , "India", 10000, 120, 150, 40, 40, 70.5f));
//		players.add(new CricketPlayer(5, "Yuvraj", "India",  9000, 100, 130, 70, 50, 50.2f));
//		
//		System.out.println(players);
//		
//		for (Object object : players) {
//			System.out.println(object + "");
//		}
	}
}
