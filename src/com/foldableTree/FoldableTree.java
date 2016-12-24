package com.foldableTree;

import com.TreesExamples.BinaryTree;

/**
 * Created by Rachana Rao on 2/14/2016.
 */
public class FoldableTree{
    public boolean isFoldableTree(BinaryTree Ltree, BinaryTree Rtree){
        if(Ltree == null && Rtree == null){
            return true;
        }else if(Ltree != null && Rtree != null){
               return isFoldableTree(Ltree.getLeftNode(),Rtree.getRightTree()) &&
                isFoldableTree(Ltree.getRightTree(),Rtree.getLeftNode());
            }else
                return false;

    }
}
