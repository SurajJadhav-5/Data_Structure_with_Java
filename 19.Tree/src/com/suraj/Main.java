package com.suraj;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.treeInsert(25);
        tree.treeInsert(20);
        tree.treeInsert(15);
        tree.treeInsert(27);
        tree.treeInsert(30);
        tree.treeInsert(29);
        tree.treeInsert(26);
        tree.treeInsert(22);
        tree.treeInsert(32);

        tree.traverseInorder();
//        tree.travesePreOrder();
//        tree.travesePostOrder();

//        System.out.println( tree.get(22));
//        System.out.println(tree.get(32));
//        System.out.println( tree.get(220));

//        System.out.println(tree.min());
//        System.out.println(tree.max());

//        tree.delete(15);
//        tree.traverseInorder();
//        tree.delete(27);
//        tree.traverseInorder();
//        tree.delete(25);
//        tree.traverseInorder();

        tree.delete(590);
        tree.traverseInorder();






    }

}
