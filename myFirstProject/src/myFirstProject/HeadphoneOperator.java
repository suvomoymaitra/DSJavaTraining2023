package myFirstProject;

public class HeadphoneOperator {

	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		Headphone h = new Headphone("Boat", "Black", 1000);

		h.increaseVolume();
		h.increaseVolume();
		h.displayVolume();

		h.chargeBattery();
		h.displayBatteryPercentage();

		// it will charge up to 100 then it will not charge anymore
		for (int i = 0; i < 55; i++) {
			h.chargeBattery();
		}

		h.displayBatteryPercentage();

		for (int i = 0; i < 101; i++) {
			h.dischargeBattery();
		}

		// it will not be able to operate as the battery percentage will be 0
		h.increaseVolume();
		h.increaseVolume();

		System.out.println(h);
		
	}

}

class Headphone {
	float price;
	String brand, color;
	int currVolume, batteryPercentage;

	public Headphone() {
		super();
		this.price = 0;
		this.brand = "Dummy brand";
		this.color = "Dummy color";
		this.batteryPercentage = 0;
		this.currVolume = 0;
	}

	public Headphone(String b, String c, float p) {
		super();
		this.price = p;
		this.brand = b;
		this.color = c;
		this.batteryPercentage = 50;
		this.currVolume = 50;
	}
	
	public Headphone(float price, String brand, String color, int currVolume, int batteryPercentage) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.currVolume = currVolume;
		this.batteryPercentage = batteryPercentage;
	}

	void increaseVolume() {
		if (batteryPercentage == 0) {
			System.out.println("Battery discharged please charge the device");
			return;
		}
		if (currVolume == 100) {
			System.out.println("The volume is maximum");
			return;
		}
		currVolume++;
		System.out.println("Volume increased, current volume : " + currVolume);
	}

	void decreaseVolume() {
		if (batteryPercentage == 0) {
			System.out.println("Battery discharged please charge the device");
			return;
		}
		if (currVolume == 0) {
			System.out.println("The volume is minimum");
			return;
		}
		currVolume--;
		System.out.println("Volume decreased, current volume : " + currVolume);
	}

	void displayVolume() {
		if (batteryPercentage == 0) {
			System.out.println("Battery discharged please charge the device");
			return;
		}
		System.out.println("Current volume : " + currVolume);
	}

	void chargeBattery() {
		if (batteryPercentage == 100) {
			System.out.println("Battery charged fully");
			return;
		}
		batteryPercentage++;
		System.out.println("Battery percentage increased by one");
	}

	void dischargeBattery() {
		if (batteryPercentage == 0) {
			System.out.println("Battery discharged please charge the device");
			return;
		}
		batteryPercentage--;
	}

	void displayBatteryPercentage() {
		if (batteryPercentage == 0) {
			System.out.println("Battery discharged please charge the device");
			return;
		}
		System.out.println("Current battery percentage: " + batteryPercentage);
	}

	void searchNearbyDevice() {
		if (batteryPercentage == 0) {
			System.out.println("Battery discharged please charge the device");
			return;
		}
		System.out.println("Finding devices nearby....");
	}

	@Override
	public String toString() {
		return "Headphone [price=" + price + ", brand=" + brand + ", color=" + color + ", currVolume=" + currVolume
				+ ", batteryPercentage=" + batteryPercentage + "]";
	}
}