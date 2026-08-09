public class stack 
{
    int stack[] = new int[5];
    int top = 0;

    public void push(int data)
    {
        stack[top] = data;
        top++;
    }
    public void peek()
    {
        System.out.println("Top element: " + stack[top-1]);
    }
    public void pop()
    {
        int data = stack[top-1];
        top--;
        System.out.println("Popped element: " + data);
    }

    public int size()
    {
        System.out.println("Size of stack: " + top);
        return top;
    }

    public boolean isEmpty()
    {
        return top == 0;
    }


    public void display()
    {
        for(int i=top-1; i>=0; i--)
        {
            System.out.println(stack[i]);
        }
    }

    public static void main(String args[])
    {
        stack s = new stack();
        s.isEmpty();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();   
        s.push(60);
        s.peek();
        s.size ();
        s.isEmpty();
        s.display();
    }
}