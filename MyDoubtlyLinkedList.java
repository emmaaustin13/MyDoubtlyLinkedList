class MyDoublyLinkedList<T> {

    private static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;
        Node(E d) { data = d; }
    }

    private Node<T> head;   // front
    private Node<T> tail;   // back
    private int size;       // count of elements

    public MyDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T element) {
        Node<T> n = new Node<>(element);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    public T remove() {
        if (head == null) return null;
        T out = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return out;
    }

    public T peekFirst() {
        return head == null ? null : head.data;
    }

    public boolean isEmpty() { return size == 0; }

    public int size() { return size; }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public boolean contains(T target) {
        for (Node<T> walker = head; walker != null; walker = walker.next) {
            if ((target == null && walker.data == null) ||
                (target != null && target.equals(walker.data))) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (Node<T> walker = head; walker != null; walker = walker.next) {
            sb.append(walker.data);
            if (walker.next != null) sb.append(" | ");
        }
        sb.append(" ]");
        return sb.toString();
    }
}

