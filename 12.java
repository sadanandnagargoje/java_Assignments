import java.util.Scanner;

class Gsal{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float bsal, da, hra, gs;
		
		System.out.println("Enter The Basic Salary: ");
		bsal = sc.nextFloat();
		
		if(bsal < 10000)
		{
			da = bsal * 10 / 100;
			hra = bsal * 90 / 100;
			gs = bsal + da + hra;
			System.out.println("Basic sal is "+bsal+" HRA is "+hra+" DA is "+da+" Gross Salary is "+gs);
		}
		else if(bsal >= 10000)
		{
			da = bsal * 98 / 100;
			hra = 2000;
			gs = bsal + da + hra;
			System.out.println("Basic sal is "+bsal+" HRA is "+hra+" DA is "+da+" Gross Salary is "+gs);
		}
	}
}
