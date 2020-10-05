import java.util.*;

  interface Taxable

{

     double salesTax = 7;         //by default final static public
     double incomeTax = 10.5;  //by default final static public

      void calTax();         //by default public abstract

  }


   class Employee implements Taxable

{

         int empid;

        String name;

       double salary;

     Employee(int empid , String name , double salary)
{
   
       this.empid = empid;
       this.name = name;
       this.salary = salary;

 
}

       public void calTax()
  {

        double yearlySal = salary *12;

        double totalamount = yearlySal * (10.5/100);

        System.out.println("incomeTax on yearly salary = "+totalamount);

}

 }

   public class Assign49
{

  public static void main(String args[])

{

          Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the id of employee = ");

         int id = scanner.nextInt();

        
         System.out.print("Enter the Name of employee = ");

         String name = scanner.next();

        
         System.out.print("Enter the salary of employee = ");

         double salary = scanner.nextDouble();

           
           Taxable t1 = new Employee(id,name,salary);

            t1.calTax();


}

}


