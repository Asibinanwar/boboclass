class OuterClass
{
	private int a,b,c;
	
	public OuterClass(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void printSum()
	{
		InnerClass  i = new InnerClass();
		System.out.println("sum = " + i.total());	
	}	
	
	class InnerClass
	{
		public int total()
		{
			return a + b + c;
		}
	}
}


class InnerClassDemo
{
	public static void main(String[] args)
	{
		OuterClass o = new OuterClass(10,20,30);
		o.printSum();		
	}
}