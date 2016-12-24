package com.heightoftree;

import com.TreesExamples.BinaryTree;

/**
 * Created by Rachana Rao on 2/7/2016.
 */
public class Recursion {
    public int heightOfTree(BinaryTree tree){
        if(tree == null)
            return 0;
        else {
            int l = heightOfTree(tree.getLeftNode());
            int r = heightOfTree(tree.getRightTree());
            if(l>r)
                return l+1;
            else return r+1;

        }
    }
}
