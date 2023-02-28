package inhertianceProject;

public class KiteTest {

	public KiteTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Kite k1 = new Kite("Blue", "Suvo", 40, true);
		Kite k2 = new Kite("Red", "ABC", 50, true);
		Kite k3 = new Kite("Green", "DEF", 60, true);
		
		System.out.println(Kite.getKiteCount());
		
		k1.initiateKiteFight(k3);
		
		System.out.println(Kite.getKiteCount());
		
		
	}
}

class Kite{
	private String kiteColor,kiteOwner;
	private int kiteLength;
	private boolean flying;
	private static int kiteCount;
	
	public Kite(String kiteColor, String kiteOwner, int kiteLength, boolean flying) {
		super();
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.kiteLength = kiteLength;
		this.flying = flying;
		kiteCount++;
	}

	public String getKiteColor() {
		return kiteColor;
	}

	public void setKiteColor(String kiteColor) {
		this.kiteColor = kiteColor;
	}

	public String getKiteOwner() {
		return kiteOwner;
	}

	public void setKiteOwner(String kiteOwner) {
		this.kiteOwner = kiteOwner;
	}

	public int getKiteLength() {
		return kiteLength;
	}

	public void setKiteLength(int kiteLength) {
		this.kiteLength = kiteLength;
	}

	public boolean isFlying() {
		return flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	
	public static int getKiteCount() {
		return kiteCount;
	}
	
	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", kiteOwner=" + kiteOwner + ", kiteLength=" + kiteLength + ", flying="
				+ flying + "]";
	}
	
	void initiateKiteFight(Kite enemy) {
		System.out.println("Fight initiated by " + kiteOwner + " against " + enemy.getKiteOwner());
		for(int i=0;i<5;i++) {
			System.out.println("Fighting....");
			double val = Math.random();
			if(val<=0.10) {
				System.out.println("Both kites are down....");
				flying = false;
				enemy.setFlying(false);
				kiteCount -= 2;
				break;
			}
			else if(val>0.10 && val<=0.20) {
				System.out.println(kiteOwner + " won the fight!!!!");
				kiteCount--;
				enemy.setFlying(false);
				break;
			}
			else if(val>0.20 && val<=0.30) {
				System.out.println(enemy.getKiteOwner() + " won the kite fight!!!!");
				kiteCount--;
				flying = false;
				break;
			}
		}
	}
	
}