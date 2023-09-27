package INFO3.TP5;

public class binaryNode<AnyType> {

    private AnyType element;
    private binaryNode<AnyType> left;
    private binaryNode<AnyType> right;

    public binaryNode(){
        this(null, null , null);
    }
    
    public binaryNode(AnyType theElement, binaryNode<AnyType> lt, binaryNode<AnyType> rt){
        element = theElement;
        left = lt;
        right = rt;
    }

    public AnyType getElement(){
        return element;
    }

    public binaryNode<AnyType> getLeft(){
        return left;
    }

    public binaryNode<AnyType> getRight(){
        return right;
    }

    public void setElement(AnyType x){
        element = x;
    }

    public void setLeft(binaryNode<AnyType> t){
        left = t;
    }

    public void setRight(binaryNode<AnyType> t){
        right = t;
    }

}
