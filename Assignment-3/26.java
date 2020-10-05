import java.util.Scanner;

class ArrayPr6{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int ar[][] = new int[5][];
		
		System.out.println("Enter the 2D array of 5 rows and 17 elements:");
        
		for(int i=0; i<ar.length; i++)
        {
			System.out.println("enter column for :"+i+" row");
			int col = sc.nextInt();
			ar[i] = new int[col];
			
            for(int j=0; j<ar[i].length; j++)
			{
				ar[i][j] = sc.nextInt();
			}
        }
        System.out.println("===========2D Array==========");
		
        for (int arr[] : ar) 
		{
			for(int a : arr)
			{
				System.out.print(a+" ");
			}
            System.out.println("");
        }
		
		System.out.println("=================Addition==================");
		int sum = 0;
		for (int arr[] : ar) 
		{
			for(int a : arr)
			{	
				sum = sum + a;	
			}
        }
		System.out.print("Sum of array is: "+sum);
	}
	}