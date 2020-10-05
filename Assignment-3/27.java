import java.util.Scanner;

class ArrayPr7{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		
        int ar[] = new int[n];
		
		System.out.println("Enter the array elements:");
        
		for(int i=0; i<ar.length; i++)
        {
				ar[i] = sc.nextInt();
        }
		
        System.out.println("===Array===");
		
        for (int arr : ar) 
		{
			System.out.print(arr+" ");
        }
		
		System.out.println("\n===Smallest and Greatest element in array===");
		int min = ar[0], max = ar[0];
		for(int i=0; i<ar.length; i++)
        {
			if(ar[i]>max)
			{
				max = ar[i];
			}
			if(ar[i]<min)
			{
				min = ar[i];
			}
		}	
		
		System.out.println("min = "+min+" max = "+max);
	}
}