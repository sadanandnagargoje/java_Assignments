import java.util.Scanner;

class ArrayPr1{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		float sum = 0, avg;
		
		System.out.println("Enter the 10 elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int a : arr)
		{
			sum = sum + a;
		}
		
		avg = sum / 10;
		System.out.println("Average of 10 elements is "+avg);
	}
}