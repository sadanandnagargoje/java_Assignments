import java.util.Scanner;

class Product{
	private int pid;
	private int price;
	private int quantity;
	
	void Product(int pid, int price, int quantity)
	{ 
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	static void HighPrice(Product[] ar)
	{
		Product max = ar[0];
		for(int i = 0; i<ar.length; i++)
		{
			if(ar[i].price > max.price)
			{
				max = ar[i];
			}
		}
		System.out.println("Product ID : "+max.pid+" Highest Product Price : "+max.price);
	}
	
	static void TotalAmount(Product[] p)
	{
		int amount = 0;
		for(int i = 0; i<p.length; i++)
		{
			amount = amount + (p[i].price*p[i].quantity);
		}
		System.out.println("Total Product Amount : "+amount);
	}
	
	void show()
	{
		System.out.println("Product ID : "+pid);
		System.out.println("Product Price : "+price);
		System.out.println("Product Quantity : "+quantity);
	}
}

class ProductDemo39{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Product pd[] = new Product[5];
		
		for(int i = 0; i<pd.length; i++)
		{
			System.out.println("Enter Product ID : ");
			int pi = sc.nextInt();
			System.out.println("Enter Product Price : ");
			int pr = sc.nextInt();
			System.out.println("Enter Product Quantity : ");
			int qnt = sc.nextInt();
			
			Product op = new Product();
			op.Product(pi, pr, qnt);
			pd[i] = op;
		}
		
		for(Product ar : pd)
		{
			ar.show();
		}
		
		Product.HighPrice(pd);
		Product.TotalAmount(pd);
	}
}

