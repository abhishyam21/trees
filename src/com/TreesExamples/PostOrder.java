package com.TreesExamples;

import java.util.Stack;

/**
 * Created by Rachana Rao on 12/20/2015.
 */
public class PostOrder {

    Stack<BinaryTree> stack = new Stack<>();
    public void postOderTraversalWithoutRecursion(BinaryTree root){

        BinaryTree current = null;
        BinaryTree prev = null;

        BinaryTree prevNode = null;
        while (true){
            while (root!=null){
                stack.push(root);
                root = root.getLeftNode();
            }
            if(stack.isEmpty())
                return;

            else {
                prev = current;
                current = stack.peek();
                if(current.getLeftNode() == null && current.getRightTree() == null) {
                    System.out.print(current.getData()+"\t");
                    stack.pop();

                }
                else{
                    if(current.getRightTree().equals(prev)){
                        System.out.print(stack.pop().getData()+"\t");
                    }else
                    if(current.getRightTree() != null) {
                        root = current.getRightTree();
                    }
                }
            }
            }
        }

    public void postOrder(BinaryTree Root){
        if(Root==null)
            return;
        else {
            postOrder(Root.getLeftNode());
            postOrder(Root.getRightTree());
            System.out.print(Root.getData()+"\t");
        }
    }
}




/*
public void postOderTraversalWithoutRecursion(BinaryTree root){
        while (true){
            while (root!=null){
                stack.push(root);
                root = root.getLeftNode();
            }
            if(stack.isEmpty()){
                break;
            }else {
                BinaryTree tempNode = stack.pop();
                if(tempNode.getRightTree()!=null) {
                    root = tempNode.getRightTree();
                }else
                    System.out.print(tempNode.getData() + "\t");
            }
        }
    }
 */


/*
{
                BinaryTree temp = stack.pop();
                if(temp.getRightTree()!=null){
                            if(stack.peek().getRightTree().equals(temp)){
                                System.out.print(temp.getData()+"\t");
                                root = stack.pop();
                                System.out.print(root.getData()+"\t");
                                root = stack.pop();

                    }else {
                                System.out.print(temp.getData() + "\t");
                                root = stack.pop();
                            }
                }else {
                    System.out.print(temp.getData() + "\t");
                }
            }
 */