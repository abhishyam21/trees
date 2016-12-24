package com.ancestorsofanode;

import com.TreesExamples.BinaryTree;

/**
 * Created by Rachana Rao on 1/6/2016.
 */
public class AncestorOfNodeWithRecursion {

    public boolean ancestorOfNodeWithRecursion(BinaryTree node, int data){

        if (node == null) {
            return false;
        }

        if (node.getData() == data) {
            return true;
        }

        /* If target is present in either left or right subtree of this node,
         then print this node */
        if (ancestorOfNodeWithRecursion(node.getLeftNode(), data)
                || ancestorOfNodeWithRecursion(node.getRightTree(), data)) {
            System.out.print(node.getData() + "\t");
            return true;
        }
return false;
    }
}
