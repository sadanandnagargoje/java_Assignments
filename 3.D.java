class Expr{
	public static void main(String args[])
	{
		boolean x = true,y = false;
		System.out.println("x = "+x+" y = "+y);
		boolean z = (x && y || !(x || y));
		System.out.println("z = "+z);
	}
}
