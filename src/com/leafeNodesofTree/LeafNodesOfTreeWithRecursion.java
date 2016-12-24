package com.leafeNodesofTree;

import com.TreesExamples.BinaryTree;

/**
 * Created by Rachana Rao on 12/28/2015.
 */
public class LeafNodesOfTreeWithRecursion {
    public void leafs(BinaryTree root){
        if(root==null)
            return;
        else {
            leafs(root.getLeftNode());
            leafs(root.getRightTree());
            if(root.getLeftNode()==null && root.getRightTree()==null){
                System.out.print(root.getData()+"\t");
            }
        }
    }
}
