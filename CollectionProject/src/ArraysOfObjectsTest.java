//public class ArraysOfObjectsTest {
//
//	public ArraysOfObjectsTest() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public static void main(String[] args) {
//		System.out.println("Begin of main");
//		CricketPlayer teamIndia[] = new CricketPlayer[11];
//		teamIndia[0] = new CricketPlayer(1, "Sachin", "India", 15000, 100, 200, 45, 40, 54.9f);
//		teamIndia[1] = new CricketPlayer(2, "Virat" , "India", 12000,  95, 190, 70, 35, 80.5f);
//		teamIndia[2] = new CricketPlayer(3, "Sehwag", "India", 10000, 100, 300, 50, 50, 60.8f);
//		teamIndia[3] = new CricketPlayer(4,"Dhoni"  , "India", 10000, 120, 150, 40, 40, 70.5f);
//		teamIndia[4] = new CricketPlayer(5, "Yuvraj", "India",  9000, 100, 130, 70, 50, 50.2f);
//		try {
//			for(int i=0;i<teamIndia.length;i++) {
//				if(teamIndia[i]==null) {
//					NullPointerException err = new NullPointerException("Object is a null pointer");
//					throw err;
//				}
//				System.out.println("---------------------------------------------------------------------------");
//				System.out.println(teamIndia[i]);
//				System.out.println("---------------------------------------------------------------------------");
//			}
//		}
//		catch(RuntimeException err) {
//			System.out.println("Err : " + err);
//		}
//		System.out.println("End of main");
//	}
//
//}
//
//class Player{
//	
//}
//
//class CricketPlayer extends Player{
//	int rank;
//	String name;
//	String country;
//	int totalRunsMadeTillNow;
//	int totalSixersHit;
//	int totalFoursRunsHit;
//	int currentRun;
//	int age;
//	float strikeRate;
//	@Override
//	public String toString() {
//		return "CricketPlayer [rank=" + rank + ", name=" + name + ", country=" + country + ", totalRunsMadeTillNow="
//				+ totalRunsMadeTillNow + ", totalSixersHit=" + totalSixersHit + ", totalFoursRunsHit="
//				+ totalFoursRunsHit + ", currentRun=" + currentRun + ", age=" + age + ", strikeRate=" + strikeRate
//				+ "]";
//	}
//	public CricketPlayer(int rank, String name, String country, int totalRunsMadeTillNow, int totalSixersHit,
//			int totalFoursRunsHit, int currentRun, int age, float strikeRate) {
//		super();
//		this.rank = rank;
//		this.name = name;
//		this.country = country;
//		this.totalRunsMadeTillNow = totalRunsMadeTillNow;
//		this.totalSixersHit = totalSixersHit;
//		this.totalFoursRunsHit = totalFoursRunsHit;
//		this.currentRun = currentRun;
//		this.age = age;
//		this.strikeRate = strikeRate;
//	}
//}
