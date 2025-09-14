class MyQueue<T> {
    private final MyDoublyLinkedList<T> list = new MyDoublyLinkedList<>();

    public String queue() { return list.toString(); }

    public void push(T element) { list.add(element); }

    public T pop() { return list.remove(); }

    public T peek() { return list.peekFirst(); }

    public boolean empty() { return list.isEmpty(); }

    public boolean search(T element) { return list.contains(element); }
  
    public int size() { return list.size(); }
}
