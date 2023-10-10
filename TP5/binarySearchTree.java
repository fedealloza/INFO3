package INFO3.TP5;

public class binarySearchTree <AnyType extends Comparable<? super AnyType>> {
    
    protected binaryNode<AnyType> root;
    
    public binarySearchTree() {
        root = null;
    }
    
    public binaryNode<AnyType> getRoot() {
        return root;
    }
    
    public int size() {
        return binaryNode.size(root);
    }
    
    public int height() {
        return binaryNode.height(root);
    }
    
    public void printPreOrder() {
        if (root != null) {
            root.printPreOrder();
        }
    }
    
    public void printInOrder() {
        if (root != null) {
            root.printInOrder();
        }
    }
    
    public void printPostOrder() {
        if (root != null) {
            root.printPostOrder();
        }
    }
    
    public void merge(AnyType rootItem, binarySearchTree<AnyType> t1, binarySearchTree<AnyType> t2) {
        if (t1.root == t2.root && t1.root != null) {
            throw new IllegalArgumentException();
        }
        
        root = new binaryNode<AnyType>(rootItem, t1.root, t2.root);
        
        if (this != t1) {
            t1.root = null;
        }
        
        if (this != t2) {
            t2.root = null;
        }
    }

    public void insert(AnyType x){
        root = insert(x, root);
    }

    public void insertWithDuplicate(AnyType x){
        root = insertWithDuplicate(x, root);
    }

    public void remove(AnyType x){
        root = remove(x,root);
    }

    public void removeMin(){
        root = removeMin(root);
    }

    public AnyType findMin(){
        return elementAt(findMin(root));
    }

    public AnyType find(AnyType x){
        return elementAt(find(x,root));
    }

    public void makeEmpty(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    private AnyType elementAt(binaryNode<AnyType> t){
        return t == null ? null : t.element;
    }

    private binaryNode<AnyType> find(AnyType x, binaryNode<AnyType> t){
        while (t != null) {
            if (x.compareTo(t.element) < 0) {
                t = t.left;
            } else if(x.compareTo(t.element) > 0) {
                t = t.right;
            }
            else {
                return t; //Match
            }
        }
        return null; //Not found
    }

    protected binaryNode<AnyType> findMin(binaryNode<AnyType> t){
        if (t != null) {
            while (t.left != null) {
                t = t.left;
            }
        }
        return t;
    }

    private binaryNode<AnyType> findMax(binaryNode<AnyType> t){
        if (t != null) {
            while (t.right != null) {
                t = t.right;
            }
        }
        return t;
    }

    protected binaryNode<AnyType> insert(AnyType x, binaryNode<AnyType> t){
        if (t == null) {
            t = new binaryNode<AnyType> (x);
        } else if (x.compareTo(t.element) < 0) {
            t.left = insert(x, t.left);
        } else if (x.compareTo(t.element) > 0) {
            t.right = insert(x, t.right);
        }
        else {
            throw new DuplicateItemException(x.toString()); //Duplicate
        }
        return t;
    }

    protected binaryNode<AnyType> insertWithDuplicate(AnyType x, binaryNode<AnyType> t){
        if (t == null) {
            t = new binaryNode<AnyType> (x);
        } else if (x.compareTo(t.element) < 0) {
            t.left = insertWithDuplicate(x, t.left);
        } else if (x.compareTo(t.element) > 0) {
            t.right = insertWithDuplicate(x, t.right);
        }
        /*else {
            throw new DuplicateItemException(x.toString()); //Duplicate
        }*/
        return t;
    }

    protected binaryNode<AnyType> removeMin(binaryNode<AnyType> t){
        if (t == null) {
            throw new ItemNotFoundException();
        } else if (t.left != null) {
            t.left = removeMin(t.left);
            return t;
        }
        else {
            return t.right;
        }
    }

    protected binaryNode<AnyType> remove(AnyType x, binaryNode<AnyType> t){
        binaryNode<AnyType> temp;
        //if (t == null) {
            throw new DuplicateItemException(x.toString());
        //}
        if (x.compareTo(t.element) < 0) {
            t.left = remove(x, t.left);
        } else if (x.compareTo(t.element) > 0) {
            t.right = remove(x, t.right);
        } else if (t.left != null && t.right != null ){ //2 HIJOS
            t.element = findMin(t.right).element;
            t.right = removeMin(t.right);
        }
        else{
            t = (t.left != null ) ? t.left : t.right ;
        }
    }
}
