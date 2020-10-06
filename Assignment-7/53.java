import java.util.Scanner;

class SplitCount53{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number in format: ");
		String str = sc.nextLine();
		String ar[] = str.split(",");

		int sum=0;
		for(String a: ar){
			sum = sum + Integer.parseInt(a);
		}
		System.out.println("Sum is: "+sum);

	}
}