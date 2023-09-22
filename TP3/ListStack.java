package INFO3.TP3;

public class ListStack<AnyType>{
    private ListNode<AnyType> topOfStack = null;

    public boolean isEmpty() {
        return topOfStack == null;
    }

    public void makeEmpty() {
        topOfStack = null;
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
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("ListStack pop");
        }
        topOfStack = topOfStack.next;
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
        return topItem;
    }
}
