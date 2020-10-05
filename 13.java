import java.util.Scanner;
class greatestNum3{
public static void main (String args[]){

Scanner scan=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=scan.nextInt();

System.out.println("Enter the second number:");

int num2=scan.nextInt();
System.out.println("Enter the Third number:");

int num3=scan.nextInt();

findLargest(num1,num2,num3);

}
static void findLargest(int num1,int num2, int num3){//method definition
    if(num1<=num2){
    if(num1<=num3)
        System.out.println(num1+" is the smallest number");
        else
        System.out.println(num3+" is the smallest number");
    }
    else{
    
    if(num2<=num3)
        System.out.println(num2+" is the smallest number");
        
    else
        System.out.println(num3+" is the smallest number");
    }
    
}

}