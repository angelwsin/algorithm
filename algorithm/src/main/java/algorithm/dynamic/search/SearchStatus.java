package algorithm.dynamic.search;

import algorithm.algorithm.tree.Node;
import algorithm.algorithm.tree.NodeType;

public class SearchStatus<T> {
    
    
    private Node<T>  sucess;
    
    private Node<T>  fail;
    
    private NodeType   nodeType = NodeType.Root;
    
    private boolean   isExist = true;

    public Node<T> getSucess() {
        return sucess;
    }

    public void setSucess(Node<T> sucess) {
        this.sucess = sucess;
    }

    public Node<T> getFail() {
        return fail;
    }

    public void setFail(Node<T> fail) {
        this.fail = fail;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean isExist) {
        this.isExist = isExist;
    }
    
    

}
