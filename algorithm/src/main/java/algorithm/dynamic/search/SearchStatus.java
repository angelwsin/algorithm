package algorithm.dynamic.search;

import algorithm.algorithm.tree.Node;

public class SearchStatus<T> {
    
    
    private Node<T>  sucess;
    
    private Node<T>  fail;

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
    
    

}
