import java.util.Scanner;
class Redius{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("marathi marks: ");
int m = sc.nextInt();
System.out.println("hindi marks: ");
int h = sc.nextInt();
System.out.println("english marks: ");
int e = sc.nextInt();
System.out.println("sansktrit marks: ");
int s = sc.nextInt();
System.out.println("paali marks: ");
int p = sc.nextInt();
float t = m + h + e + s + p;
float percentage = (float)((t/500)*100);
System.out.println("TotalMarks = " +t);
System.out.println("percentage marks = " +percentage);

}
}