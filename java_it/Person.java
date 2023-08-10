class Person
{
	private String name;
	private int age;
	private char gender;

	public Person(String name, int age, char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void print()
	{
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
	}
}