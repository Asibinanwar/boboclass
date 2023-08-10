class OuterClass
{
	private int n,r;
	
	public OuterClass(int n, int r)
	{
		this.n = n;
		this.r = r;		
	}
	
	public int compute()
	{
		NestedClass  nc = new NestedClass();
		
		return nc.fact(n) / ( nc.fact(r) * nc.fact(n-r) );
		
	}	
	
	static class NestedClass
	{
		public int fact(int x)
		{
			int f=1;
			for(int i=1;i<=x;i++)
				f = f * i;
			return f;
		}
	}
}


class NestedClassDemo
{
	public static void main(String[] args)
	{
		OuterClass o = new OuterClass(5,2);
		System.out.println("ncr = " + o.compute());		
	}
}