import java.util.Scanner;
 
class Get
{
    public static void main(String args[])  
    {   
        
        Scanner SC = new Scanner(System.in);
         
         
        System.out.print("Enter Gender (M/F): ");
        String ch = SC.next();
 
        System.out.print("Enter age: ");
       int age = SC.nextInt();
 
        System.out.println("Gender: " + ch);
        System.out.println("Age: " + age);
        
    }
}