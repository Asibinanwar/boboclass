class StudentDemo
{
    public static void main(String[] args)
    {
        Student[] s = new Student[5];

        s[0] = new Student("Akhil",20,'M',43,40,42);
        s[1] = new Student("Deepak",19,'M',36,41,39);
        s[2] = new Student("Fathima",20,'F',40,40,40);
        s[3] = new Student("Geethu",19,'F',45,46,46);
        s[4] = new Student("Hari",19,'M',41,42,43);

        for(int i=0;i<s.length;i++)
        {
            s[i].print();
            System.out.println("");
        }
    }
}
