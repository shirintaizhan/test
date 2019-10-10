public class Customer
{
	public static void main(String[] args)
	{
		Shop shop = new Shop("BMW", 32000D, 2015);
		System.out.println(shop.buyCar());
		// System.out.println(shop.car);
	}
}