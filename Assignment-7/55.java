import java.util.Scanner;

class WordsCount55{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine().toLowerCase();
		int c=1;
		for(int i=0; i<str.length(); i++){
			if(!((str.charAt(i)>='a') && (str.charAt(i)<='z')) )
			{
				c++;
			}
		}
		System.out.println("count of words is : "+c);
	}
}