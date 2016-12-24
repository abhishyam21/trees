package com.treeFromInorderandPreorder;

import com.TreesExamples.BinaryTree;
import com.TreesExamples.LevelOrderTraversal;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Rachana Rao on 2/14/2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] inorder = {4,2,5,1,6,3};
        int[] preorder = {1,2,4,5,3,6};
        TreeFromInorderAndPostOrder treeConstruction = new TreeFromInorderAndPostOrder();
        BinaryTree Root = treeConstruction.constructTree(inorder,preorder);
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrderTraversal(Root);
    }
}
