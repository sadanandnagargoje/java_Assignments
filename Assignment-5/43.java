class OneBhk
{

     int roomArea ;
      int hallArea ;
      static int price;

     OneBhk()
{

        this.roomArea = 12;
        this.hallArea = 12;

        this.price = 200;

 }

    OneBhk(int roomArea,int hallArea,int price)

{

        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price ; 

 }

    void show()
{
   System.out.println("roomArea = "+roomArea);
   System.out.println("HallArea = "+hallArea);
   System.out.println("Price = "+price);

}
   
  }

   class TwoBhk  extends OneBhk
{

      int room2Area;
     static int totalflat = 0;

      
     TwoBhk()
{

        this.roomArea = 12;
        this.hallArea = 12;
        this.price = 200;
        this.room2Area = 34;

 }

   TwoBhk(int roomArea,int hallArea,int price,int room2Area)

{

        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price ; 
        this.room2Area = room2Area;
        totalflat = totalflat+price;

 }

     void show()
 {
   System.out.println("roomArea = "+roomArea);
   System.out.println("HallArea = "+hallArea);
   System.out.println("Price = "+price);
   System.out.println("room2Area = "+room2Area);

  }

      void totalflat1()
{
           totalflat =  totalflat +price ;
        System.out.println(totalflat);
}

}

   public class Assign43
{

  public static void main(String args[])
{
    System.out.println("\nFlat no = 1");
     TwoBhk b1 = new TwoBhk(12,21,30,20);
     b1.show();

       System.out.println("\nFlat no = 2");
       TwoBhk b2 = new TwoBhk(13,22,40,30);  
       b2.show();

      System.out.println("\nFlat no = 3");
     TwoBhk b3 = new TwoBhk(14,23,50,40);  
    b3.show();

   System.out.print("\nTotal amount of  3 flats  = ");
    b3. totalflat1();

}

}
   