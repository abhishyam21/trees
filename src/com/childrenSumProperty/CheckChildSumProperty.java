package com.childrenSumProperty;

import com.TreesExamples.BinaryTree;

/**
 * Created by Rachana Rao on 2/7/2016.
 */
public class CheckChildSumProperty {
    public void childSumProperty(BinaryTree root){
        if(root == null)
            return;
        else {
            if(root.getLeftNode() != null && root.getRightTree() != null){
                if(root.getData() == (root.getLeftNode().getData()+root.getRightTree().getData())){
                    childSumProperty(root.getLeftNode());
                    childSumProperty(root.getRightTree());
                }else {
                    System.out.println("Not Sum of Children!!!");
                }
            }else {
                if(root.getRightTree()!= null){
                    if(root.getRightTree().getData() == root.getData()){
                        childSumProperty(root.getRightTree());
                    }else {
                        System.out.println("Not Sum of Children!!!");
                    }
                }
                else if(root.getLeftNode() != null){
                    if(root.getLeftNode().getData() == root.getData()){
                        childSumProperty(root.getLeftNode());
                    }else {
                        System.out.println("Not Sum of Children!!!");
                    }
                }
            }
        }
    }
}
