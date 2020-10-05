import java.util.Scanner;

class Person{
	private int age;
	private String name;
	void setData(int a, String n)
	{
		age = a;
		name = n;
	}
	void displayData()
	{
		System.out.println("Person Age : "+age);
		System.out.println("Person Name : "+name);
	}
}
class PersonDemo37{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Person Age : ");
		//int a = sc.nextInt();
		int a = 18;
		System.out.println("Age of Person is : ");
		System.out.println(a);
		System.out.println("Enter the Person Name : ");
		//sc.nextLine();
		String n = sc.nextLine();
		//String n = sc.next();
		
		Person p = new Person();
		p.setData(a, n);
		p.displayData();
	}
}