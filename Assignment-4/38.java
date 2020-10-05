import java.util.Scanner;

class Employee{
	private static int empNo = 100;
	private int salary;
	private static int totalSalary = 0;
	private static int count = 0;
	
	void Employee(int sal)
	{
		empNo++;
		salary = sal;
		count++;
	}
	
	void showData()
	{
		System.out.println("Employee ID : "+empNo);
		System.out.println("Employee Salary : "+salary);
	}
	
	void setTotal()
	{
		totalSalary = totalSalary + salary;
	}
	
	void showTotalSal(){
		System.out.println("Total Salary of "+count+" Employees is "+totalSalary);
	}
}

class EmployeeDemo38{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Employee : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			System.out.println("Enter the Employee "+i+" Salary : ");
			int sal = sc.nextInt();
			Employee e1 = new Employee();
			e1.Employee(sal);
			e1.showData();
			e1.setTotal();
			e1.showTotalSal();
		}
	}
}
