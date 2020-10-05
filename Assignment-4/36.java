import java.util.Scanner;

class MathOp{ 
	private int m1;
	private float m2;
	private int m3;
	private double m4;
	
	void multiply(int n1, int n2)
	{
		//int m1;
		m1 = n1 * n2;
	}
		
	void multiply(float n1, float n2, float n3)
	{
		//float m2;
		m2 = n1 * n2 * n3;	
	}
		
	void multiply(int ar[])
	{
		//int m3 = 0;
		m3 = 1;
		for(int i = 0; i< ar.length; i++)
		{
			m3 = m3 * ar[i];
		}
	}
		
	void multiply(double n1, int n2)
	{
		//double m4;
		m4 = n1 * n2;
	}
	void result(){
		System.out.println("A. two integers multiplication = "+m1);
		System.out.println("B. three floats multiplication = "+m2);
		System.out.println("C. all elements of array multiplication = "+m3);
		System.out.println("D. one double and one integer multiplication = "+m4);
	}
}

class MathOperation36{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 2 integer type number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Enter the 3 float type number: ");
		float num3 = sc.nextFloat();
		float num4 = sc.nextFloat();
		float num5 = sc.nextFloat();
		
		System.out.println("Enter the size of integer array: ");
		int s = sc.nextInt();
		int arr[] = new int[s];
		System.out.println("Enter the "+s+" elements in array : ");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the 1 double type and 1 integer type number: ");
		double num6 = sc.nextDouble();
		int num7 = sc.nextInt();
		
		/*================================================*/
		MathOp m = new MathOp();
		m.multiply(num1, num2);
		m.multiply(num3, num4, num5);
		m.multiply(arr);
		m.multiply(num6, num7);
		m.result();
	}
}