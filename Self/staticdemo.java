public class staticdemo 
{
    static class Student 
    {
        String college = "VIT";
    }

    public static void main(String[] args) 
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.college = "MIT";

        System.out.println(s1.college);
        System.out.println(s2.college);
    }
}
