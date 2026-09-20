class Solution {

    public void enqueue(Queue<Integer> q, int x) {
        q.offer(x);
    }

    public void dequeue(Queue<Integer> q) {
        q.poll();
    }

    public int front(Queue<Integer> q) {
        return q.peek();
    }

    public boolean find(Queue<Integer> q, int x) {
        return q.contains(x);
    }
}