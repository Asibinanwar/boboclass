class PolymorphismDemo
{
	public static void main(String[] args)
	{
		Shape[] s = new Shape[5];

		s[0]= new Rectangle(1,1);
		s[1] = new Circle(1);
		s[2] = new Circle(2);
		s[3] = new Rectangle(1,2);
		s[4] = new Rectangle(2,2);		

		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].area());
		}
	}
}