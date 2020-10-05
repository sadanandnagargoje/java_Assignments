import java.util.Scanner;

class Tile
{
	private float tlength;
	private float twidth;
	
	Tile(float tlength, float twidth)
	{
		this.tlength = tlength;
		this.twidth = twidth;
	}
	
	float tArea, fArea;
	float tTotal;
	void totalTiles(float flength, float fwidth)
	{	
		tArea = tlength * twidth;
		fArea = flength * fwidth;
		
		tTotal = fArea / tArea;
	}
	
	void show()
	{
		System.out.println("Tile Area :"+tArea);
		
		System.out.println("Floor Area :"+fArea);
		
		System.out.println("Total Tiles :"+tTotal);
	}
	
}


class Floor42{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Floor Lenght :");
		float fl = sc.nextFloat();
		System.out.println("Enter Floor Width :");
		float fw = sc.nextFloat();

		System.out.println("Enter Tile Lenght :");
		float tl = sc.nextFloat();
		System.out.println("Enter Tile Width :");
		float tw = sc.nextFloat();
		
		Tile t = new Tile(tl, tw);
		t.totalTiles(fl, fw);
		
		System.out.println("Floor Lenght :"+fl);
		System.out.println("Floor Width :"+fw);
		System.out.println("Tile Lenght :"+tl);
		System.out.println("Tile Width :"+tw);
		
		t.show();
	}
}

