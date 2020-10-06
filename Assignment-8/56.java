import java.util.Scanner;

class FirstChar56{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		
		String ar[] = str.split(" ");
		
		String res = "";

		for(String travs : ar) 
        {			
			String f = travs.substring(0,1);
			String m = travs.substring(1);
			res = res+f.toUpperCase()+m.toLowerCase()+" ";
	    }
		System.out.println(res);
	}
}