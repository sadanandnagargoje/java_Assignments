import java.util.Scanner;

class ArrayPr4{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int s = sc.nextInt();

		int arr[] = new int[s];
		int i;

		System.out.println("Enter the elements: ");
		for(i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the element which you want to search : ");
		int e = sc.nextInt();

		for(i=0; i<arr.length; i++)
		{
			if(arr[i] == e)
			{
				System.out.println("Element you search for is "+e+" at intex "+i);
				break;
			}
		}
		if(i == s)
		{
			System.out.println("Element you search for is not found");
		}
	}
}
