package com.suraj;

public class Tree {

    private Node root;

    public void treeInsert(int value){

        if(root == null){
            root = new Node(value);
        }
        else{
            root.insert(value);
        }
    }

    public void traverseInorder(){
        if(root != null)
            root.traverseInOrder();
        System.out.println();
    }

    public void travesePreOrder(){
        if(root != null){
            root.traversePreOrder();
        }
        System.out.println();
    }

    public void travesePostOrder(){
        if(root != null){
            root.traversePostOrder();
        }
        System.out.println();
    }

    public void delete(int value){
        root = delete(root, value);
    }

    // it will return a replacement node for the node to be deleted

    private Node delete(Node subTreeNode, int value){
        // if tree is empty
        if (subTreeNode == null){
            return subTreeNode;
        }

        // if value is less than root of the subtree it will search in leftsubtree
        // and replace the left child with return value of internal delete function
        if(value < subTreeNode.getData()){
            subTreeNode.setLeftChild(delete(subTreeNode.getLeftChild(), value));
        }
        // it will search on right subtree
        else if(value > subTreeNode.getData()){
            subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), value));
        }

        // it will handle cases with 0 or 1 child
        else{
            if(subTreeNode.getLeftChild() == null) {
                return subTreeNode.getRightChild();
            }
            else if (subTreeNode.getRightChild() == null){
                return subTreeNode.getLeftChild();
            }

        // it will handle cases with 2 children
//            we are going to set the value of node to be deleted with its appropriate value from left(max of subtree)
//            or right(min of subtree)  and delete the replaced node
//            getting and replacing value from right subtree
            subTreeNode.setData(subTreeNode.getRightChild().min());

//            delete the replaced node from rightsubtree
            subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), subTreeNode.getData()));

        }

//        if value is not in the tree
        return subTreeNode;


    }

    public Node get(int value){
        if(root != null){
            return root.get(value);
        }

        return null;
    }

    public int min(){
        if(root != null){
            return root.min();
        }
        else{
            return Integer.MIN_VALUE;
        }
    }

    public int max() {
        if (root != null) {
            return root.max();
        } else {
            return Integer.MAX_VALUE;
        }
    }
}


