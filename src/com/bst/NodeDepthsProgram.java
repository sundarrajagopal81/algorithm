package com.bst;

public class NodeDepthsProgram {

    public static void main(String args[]){

        var root = new NodeDepthsProgram.BinaryTree(1);
        root.left = new NodeDepthsProgram.BinaryTree(2);
        root.left.left = new NodeDepthsProgram.BinaryTree(4);
        root.left.left.left = new NodeDepthsProgram.BinaryTree(8);
        root.left.left.right = new NodeDepthsProgram.BinaryTree(9);
        root.left.right = new NodeDepthsProgram.BinaryTree(5);
        root.right = new NodeDepthsProgram.BinaryTree(3);
        root.right.left = new NodeDepthsProgram.BinaryTree(6);
        root.right.right = new NodeDepthsProgram.BinaryTree(7);
        int actual = NodeDepthsProgram.nodeDepths(root);
        System.out.println("Value::"+actual);

    }
    public static int nodeDepths(BinaryTree root){
        return nodeHelper(root,0);
    }
    public static int nodeHelper(BinaryTree root, int depth){
        if(root == null) return 0;
        return depth + nodeHelper(root.left,depth+1) + nodeHelper(root.right,depth+1);
    }

    static class BinaryTree {
         BinaryTree left;
         BinaryTree right;
         int value;
         BinaryTree(int value) {
             this.value = value;
             left = null;
             right = null;
         }
     }
}
