package inhertianceProject;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HeadphoneTest {

	public HeadphoneTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
//		BluetoothCard card = new BluetoothCard(20, "MJ08489", "FF25EA");
//		Battery battery = new Battery(2000, 50, LocalDate.of(2021, 3, 31));
//		WirelessEarAccessories wirelessHeadphone = new WirelessEarAccessories("987456321", "Boat", LocalDate.of(2021, 5, 30), 2000, 80, 50, "Type C", card,battery);
//		System.out.println(wirelessHeadphone);
//		System.out.println(wirelessHeadphone.hashCode());
//		System.out.println("Days from production : " + wirelessHeadphone.findAge(LocalDate.now()));
		Curd curd = new Curd("Cow", "Sour", "Thick", "White", 250);
		System.out.println(curd);
		
		Curd anotherCurd = curd;
		
		System.out.println(anotherCurd);
		
		System.out.println("---------------------------------------------");
		
		
		curd.setQuantity(300);
		
		System.out.println(curd);
		System.out.println(anotherCurd);
		
	}

}

class BluetoothCard{
	float range;
	String lastConnectedDeviceMacAddress;
	String macAddress;
	public BluetoothCard(float range, String lastConnectedDeviceMacAddress, String macAddress) {
		super();
		this.range = range;
		this.lastConnectedDeviceMacAddress = lastConnectedDeviceMacAddress;
		this.macAddress = macAddress;
	}
	@Override
	public String toString() {
		return "BluetoothCard [range=" + range + ", lastConnectedDeviceMacAddress=" + lastConnectedDeviceMacAddress
				+ ", macAddress=" + macAddress + "]";
	}
}

class Wire{
	float length;
	float radius;
	public Wire(float length, float radius) {
		super();
		this.length = length;
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Wire [length=" + length + ", radius=" + radius + "]";
	}
}

class Battery{
	int capacity;
	int currBattery;
	LocalDate dateOfM;
	public Battery(int capacity, int currBattery, LocalDate dateOfM) {
		super();
		this.capacity = capacity;
		this.currBattery = currBattery;
		this.dateOfM = dateOfM;
	}
	@Override
	public String toString() {
		return "Battery [capacity=" + capacity + ", currBattery=" + currBattery + ", dateOfM=" + dateOfM + "]";
	}
	
}

class Mic{
	int latency;
	float minReadableFrequency;
	float maxReadableFrequency;
	public Mic(int latency, float minReadableFrequency, float maxReadableFrequency) {
		super();
		this.latency = latency;
		this.minReadableFrequency = minReadableFrequency;
		this.maxReadableFrequency = maxReadableFrequency;
	}
	@Override
	public String toString() {
		return "Mic [latency=" + latency + ", minReadableFrequency=" + minReadableFrequency + ", maxReadableFrequency="
				+ maxReadableFrequency + "]";
	}
	
	
	
}

class Buttons{
	int numberOfButtons;
	boolean muteMicButton;
	boolean volumeButton;
	boolean playPauseButton;
	public Buttons(int numberOfButtons, boolean muteMicButton, boolean volumeButton, boolean playPauseButton) {
		super();
		this.numberOfButtons = numberOfButtons;
		this.muteMicButton = muteMicButton;
		this.volumeButton = volumeButton;
		this.playPauseButton = playPauseButton;
	}
	@Override
	public String toString() {
		return "Buttons [numberOfButtons=" + numberOfButtons + ", muteMicButton=" + muteMicButton + ", volumeButton="
				+ volumeButton + ", playPauseButton=" + playPauseButton + "]";
	}
	
	
}

class EarAccesories{
	String serialNumber;
	String brandName;
	LocalDate dateOfM;
	float cost;
	float maxDB;
	public EarAccesories(String serialNumber, String brandName, LocalDate dateOfM, float cost, float maxDB) {
		super();
		this.serialNumber = serialNumber;
		this.brandName = brandName;
		this.dateOfM = dateOfM;
		this.cost = cost;
		this.maxDB = maxDB;
	}
	@Override
	public String toString() {
		return "EarAccesories [serialNumber=" + serialNumber + ", brandName=" + brandName + ", dateOfM=" + dateOfM
				+ ", cost=" + cost + ", maxDB=" + maxDB + "]";
	}
	
	
	
}

class WiredEarAccessories extends EarAccesories{
	String cableType;
	String jackType;
	Wire wire;
	Buttons buttons;
	public WiredEarAccessories(String serialNumber, String brandName, LocalDate dateOfM, float cost, float maxDB,
			String cableType, String jackType, Wire wire, Buttons buttons) {
		super(serialNumber, brandName, dateOfM, cost, maxDB);
		this.cableType = cableType;
		this.jackType = jackType;
		this.wire = wire;
		this.buttons = buttons;
	}
	@Override
	public String toString() {
		return "WiredEarAccessories [toString()=" + super.toString() + ", cableType=" + cableType + ", jackType="
				+ jackType + ", wire=" + wire + ", buttons=" + buttons + "]";
	}
	
}

class WirelessEarAccessories extends EarAccesories{
	int currVolume;
	String typeOfChargingCable;
	BluetoothCard bluetoothcard;
	Battery battery;
	public WirelessEarAccessories(String serialNumber, String brandName, LocalDate dateOfM, float cost, float maxDB,
			int currVolume, String typeOfChargingCable, BluetoothCard bluetoothcard, Battery battery) {
		super(serialNumber, brandName, dateOfM, cost, maxDB);
		this.currVolume = currVolume;
		this.typeOfChargingCable = typeOfChargingCable;
		this.bluetoothcard = bluetoothcard;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "WirelessEarAccessories [toString()=" + super.toString() + ", currVolume=" + currVolume
				+ ", typeOfChargingCable=" + typeOfChargingCable + ", bluetoothcard=" + bluetoothcard + ", battery=" + battery + "]";
	}
	
	boolean increaseVolume() {
		if(currVolume==100) return false;
		currVolume++;
		return true;
	}
	
	boolean decreaseVolume() {
		if(currVolume==0) return false;
		currVolume--;
		return true;
	}
	
	void displayVolume() {
		System.out.println("Current volume : " + currVolume);
	}
	
	 void changeCost(float x) {
		 super.cost = x;
		 System.out.println("Price changed to : " + cost);
	 }
	 
	 long findAge(LocalDate today) {
		 long age = super.dateOfM.until(today,ChronoUnit.DAYS);
		 return age;
	 }
	 
}



//class Curd{
//	String type;
//	int quantity;
//	String density;
//	String color;
//	String taste;
//	public Curd(String type, int quantity, String density, String color, String taste) {
//		super();
//		this.type = type;
//		this.quantity = quantity;
//		this.density = density;
//		this.color = color;
//		this.taste = taste;
//	}
//	@Override
//	public String toString() {
//		return "Curd [type=" + type + ", quantity=" + quantity + ", density=" + density + ", color=" + color
//				+ ", taste=" + taste + "]";
//	}
//	/**
//	 * @return the type
//	 */
//	public String getType() {
//		return type;
//	}
//	/**
//	 * @param type the type to set
//	 */
//	public void setType(String type) {
//		this.type = type;
//	}
//	/**
//	 * @return the quantity
//	 */
//	public int getQuantity() {
//		return quantity;
//	}
//	/**
//	 * @param quantity the quantity to set
//	 */
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	/**
//	 * @return the density
//	 */
//	public String getDensity() {
//		return density;
//	}
//	/**
//	 * @param density the density to set
//	 */
//	public void setDensity(String density) {
//		this.density = density;
//	}
//	/**
//	 * @return the color
//	 */
//	public String getColor() {
//		return color;
//	}
//	/**
//	 * @param color the color to set
//	 */
//	public void setColor(String color) {
//		this.color = color;
//	}
//	/**
//	 * @return the taste
//	 */
//	public String getTaste() {
//		return taste;
//	}
//	/**
//	 * @param taste the taste to set
//	 */
//	public void setTaste(String taste) {
//		this.taste = taste;
//	}
//	
//	
//	
//}

//class WirelessHeadphone extends WirelessEarAccessories{
//	
//}
//
//class WiredHeadphones extends WiredEarAccessories{
//	
//}

