package com.findingTheLargestNumberInTree;

import com.TreesExamples.BinaryTree;

/**
 * Created by Rachana Rao on 12/27/2015.
 */
public class LargestNumberInTreeWithRecursion {

    protected int largestNumber(BinaryTree tree){

        if(tree == null)
            return 0;
        else {

           int lmaxval = largestNumber(tree.getLeftNode());
           int rmaxval = largestNumber(tree.getRightTree());
            if (lmaxval<tree.getData()){
                lmaxval = tree.getData();
            }
            else if(rmaxval < tree.getData()){
                rmaxval = tree.getData();
            }
            if(lmaxval < rmaxval)
            return rmaxval;
            else
                return lmaxval;
        }

       /* int leftTreeMax = getMaxOfTree(tree.getLeftNode(),maxval);
        int rightTreeMax = getMaxOfTree(tree.getRightTree(),maxval);

        if(leftTreeMax < rightTreeMax && rightTreeMax < tree.getData())
            return tree.getData();
        else if(leftTreeMax > rightTreeMax && leftTreeMax > tree.getData())
            return leftTreeMax;
        else return rightTreeMax;*/
    }

    /*private int getMaxOfTree(BinaryTree node, int maxval) {
        if(node!=null) {
            if (node.getData() > maxval)
                maxval = node.getData();
            getMaxOfTree(node.getLeftNode(), maxval);
            getMaxOfTree(node.getRightTree(), maxval);
        }
            return maxval;
    }*/

}
