package algorithm.dynamic.search;

import algorithm.algorithm.tree.Node;

public class Status<T> {
    
    private  boolean isExist;
    
    private  Node<T> node;

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean isExist) {
        this.isExist = isExist;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }
    
   
    
        

}
