class Solution {

    public Queue<Integer> fillQ(int[] arr) {

        Queue<Integer> q = new LinkedList<>();

        for(int x : arr)
        {
            q.offer(x);
        }

        return q;
    }

    public void emptyQ(Queue<Integer> q) {

        while(!q.isEmpty())
        {
            System.out.print(q.poll() + " ");
        }

        System.out.println();
    }
}