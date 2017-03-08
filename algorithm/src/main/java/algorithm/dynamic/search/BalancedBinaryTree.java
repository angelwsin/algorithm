package algorithm.dynamic.search;

import java.util.ArrayList;
import java.util.List;

import algorithm.algorithm.tree.Node;

/*
 * 平衡二叉树
 * 它的左子树和右子树都是平衡二叉树且左子树和右子树的深度之差绝对值不超过1
 * 
 * logn
 * 平衡二叉树的调整
 * 二叉排序树插入节点失去平衡的的最小树根节点记为 n
 * 1)单向右旋： n左子树根节点的左子树插入,n的平衡因子1->2 向右顺时针旋转
 * 2)单向左旋：n右子树根节点的右子树插入,n的平衡因子-1->-2 向左逆时针旋转
 * 3)先左后右: n左子树根节点的右子树插入,n的平衡因子1->2 
 * 4)先右后左: n右子树根节点的左子树插入,n的平衡因子-1->-2
 */
public class BalancedBinaryTree<T> extends BinarySortTree<T>{
    
    
    
    public static void main(String[] args) {
        BalancedBinaryTree<Integer> tree = new BalancedBinaryTree<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(13);
        list.add(24);
        list.add(37);
        list.add(90);
        list.add(53);
        for(Integer node : list){
            tree.search(node);
        }
        tree.mid();
    }
    
    public void insert(Node<T> key){
         key =(BSTNode<T>) key;
        SearchStatus<T> local = search1(key);
        BSTNode<T> node = (BSTNode<T>) local.getFail();
        BSTNode<T> success = (BSTNode<T>) local.getSucess();
        if(node!=null&&success==null){
            if(node.compareTo(key)>0){
                node.setLeft(key);
                node.setBf(node.getBf()+1);
            }else if(node.compareTo(key)<0){
                node.setRight(key);
                node.setBf(node.getBf()-1);
            }
        }else {
            if(success!=null){
                String pre =  node==null?"无":node.toString();
                System.out.println("查找到:"+local.getNodeType().name()+","+success.toString()+",双亲节点:"+pre);   
            }else {
                if(this.root==null)
                    this.root = key; 
            }
           
        }
    }
    
    @Override
    public void search(T data) {
        BSTNode<T> key = new BSTNode<T>();
        key.setData(data);
        insert(key);
    }

}
