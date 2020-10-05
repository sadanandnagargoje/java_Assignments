import java.util.Scanner;

class PrimeNumS{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two limits: ");
		int l = sc.nextInt();
		int u = sc.nextInt();
		int count;
		/* 4 5 7 10 */
		
		System.out.println("prime numbers between "+l+" & "+u+" :");
		for(int i=l; i <= u; i++)
		{
			count = 1;
			for(int j = 2; j <= i/2; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}				
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
}