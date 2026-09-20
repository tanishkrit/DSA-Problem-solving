class myQueue {
    
    int arr[];
    int front = 0;
    int rear = -1;
    int size = 0;
    
    public myQueue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void enqueue(int x) {
        if(size == arr.length)
        {
            System.out.println("Queue is full");
            return;
        }
        
        rear = (rear + 1) % arr.length;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {
        if(size == 0)
        {
            System.out.println("Queue is Empty");
            return;
        }
        front = (front + 1) % arr.length;
        size--;
    }

    public int getFront() {
        if(size == 0)
            return -1;

        return arr[front];
    }

    public int getRear() {
        if(size == 0)
            return -1;

        return arr[rear];
    }
}
