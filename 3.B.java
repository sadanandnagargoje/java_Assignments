class Expr{
	public static void main(String args[])
	{
		int x = 1, y = 0;
		System.out.println("x = "+x+" y = "+y);
		y = x++ + ++x;
		System.out.println("x = "+x+" y = "+y);
	}
}