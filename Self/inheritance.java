public class inheritance {

    class A {
        A() 
        {
            super(); // Calls Object's constructor
            System.out.println("This is class A");
        }
    }

    class B extends A {
        B() 
        {
            super(); // Calls A's constructor
            System.out.println("This is class B");
        }
        B(int x) 
        {
            this(); // Calls A's constructor
            System.out.println("This is class B with parameter: " + x);
        }
    }

    public static void main(String[] args) 
    {
        inheritance obj = new inheritance();
        B b = obj.new B(5);
    }
}