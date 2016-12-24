package com.TreesExamples;

import java.util.Stack;

/**
 * Created by Rachana Rao on 12/20/2015.
 */
public class PreOrder {
    Stack<BinaryTree> stack = new Stack<>();
    public void preOderTraversalWithoutRecursion(BinaryTree root){
        while (true){
            while (root!=null){
                stack.push(root);
                System.out.print(root.getData() + "\t");
                root = root.getLeftNode();
            }
            if(stack.isEmpty()){
                break;
            }else {
                BinaryTree tempNode = stack.pop();
                root = tempNode.getRightTree();
            }
        }
    }


    public void preOrder(BinaryTree root){
        if(root==null){
            return;
        }else {
            System.out.print(root.getData()+"\t");
            preOrder(root.getLeftNode());
            preOrder(root.getRightTree());
        }
    }
}
