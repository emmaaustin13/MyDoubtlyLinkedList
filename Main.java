public class Main {
    public static void main(String[] args) {
        System.out.println("Queue Demo - by <Your Name Here>");
        MyQueue<Integer> q = new MyQueue<>();

        System.out.println("pushing: 10, 20, 30, 40, 50");
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        System.out.println("queue(): " + q.queue() + "   size=" + q.size());

        System.out.println("peek(): " + q.peek());
        System.out.println("pop(): " + q.pop());
        System.out.println("after pop, queue(): " + q.queue());

        System.out.println("search(30): " + q.search(30));  
        System.out.println("search(99): " + q.search(99));  
        while (!q.empty()) {
            System.out.println("popped -> " + q.pop());
        }
        System.out.println("empty(): " + q.empty());
        System.out.println("queue(): " + q.queue());
    }
}
