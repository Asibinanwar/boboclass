class ConstructorOverloadingDemo
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10,20);

		System.out.println(r1.area());
		System.out.println(r2.area());
	}		
}