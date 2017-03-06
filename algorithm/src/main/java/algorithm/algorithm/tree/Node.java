package algorithm.algorithm.tree;

public class Node<T> {
    
    private Node<T>  left;
    
    private T     data;
    
    private Node<T>  right;

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public void addLeft(T data){
        if(this.getLeft()==null) {
            Node<T> left = new Node<T>();
            left.setData(data);
            this.setLeft(left);
            return ;
        }
        this.getLeft().addLeft(data);
    }
    
    public void addRight(T data){
       
        if(this.getRight()==null){
            Node<T> right = new Node<T>();
            right.setData(data);
            this.setRight(right);
            return ;
         }
       this.getRight().addRight(data);  

    }
    
    
    @Override
    public String toString() {
       return data.toString();
    }
    
    /*
     * 先序遍历  左根右
     */
    public void  first(){
       if(this.getLeft()!=null) 
          this.getLeft().first();
       
       System.out.println(this.toString());
       if(this.getRight()!=null)
           this.getRight().first();
         
    }
    
    /*
     * 中序遍历 根左右
     */
    public void mid(){
        System.out.println(this.toString());
        
        if(this.getLeft()!=null) 
            this.getLeft().mid();
        if(this.getRight()!=null)
            this.getRight().mid();
    }
    
    /*
     * 后序遍历 左右根
     */
    public void after(){
        if(this.getLeft()!=null) 
            this.getLeft().after();
        if(this.getRight()!=null)
            this.getRight().after();  
        System.out.println(this.toString());
    }

}
