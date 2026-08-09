public class queue 
{
    int Queue[] = new int[10];
    int size;
    int front;
    int rear =0;

    public void enqueue(int data)
    {
        Queue[rear] = data;
        rear++;
        size++;

    }

    public void dequeue()
    {
        if (size == 0)
        {
            System.out.println("Queue is empty");
            return;
        }
        else
        {
            int data = Queue[front];
            front++;
            size--;
            System.out.println("Dequeued element: " + data);
        }
    }



    public void show()
    {
        for(int i =0 ; i<rear; i++)
        {
            System.out.println(Queue[i]);
        }
    }

    public static void main(String args[])
    {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.show();
    }
}