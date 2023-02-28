package inhertianceProject;

public class SingleLevelInheritanceTest {
	
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("---------------------------");
		Student s = new Student();
		System.out.println("---------------------------");
		Employee e = new Employee();
	}
}


class Person{
	Person(){
		System.out.println("Person constructor called ....");
	}
}

class Student extends Person{
	Student(){
		super();
		System.out.println("Student constructor called ....");
	}
}

class Employee extends Student{
	Employee(){
		super();
		System.out.println("Employee constructor called ....");
	}
}