package com.bst;


/**
 * Binary search tree.
 */
public class BstProgram {
    public static void main(String args[]){
        var root = new BstProgram.BST(10);
        root.left = new BstProgram.BST(5);
        root.left.left = new BstProgram.BST(2);
        root.left.left.left = new BstProgram.BST(1);
        root.left.right = new BstProgram.BST(5);
        root.right = new BstProgram.BST(15);
        root.right.left = new BstProgram.BST(13);
        root.right.left.right = new BstProgram.BST(14);
        root.right.right = new BstProgram.BST(22);
        var actual = BstProgram.findClosestValueInBst(root, 12);
        System.out.println("Closest BST::"+actual);//var expected = 13;
    }

    public static int findClosestValueInBst(BST tree , int target){
        return findClosestValueInBst(tree, target,tree.value  );
    }
    public static int findClosestValueInBst(BST tree , int target,int closest){
        if(Math.abs(target - closest) > Math.abs(target - tree.value)){
            closest = tree.value;
        }
        if(target < tree.value && tree.left != null){
           return findClosestValueInBst(tree.left,target,closest);
       } else if (target > tree.value && tree.right != null){
           return findClosestValueInBst(tree.right,target,closest);
       }
       else {
           return closest;
       }
    }

    static class BST{
    public int value;
    public BST left;
    public BST right;

    public BST(int value){
        this.value= value;
     }
    }
}
