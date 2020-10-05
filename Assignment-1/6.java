import java.util.Scanner;
class Redius{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter redius: ");
float r = sc.nextInt();
float f = (3.14*r*r);
float f1 = (2*3.14*r);
System.out.println("Area: " +f);
System.out.println("Circumference: " +f1);

}
}