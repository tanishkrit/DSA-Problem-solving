public class linkedlist
{
    class node
    {
        int data;
        node next;

        node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }
    class linkedlist1
    {
        node head;

        public void insert(int data)
        {
            node newNode = new node(data);
            if(head == null)
            {
                head = newNode;
                return;
            }
            node current = head;
            while(current.next != null)
            {
                current = current.next;
            }  
            current.next = newNode;
        }
        public void display()
        {
            node current = head;
            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }
    public static void main(String[] args)
    {
        linkedlist1 list = new linkedlist().new linkedlist1();
        list.insert(5);
        list.insert(2);
        list.insert(9);
        list.insert(1);
        list.insert(5);
        list.insert(6);
        System.out.println("Linked List:");
        list.display();
    }
}