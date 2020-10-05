import java.util.Scanner;

class ArrayPr9{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2D Array size:");
		System.out.println("No of Rows:");
		int r = sc.nextInt();
		System.out.println("No of Columns:");
		int c = sc.nextInt();
		
        int ar[][] = new int[r][c];
		
		System.out.println("Enter the 2D array elements:" );
        
		for(int i=0; i<ar.length; i++)
        {
			System.out.println("Row "+i+" array elements:");
            for(int j=0; j<ar[i].length; j++)
			{
				ar[i][j] = sc.nextInt();
			}
        }
		
		for(int i=0; i<ar.length; i++)
        {
			System.out.println("Size of "+i+" array is: "+(ar[i].length));
			System.out.println("array elements of "+i+" 1D array are:");
            for(int j=0; j<ar[i].length; j++)
			{
				System.out.print(" "+ar[i][j]+" ");
			}
			System.out.println("");
        }
		
	}
}
