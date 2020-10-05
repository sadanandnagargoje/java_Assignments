import java.util.Scanner;
class Circle{
	private int radius;
	private float area;
	
	Scanner sc = new Scanner(System.in);
	
	void init()
	{
		System.out.println("Enter the radius of circle :");
		radius = sc.nextInt();
	}
	void calculateArea()
	{
		area = (float)(3.14 * (radius * radius));
	}
	void display()
	{
		System.out.println("Radius of circle = "+radius+" Area of circle = "+area);
	}
}

public class CircleDemo{
	public static void main(String[] args)
	{
		Circle obj = new Circle();
		obj.init();
		obj.calculateArea();
		obj.display();
	}	
}