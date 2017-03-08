package algorithm.dynamic.search;

import algorithm.algorithm.tree.Node;

public class BSTNode<T> extends Node<T>{
    
    //平衡因子
    private int       bf;

    public int getBf() {
        return bf;
    }

    public void setBf(int bf) {
        this.bf = bf;
    }
    
    @Override
    public String toString() {
        return super.toString()+",bf="+bf;
    }

    
    
}
