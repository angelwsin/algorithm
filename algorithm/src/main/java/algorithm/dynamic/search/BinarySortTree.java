package algorithm.dynamic.search;

import java.util.ArrayList;
import java.util.List;

import algorithm.algorithm.tree.BinaryTree;
import algorithm.algorithm.tree.Node;


/*
 * BinarySortTree
 * 二叉排序树（二叉查找树）
 * 或者是一颗空树，具有以下性质的树
 * 1）若它的左子树不空，则左子树所有结点的值均小于它的根结点的值
 * 2）若它的右子树不空，则右子树所有结点的值均大于它的根结点的值
 * 3）它的左、右子树也是二叉排序树
 * 
 */
public class BinarySortTree<T> extends BinaryTree<T>{
    
    
    public static void main(String[] args) {
        BinarySortTree<Integer> tree = new BinarySortTree<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(45);
        list.add(24);
        list.add(53);
        list.add(45);
        list.add(12);
        list.add(24);
        list.add(90);
        for(Integer node : list){
            tree.search(node);
        }
        tree.first();
      
    }
    
    
    public Node<T> search(Node<T> key){
        return search(this.root, key);
    }
    
    private  Node<T> search(Node<T> node,Node<T> key){
        if(node==null)return null;
        if(node.compareTo(key)==0){
           return node;
        }else if(node.compareTo(key)>0){
          return  search(node.getLeft(),key);
        }else{
         return  search(node.getRight(),key); 
        }
        
        
    }
    /**
     * 
     * 
     * @param node
     * @param key
     * @return
     */
    private  SearchStatus<T> search(Node<T> node,Node<T> key,SearchStatus<T> local){
        
        if(node==null)return local;
        local.setFail(node);
        if(node.compareTo(key)==0){
            local.setSucess(node);
            local.setFail(null);
           return local;
        }else if(node.compareTo(key)>0){
          return search(node.getLeft(),key,local);
        }else{
         return  search(node.getRight(),key,local) ;
        }
        
        
    }
    
    
    public void insert(Node<T> key){
        Node<T> node = search1(key).getFail();
        if(node!=null){
            if(node.compareTo(key)>0){
                node.setLeft(key);
            }else if(node.compareTo(key)<0){
                node.setRight(key);
            }
        }else{
            if(this.root==null)
             this.root = key;
        }
    }
    
    public  SearchStatus<T> search1(Node<T> key){
       return  search(this.root, key, new SearchStatus<T>());
    }
    
    public void search(T data){
        Node<T> key = new Node<T>();
        key.setData(data);
        insert(key);
    }

}
