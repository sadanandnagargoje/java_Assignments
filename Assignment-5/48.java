 import java.util.*;
 abstract  class Processor 

{
  
        double data ; 
      abstract void process();
      void display()
{
 
          System.out.print(data);

}

  }

       class Fact extends Processor
    
{

        void process ()
   {

       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of Fact = ");

        int number = scanner.nextInt();
 
            data = 1 ;

        for(int i = 1 ; i<=number ; i++)

  {

           data = data* i ;

   }

         System.out.print("Factotrial of number is = ");

   }

   }

         class Circle extends Processor 

{

      void process()
  {

           Scanner scanner = new Scanner(System.in);

           final  float PI = 3.14f;

           System.out.print("\n\nEnter the the radius of circle = ");

           double radius = scanner.nextDouble();

           data = PI * radius * radius ;

            System.out.print("Area of Circle  is = ");
         } 

}
    

        public class Assign48
{

      public static void main(String args[])
{

     Processor p1 = new Fact();

     p1.process();

 
      p1.display();

    Processor p2 = new Circle();

     p2.process();

   
     p2.display();

 }

 }
     


