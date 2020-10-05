import java.util.Scanner;
class MathOperation{
	
	static int add(int n1, int n2)
	{
		int sum;
		sum = n1 + n2;
		return sum;
	}
	
	static int subtract(int n1, int n2)
	{
		int subtract;
		subtract = n1 - n2;
		return subtract;
	}
	
	static int multiply(int n1, int n2)
	{
		int multiply;
		multiply = n1 * n2;
		return multiply;
	}
	
	static int power(int n1, int n2)
	{
		int power = 1;
		for(int i = 1; i<=n2; i++)
		{
			power = power * n1;
		}
		return power;
	}

}

public class MathOptn{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		MathOperation obj = new MathOperation();
		System.out.println("add = :"+obj.add(n1, n2));
		System.out.println("subtract = :"+obj.subtract(n1, n2));
		System.out.println("multiply = :"+obj.multiply(n1, n2));
		System.out.println("power = :"+obj.power(n1, n2));
		
		
	}	
}
