package INFO3.TP5;

import org.omg.CORBA.Any;

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

    public static <AnyType> int size(binaryNode<AnyType> t){
        if (t==null) {
            return 0;
        } else {
            return  1 + size(t.left) + size(t.right);           
        }
    }

    public static <AnyType> int height(binaryNode<AnyType> t){
        if (t==null) {
            return -1;
        } else {
            return  1 + Math.max(height(t.left), height(t.right));           
        }
    }

    /*
     * devolver una referencia a un nodo que es la raíz de un 
     * duplicado del árbol binario enraizado en el nodo actual
     */
    public binaryNode<AnyType> duplicate(){
        binaryNode<AnyType> root = new binaryNode<AnyType>(element, null, null);
        
        if(left!=null){             // si hay un sub-arbol en la izq
            root.left = left.duplicate(); //duplicado; unir
        }
        if(right!=null){            // si hay un sub-arbol en la der
            root.right = right.duplicate(); // duplicado; unir
        }

        return root; //devuelve el arbol resultante 
    }

    public void printPreOrder(){
        System.out.println(element); // nodo
        if (left!=null) {
            left.printPreOrder(); //left
        }
        if (right!=null) {
            right.printPreOrder(); //right
        }

    }

    public void printPostOrder(){
        if (left!=null) {
            left.printPostOrder(); //left
        }
        if (right!=null) {
            right.printPostOrder(); //right
        }
        System.out.println(element); // nodo
    }

    public void printInOrder(){
        if (left!=null) {
            left.printInOrder(); //left
        }
        System.out.println(element); //nodo
        if (right!=null) {
            right.printInOrder(); // right
        }
    }

}
