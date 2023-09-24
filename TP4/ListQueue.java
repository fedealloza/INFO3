package INFO3.TP4;

public class ListQueue<AnyType> {
    private ListNode<AnyType> front;
    private ListNode<AnyType> back;

    private class ListNode<AnyType> {
        public AnyType element;
        public ListNode<AnyType> next;

        public ListNode(AnyType theElement, ListNode<AnyType> n) {
            element = theElement;
            next = n;
        }
    }

    public ListQueue() {
        front = back = null;
    }

    public void enqueue(AnyType x) {
        if (isEmpty()) {
            back = front = new ListNode<AnyType>(x, null);
        } else {
            back.next = new ListNode<AnyType>(x, null);
            back = back.next;
        }
    }

    public AnyType dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("ListQueue dequeue");
        }
        AnyType returnValue = front.element;
        front = front.next;
        if (front == null) {
            back = null;
        }
        return returnValue;
    }

    public AnyType getFront() {
        if (isEmpty()) {
            throw new RuntimeException("ListQueue getFront");
        }
        return front.element;
    }

    public void makeEmpty() {
        front = null;
        back = null;
    }

    public boolean isEmpty() {
        return front == null;
    }
}