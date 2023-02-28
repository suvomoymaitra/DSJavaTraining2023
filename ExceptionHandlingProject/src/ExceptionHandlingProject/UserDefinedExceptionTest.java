package ExceptionHandlingProject;

public class UserDefinedExceptionTest {

	public static void main(String[] args) {
		System.out.println("End of main");
		int randomCharge = (int)(Math.random()*100);
		int randomConnected = (int)(Math.random()*100);
		boolean val = false;
		if(randomConnected>50) val = true;
		System.out.println("Charge    : " + randomCharge);
		System.out.println("Connected : " + val);
		
		WirelessHeadphone headphone = new WirelessHeadphone(randomCharge, 50, "Boat", 1000f, val);
		try {
			headphone.playMusic();
		}
		catch(NoChargeException err) {
			System.out.println("Err : " + err);
		}
		catch(DeviceNotConnectedException err) {
			System.out.println("Err : " + err);
		}
		catch(DeviceDisconnectedException err) { 
			System.out.println("Err : " + err);
		}
		catch(BatteryDrainedCompletely err) { 
			System.out.println("Err : " + err);
		}
		
		System.out.println("End of main");
	}
}

class NoChargeException extends Exception{

	public NoChargeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class DeviceNotConnectedException extends RuntimeException{

	public DeviceNotConnectedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class DeviceDisconnectedException extends RuntimeException{

	public DeviceDisconnectedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class BatteryDrainedCompletely extends RuntimeException{

	public BatteryDrainedCompletely(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class WirelessHeadphone{
	int currCharge;
	int currVolume;
	String brand;
	float price;
	boolean connected;
	public WirelessHeadphone(int currCharge, int currVolume, String brand, float price, boolean connected) {
		super();
		this.currCharge = currCharge;
		this.currVolume = currVolume;
		this.brand = brand;
		this.price = price;
		this.connected = connected;
	}
	
	void playMusic() throws NoChargeException{
		System.out.println("Checking for charge");
		if(currCharge==0) {
			NoChargeException rte = new NoChargeException("Please charge the device....");
			throw rte;
		}
		System.out.println("Checking if the device is connected....");
		if(connected==false) {
			DeviceNotConnectedException rte = new DeviceNotConnectedException("Please connect the device....");
			throw rte;
		}
		
		double val = Math.random();
		
		for(int i=0;i<30;i++) {
			System.out.println("Listening to music....");
			if(currCharge<=0) {
				BatteryDrainedCompletely rte = new BatteryDrainedCompletely("Battery drained please charge the device");
				throw rte;
			}
			if(val<0.30) {
				DeviceDisconnectedException rte = new DeviceDisconnectedException("Device suddenly disconnected please reconnect....");
				throw rte;
			}
			currCharge--;
		}
		
	}
	
}
