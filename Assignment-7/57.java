import java.util.Scanner;

class ReverseEveryWord57{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		String ar[] = str.split(" ");
		for(int i=0; i<ar.length; i++){
			StringBuilder sbr = new StringBuilder(arr[i]);
			System.out.print(sbr.reverse()+" ");
		}
	}
}