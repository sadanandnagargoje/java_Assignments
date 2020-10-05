import java.util.Scanner;

class ArrayPr8{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
        String arr[] = new String[n];
		
		System.out.println("Enter the array elements:");
        
		for(int i=0; i<arr.length; i++)
        {
				arr[i] = sc.next();
        }
		
        System.out.println("===Array===");
		
        for (String ar : arr) 
		{
			System.out.print(ar+"	");
        }

	}
}
