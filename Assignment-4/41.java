import java.util.Scanner;

class PersonA
{
	private String name;
	private int age;
	
	PersonA()
	{
		System.out.println("Person Details :");
	}
	
	PersonA(String name, int age)
	{
		this();
		this.name = name;
		this.age = age;
	}
	
	void displayData()
	{
		System.out.println("Person Name :"+name);
		System.out.println("Person Age :"+age);
	}
}
class PersonB extends PersonA
{
	private int sal;
	PersonB(String name, int age, int sal)
	{
		super(name, age);
		this.sal = sal;
		
	}
	void displayData()
	{
		super.displayData();
		System.out.println("Person Name :"+sal);
	}
	
}

class ThisDemo41{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Name :");
		String n = sc.next();
		System.out.println("Enter Person Age :");
		int a = sc.nextInt();
		System.out.println("Enter Person Salary :");
		int s = sc.nextInt();
		
		PersonB obj = new PersonB(n, a, s);
		obj.displayData();
	}
}
