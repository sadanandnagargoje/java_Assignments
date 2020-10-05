import java.util.Scanner;
class NumTable
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("emter the no. to print table: ");
		int num = sc.nextInt();
		int table;
		for (int i=1; i<=10; i++)
		{
			table = num*i;
			System.out.println(num+" * "+i+" = "+table);
		}
	}
}