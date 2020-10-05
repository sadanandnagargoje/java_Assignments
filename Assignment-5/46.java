class  sampleA

{

     void show()
{

    System.out.println("I am in super class");


}

     }

    class sampleB extends sampleA

{

      void show()

{

     System.out.println("I am in sub class");

}

 }

       public class Assign46
{

       public static void main(String args[])
{

         sampleA  a1 = new sampleB();


          if(a1 instanceof sampleB)
{
           sampleB b1 = (sampleB)a1;
          
             a1.show();

           String a = "samrat" ;
          String b = "samrat";

        if(a==b)

{
      System.out.println("true");
}
  else
{
        System.out.println("false");
}

       System.out.println(a);
}
}

 }


