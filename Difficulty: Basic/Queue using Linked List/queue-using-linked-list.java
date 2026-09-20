// Node class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
class myQueue {

    Node front;
    Node rear;
    int size;

    public myQueue() 
    {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() 
    {
        return size == 0;
    }

    public void enqueue(int x) 
    {
        Node newnode = new Node(x);
        
        if(size == 0)
        {
            front = newnode;
            rear = newnode;
        }
        else
        {
            rear.next = newnode;
            rear = newnode;
        }
        size++;
    }

    public void dequeue() 
    {
        if(size == 0)
        {
            System.out.println("Queue is empty");
            return;
        }
        front = front.next;
        size--;
        
        if(size == 0)
        {
            rear = null;
        }
    }

    public int getFront() 
    {
        if(size == 0)
        {
            return -1;
        }
        return front.data;
    }

    public int size() {
        return size;
    }
}
