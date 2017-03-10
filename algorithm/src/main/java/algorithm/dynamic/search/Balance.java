package algorithm.dynamic.search;

import algorithm.algorithm.tree.Node;

public class Balance<T> {
    
    private Node<T> node;
    
    private BalanceType type = BalanceType.not;

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }

    public BalanceType getType() {
        return type;
    }

    public void setType(BalanceType type) {
        this.type = type;
    }
    
    
    
    
    

}
