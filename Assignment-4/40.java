import java.util.Scanner;

class Student{
	private String name;
	private int rollno;
	private int age;
	private int score;
	
	Student(String name, int rollno, int age, int score)
	{
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}

	static void studentScore(Student st[])
	{
		System.out.println("Student Score between 0 to 50 :");
		for(int i = 0; i<st.length; i++)
		{
			if(st[i].score >= 0 && st[i].score < 50)
			{
				//System.out.println(Student "+st[i].name+" Roll No "+st[i].rollno+" Score is "+st[i].score);
				st[i].showData();
			}
		}
		
		System.out.println("Student Score between 50 to 65 :");
		for(int i = 0; i<st.length; i++)
		{
			if(st[i].score >= 50 && st[i].score < 65)
			{
				//System.out.println(Student "+st[i].name+" Roll No "+st[i].rollno+" Score is "+st[i].score);
				st[i].showData();
			}
		}
		
		System.out.println("Student Score between 65 to 80 :");
		for(int i = 0; i<st.length; i++)
		{
			if(st[i].score >= 65 && st[i].score < 80)
			{
				//System.out.println("Student "+st[i].name+" Roll No "+st[i].rollno+" Score is "+st[i].score);
				st[i].showData();
			}
		}
		
		System.out.println("Student Score between 80 to 100 :");
		for(int i = 0; i<st.length; i++)
		{
			if(st[i].score >= 80 && st[i].score <= 100)
			{
				//System.out.println("Student "+st[i].name+" Roll No "+st[i].rollno+" Score is "+st[i].score);
				st[i].showData();
			}
		}
	}
	
	void showData()
	{
		System.out.println("Student Name :"+name);
		System.out.println("Student Roll No :"+rollno);
		System.out.println("Student Age :"+age);
		System.out.println("Student Score :"+score);
	}
}

class StudentDemo40{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Student[] s = new Student[4];
		System.out.println("Enter "+s.length+" Student Data :");
		for(int i = 0; i<s.length; i++)
		{
			System.out.println("Enter Student Name :");
			String n = sc.next();
			System.out.println("Enter Student Roll No :");
			int rn = sc.nextInt();
			System.out.println("Enter Student Age :");
			int ag = sc.nextInt();
			System.out.println("Enter Student Score :");
			int sr = sc.nextInt();
			
			Student std = new Student(n, rn, ag, sr);
			//std.Student(n, rn, ag, sr);
			s[i] = std;
		}
		/*
		for(Student ar : s)
		{
			ar.showData();
		}
		*/
		Student.studentScore(s);
		
	}
}
