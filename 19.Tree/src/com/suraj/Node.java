package com.suraj;

public class Node {

        private int data;
        private Node leftChild;
        private Node rightChild;

        // constructor
        public Node(int data){
            this.data = data;
        }

        public void insert(int value){
            // skipping duplicate value
            if(data == value)
                return;

            if(data > value){
                if(leftChild == null){
                    leftChild = new Node(value);
                }
                else{
                    // it will insert in left subtree
                    leftChild.insert(value);
                }
            }

            if(data < value){
                if(rightChild == null){
                    rightChild = new Node(value);
                }
                else{
                    // insert in right subtree
                    rightChild.insert(value);
                }
            }

        }

        public void traverseInOrder(){
            if(leftChild != null){
                leftChild.traverseInOrder();
            }
            System.out.print(data + ", ");

            if(rightChild != null){
                rightChild.traverseInOrder();
            }

        }

        public void traversePreOrder(){
            System.out.print(data +", ");
            if(leftChild!= null){
                leftChild.traversePreOrder();
            }
            if(rightChild != null){
                rightChild.traversePreOrder();
            }

        }

    public void traversePostOrder(){

        if(leftChild!= null){
            leftChild.traversePostOrder();
        }
        if(rightChild != null){
            rightChild.traversePostOrder();
        }
        System.out.print(data +", ");

    }

    public Node get(int value){
            if(value == data){
                return this; // returning    same node
            }

            if(value < data){
                if(leftChild != null) {
                    return leftChild.get(value);
                }
            }

            else{
                if(rightChild != null) {
                    return rightChild.get(value);
                }
            }

            return null; // value is not found
    }

        public int min(){
            if(leftChild == null){
                return data;
            }
            else{
                return leftChild.min();
            }
        }

    public int max(){
        if(rightChild == null){
            return data;
        }
        else{
            return rightChild.max();
        }
    }




        // getter and setter
        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
}
