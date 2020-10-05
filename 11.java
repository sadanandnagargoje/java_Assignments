class SwapNumbers {
  public static void main(String[] args) {
    int x = 5;
    int y = 7;

    System.out.println("value of x : " + x);
    System.out.println("value of y : " + y);

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("Value of x after swap : " + x);
    System.out.println("Value of y after swap :" + y);
  }
}
