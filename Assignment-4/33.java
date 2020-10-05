import java.util.Scanner;
class Student{
	private int rno;
	private String name;
	
	void setData(int rno, String name)
	{
		this.rno = rno;
		this.name = name;
	}
	void showData()
	{
		System.out.println("Student Roll No = "+rno+" Name = "+name);
	}
}

public class StudentDemoThis{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Roll No and Name :");
		int roll = sc.nextInt();
		String nm = sc.next();
		
		Student obj = new Student();
		obj.setData(roll, nm);
		obj.showData();
		
	}	
}
