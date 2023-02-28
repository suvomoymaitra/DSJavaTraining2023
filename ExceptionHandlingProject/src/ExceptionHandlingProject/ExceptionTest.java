package ExceptionHandlingProject;

public class ExceptionTest {

	public ExceptionTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		calc.divide1("3", "2a");
		
		
		System.out.println("Begin of main");
		
		String name = "Hello!!!! Suvomoy here!!!!";
		
		try {
			int n = 2;
			int arr[] = new int[n];
			arr[0] = 34;
			arr[1] = 23;
			System.out.println("Name                 : " + name);
			System.out.println("Upper case name      : " + name.toUpperCase());
			System.out.println("Lower case name      : " + name.toLowerCase());
			System.out.println("Name at              : " + name.charAt(10));
			System.out.println("Name sub string      : " + name.substring(10,17));
		}
		catch(java.lang.IndexOutOfBoundsException err) {
			System.out.println("Err : " + err);
		}
		catch(java.lang.NullPointerException err) {
			System.out.println("Err : " + err);
		}
		
		
		
		System.out.println("End of main");
		
	}
}

class Calculator{
	void divide1(String num1,String num2) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			System.out.println("Dividing " + num1 + " by " + num2);
			int div = n1/n2;
			System.out.println("The result of the division is : " + div);
		}
		catch(java.lang.ArithmeticException err) {
			System.out.println("Cannot divide by zero");
			System.out.println("The error generated : " + err);
		}
		catch(java.lang.NumberFormatException err) {
			System.out.println("Cannot do operations on alpha numeric values");
			System.out.println("The error generated : " + err);
		}
		
	}
}
