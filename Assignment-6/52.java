import java.util.Scanner;
class VowelsCount{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name");
        String name=sc.next();
		int count=0;
		   for(int i=0;i<name.length();i++)
		   {

				if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
				{
					count++;
				}
			} 
       System.out.println("count of vowel is : "+count);
    }
}