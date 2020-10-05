import java.util.Scanner;

class ArrayPr10{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int ar[][] = new int[3][3];
		
		System.out.println("Enter the 2D array elements:" );
        
		for(int i=0; i<ar.length; i++)
        {
			System.out.println("Row "+i+" array elements:");
            for(int j=0; j<ar[i].length; j++)
			{
				ar[i][j] = sc.nextInt();
			}
        }
		
		int ld = 0, rd = 0;
		for(int i=0; i<ar.length; i++)
        {
            for(int j=0; j<ar.length; j++)
			{
				if(i == j)
				{
					ld = ld + (ar[i][j]);
					
							// ((3	- 1) - 0) (0) --> [2][0]
							// ((3	- 1) - 1) (1) --> [1][1]
							// ((3	- 1) - 2) (2) --> [0][2]
					rd = rd + (ar[(ar.length-1)-i][j]);
				}
			}
        }
		System.out.println("Sum of left diagonal "+ld);
		System.out.println("Sum of right diagonal "+rd);
		
		int sum = ld + rd;
		System.out.println("Sum of left diagonal "+ld+" and sum of right diagonal "+rd+" is "+sum);
	}
}