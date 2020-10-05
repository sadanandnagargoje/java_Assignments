import java.util.Scanner;
class ReadDays{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Read the days: ");
int td = sc.nextInt();
int year = td / 365;
int week = (td % 365) / 7;
int days = (td % 365) % 7;

System.out.println("years = " + year); 
System.out.println("weeks = " + week); 
System.out.println("days = " + days); 

}
}