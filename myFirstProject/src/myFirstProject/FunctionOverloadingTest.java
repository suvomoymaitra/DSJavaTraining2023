package myFirstProject;

public class FunctionOverloadingTest {
	
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		
		myPhone.dial();
		myPhone.dial("Ram");
		myPhone.dial(9999999999L);
		myPhone.dial((byte)120);
		myPhone.dial((byte)91,9999999999L);
		myPhone.dial(9999999999L,(byte)91);
	}

}


class Phone{
	void dial() {
		System.out.println("dial() nowhere....");
	}
	
	void dial(byte interCommNumber) {
		System.out.println("dial(byte) : dialing intercomm : " + interCommNumber);
	}
	
	void dial(String name) {
		System.out.println("dial(String) : dialing by name : " + name);
	}
	
	void dial(long mobileNumber) {
		System.out.println("dial(long) : dialing by mobile : " + mobileNumber);
	}
	
	void dial(byte countryCode, long mobileNumber) {
		System.out.println("dial(byte,long) : dialing by countryCode : " + countryCode + ", mobile number : " + mobileNumber);
	}
	
	void dial(long mobileNumber, byte countryCode) {
		System.out.println("dial(byte,long) : dialing by mobile number : " + mobileNumber + ", countryCode : " + countryCode);
	}
}