import java.util.Scanner;

class WeekDays58{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String[] wd= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		try {
			System.out.print("Enter position 0 to 6: ");
			int pos=sc.nextInt();
			
			System.out.println(wd[pos]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("position is out of range");
			System.out.println(ex);
		}
	}
}
