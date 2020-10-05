class Expr{
	public static void main(String args[])
	{
		int x=1,y=1,z=0;
		System.out.println("x = "+x+" y = "+y+" z = "+z);
		z = x++ - --y - --x  +  x++;
		System.out.println("x = "+x+" y = "+y+" z = "+z);
	}
}