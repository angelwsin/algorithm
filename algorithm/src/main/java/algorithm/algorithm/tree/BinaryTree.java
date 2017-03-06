package algorithm.algorithm.tree;

public class BinaryTree<T> {
    
    
    private Node<T>  root;
    
    BinaryTree(T root){
        this.root =  new Node<T>();
        this.root.setData(root);
    }
    
   
    
    
    public void addLeft(T data){
        this.root.addLeft(data);
    }
    
    public void addRight(T data){
        this.root.addRight(data);
    }
    
    public static void main(String[] args) {
        BinaryTree<String> tree = new BinaryTree<String>("root");
        tree.addLeft("left");
        tree.addRight("right");
        //tree.first();
        //tree.mid();
        tree.after();
    }
    
    public void  first(){
        this.root.first();
    }
    
    public void mid(){
        this.root.mid();
    }
    
    public void after(){
        this.root.after();
    }

}
