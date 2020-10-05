import java.util.Scanner;
class Interest{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("principle amount: ");
float p = sc.nextInt();
System.out.println("rate of interest: ");
float r = sc.nextInt();
System.out.println("time: ");
float t = sc.nextInt();
float si = ((p*r*t)/100);
System.out.println("simple interest = " +si);

}
}