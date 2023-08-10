class Student extends Person
{
    private int mark1, mark2, mark3;
    
    public Student(String name, int age, char gender, int mark1, int mark2, int mark3)
    {
        super(name, age, gender);
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int total()
    {
        return mark1 + mark2 + mark3;
    }

    public void print()
    {
        super.print();
        System.out.println("mark1 = " + mark1);
        System.out.println("mark2 = " + mark2);
        System.out.println("mark3 = " + mark3);
        System.out.println("total = " + total());
    }
}