import java.util.Scanner;

class NumSeries{
	public static void main(String[] args)
	{
		int sum = 12;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int l = sc.nextInt();
		
		for(int i=1; i<=l; i++)
		{
			System.out.println(sum);
			sum = sum+10;
		}
	}
}

