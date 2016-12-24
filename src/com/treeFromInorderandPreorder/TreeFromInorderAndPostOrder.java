package com.treeFromInorderandPreorder;

import com.TreesExamples.BinaryTree;

import java.util.Arrays;

/**
 * Created by Rachana Rao on 2/14/2016.
 */
public class TreeFromInorderAndPostOrder {
    BinaryTree Root = null;
    public BinaryTree constructTree(int[] inorder, int[] preorder) {

        if(preorder.length>0){
            Root = new BinaryTree(preorder[0]);
        }
        int val = findElement(inorder,preorder[0]);
        createTree(Root,Arrays.copyOfRange(inorder,0,val),preorder,1);
        createTree(Root,Arrays.copyOfRange(inorder,val+1,inorder.length),preorder,1);
        return Root;
    }

    private void createTree(BinaryTree root, int[] inorder, int[] preorder,int n) {
        if(inorder.length >0){
            root = new BinaryTree(preorder[n]);
        }
        int val = findElement(inorder,preorder[n]);
        createTree(root.getLeftNode(),Arrays.copyOfRange(inorder,0,val),preorder,1);
        createTree(root.getRightTree(),Arrays.copyOfRange(inorder,val+1,inorder.length),preorder,1);

    }
    private int findElement(int[] inorder, int n){
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == n)
                return i;
        }
        return -1;
    }

}
