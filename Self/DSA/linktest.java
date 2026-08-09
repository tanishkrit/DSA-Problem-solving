public class linktest {

    class Node 
    {
        int data;
        Node next;
    }

    class LinkedList 
    {

        Node head;

        public void insert(int data) {

            Node newNode = new Node();
            newNode.data = data;

            if (head == null) {
                head = newNode;
            } else {
                Node current = head;

                while (current.next != null) {
                    current = current.next;
                }

                current.next = newNode;
            }
        }

        public void Insertatstart(int data)
        {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            newNode.next = head;
            head = newNode;

        }

        public void delete(int data)
        {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;

            if (data == head.data)
            {
                head = head.next;
            }
            else
            {
                Node current = head;
                while (current.next != null)
                {
                    if (current.next.data == data)
                    {
                        current.next = current.next.next;
                        return;
                    }
                    current = current.next;
            }
            }


        }

        public void insertat(int data, int position)
        {
            if (position == 0)
            {
                Insertatstart(data);
                return;
            }

            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;

            Node current = head;
            for (int i = 0; i < position -1 ; i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        
        public boolean search(int key) 
        {

            Node current = head;

            while (current != null) {

                if (current.data == key)
                    return true;

                current = current.next;
            }

            return false;
        }

        // Reverse
        public void reverse() {

            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null) {

                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
        }

        public int length() 
        {

            int count = 0;

            Node current = head;

            while (current != null) {
                count++;
                current = current.next;
            }

            return count;
        }



        public void display() 
        {

            Node current = head;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
       }
    }

    public static void main(String[] args) 
    {

        linktest obj = new linktest();
        LinkedList list = obj.new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.Insertatstart(50);
        list.insertat(60, 0);
        list.delete(60);
        list.search(30);
        // list.reverse();
        list.length();
        list.display();
    }
}