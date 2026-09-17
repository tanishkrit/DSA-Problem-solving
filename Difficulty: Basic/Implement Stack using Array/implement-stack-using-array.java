class myStack {

    int stack[];
    int top;

    public myStack(int n) 
    {
        stack = new int[n];
        top = -1;
    }

    public boolean isEmpty() 
    {
        return top == -1;
    }

    public boolean isFull() 
    {
        return top == stack.length - 1;
    }

    public void push(int x) 
    {

        if(isFull()) 
        {
            return;
        }

        top++;
        stack[top] = x;
    }

    public void pop() 
    {

        if(!isEmpty()) 
        {
            top--;
        }
    }

    public int peek() 
    {

        if(isEmpty()) {
            return -1;
        }

        return stack[top];
    }
}