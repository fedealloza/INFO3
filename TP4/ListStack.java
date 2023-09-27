package INFO3.TP4;

public class ListStack<AnyType> {
    private ListNode<AnyType> topOfStack = null;
    private int size = 0;

    public boolean isEmpty() {
        return topOfStack == null;
    }

    public void makeEmpty() {
        topOfStack = null;
        size = 0;
    }

    private class ListNode<AnyType> {
        public AnyType element;
        public ListNode<AnyType> next;

        public ListNode(AnyType theElement, ListNode<AnyType> n) {
            element = theElement;
            next = n;
        }
    }

    public void push(AnyType x) {
        topOfStack = new ListNode<AnyType>(x, topOfStack);
        size++;
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("ListStack pop");
        }
        topOfStack = topOfStack.next;
        size--;
    }

    public AnyType top() {
        if (isEmpty()) {
            throw new RuntimeException("ListStack top");
        }
        return topOfStack.element;
    }

    public AnyType topAndPop() {
        if (isEmpty()) {
            throw new RuntimeException("ListStack topAndPop");
        }
        AnyType topItem = topOfStack.element;
        topOfStack = topOfStack.next;
        size--;
        return topItem;
    }

    public void push(int x) {
    }

    public int size() {
        return size;
    }

    public AnyType get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("ListStack get");
        }
        ListNode<AnyType> current = topOfStack;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }
}