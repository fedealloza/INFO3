package INFO3.TP5;

public class binaryTree<AnyType>{

    private binaryNode<AnyType> root;

    public binaryTree(){
        root = null;
    }

    public binaryTree(AnyType rootItem){
        root = new binaryNode<AnyType>(rootItem, null, null);
    }

    public binaryNode<AnyType> getRoot(){
        return root;
    }

    public int size(){
        return binaryNode.size(root);
    }

    public int height(){
        return binaryNode.height(root);
    }

    public void printPreOrder(){
        if (root!=null) {
            root.printPreOrder();
        }
    }

    public void printInOrder(){
        if (root!=null) {
            root.printInOrder();
        }
    }

    public void printPostOrder(){
        if (root!=null) {
            root.printPostOrder();
        }
    }

    public void makeEmpty(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void merge(AnyType rootItem, binaryTree<AnyType> t1, binaryTree<AnyType> t2){
        if (t1.root == t2.root && t1.root != null) {
            throw new IllegalArgumentException();
        }

        root = new binaryNode<AnyType>(rootItem, t1.root, t2.root);

        if (this!=t1) {
            t1.root = null;
        }

        if (this!=t2) {
            t2.root = null;
        }

    }
}
