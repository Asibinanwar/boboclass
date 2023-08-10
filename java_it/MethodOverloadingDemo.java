class MethodOverloadingDem
{
	public static void main(String[] args)
	{
		int sum1 = Adder.add(1,1);
		int sum2 = Adder.add(2,2,2);
		int sum3 = Adder.add(3,3,3,3);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}