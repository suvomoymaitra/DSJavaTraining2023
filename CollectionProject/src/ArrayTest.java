
public class ArrayTest {

	public ArrayTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int teamIndia[] = new int[11];
		
		teamIndia[0] = 11;
		teamIndia[1] = 22;
		teamIndia[3] = 33;
		teamIndia[4] = 44;
		teamIndia[5] = 55;
		
		int totalScore = 0;
		
		for(int i=0;i<teamIndia.length;i++) {
			System.out.println("The score of batsmen " + (i+1) + " is : " + teamIndia[i]);
			totalScore += teamIndia[i];
		}
		
		System.out.println("The total score of team India is : " + totalScore);
		
		
		
	}

}


