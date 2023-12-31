package INFO3.TP3;

public class ArrayQueue<AnyType> {
    private AnyType[] theArray;
    private int currentSize, front, back;
    private static final int DEFAULT_CAPACITY = 10;

    private int increment(int x) {
        if (++x == theArray.length) {
            x = 0;
        }
        return x;
    }

    public ArrayQueue() {
        theArray = (AnyType[]) new Object[DEFAULT_CAPACITY];
        makeEmpty();
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void enqueue(AnyType x) {
        if (currentSize == theArray.length) {
            doubleQueue();
        }
        back = increment(back);
        theArray[back] = x;
        currentSize++;
    }

    private void doubleQueue() {
        AnyType[] newArray;
        newArray = (AnyType[]) new Object[theArray.length * 2];
        for (int i = 0; i < currentSize; i++, front = increment(front)) {
            newArray[i] = theArray[front];
        }
        theArray = newArray;
        front = 0;
        back = currentSize - 1;
    }

    public AnyType dequeue() throws Exception {
        if (isEmpty()) {
            throw new RuntimeException("ArrayQueue dequeue");
        }
        currentSize--;
        AnyType returnValue = theArray[front];
        front = increment(front);
        return returnValue;
    }

    public AnyType getFront() {
        if (isEmpty()) {
            throw new RuntimeException("ArrayQueue getFront");
        }
        return theArray[front];
    }

    public void makeEmpty() {
        currentSize = 0;
        front = 0;
        back = -1;
    }

    public AnyType peek() {
        if (isEmpty()) {
            throw new RuntimeException("ArrayQueue peek");
        }
        return theArray[front];
    }

    public AnyType poll() {
        try {
            return dequeue();
        } catch (Exception e) {
            throw new RuntimeException("ArrayQueue poll");
        }
    }

    public boolean offer(AnyType x) {
        enqueue(x);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < currentSize; i++) {
            sb.append(theArray[(front + i) % theArray.length]);
            if (i != currentSize - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}