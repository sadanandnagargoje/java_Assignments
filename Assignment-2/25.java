import java.util.Scanner;

class ArrayPr5{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int s = sc.nextInt();

		int arr[] = new int[s];
		int even=0, odd=0;

		System.out.println("Enter the elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				even = even + arr[i];
			}
			else
			{
				odd = odd + arr[i];
			}
		}
		System.out.println("Even elements sum : "+even);
		System.out.println("Odd elements sum : "+odd);

	}
}