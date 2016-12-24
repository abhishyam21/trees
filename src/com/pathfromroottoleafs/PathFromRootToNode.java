package com.pathfromroottoleafs;

import com.TreesExamples.BinaryTree;

import java.util.*;

/**
 * Created by Rachana Rao on 12/30/2015.
 */
public class PathFromRootToNode {
    Stack<BinaryTree> stack = new Stack<>();

    public void ancestorsOfNode(BinaryTree root){

        BinaryTree current = null;
        BinaryTree prev = null;

        if(root==null){
            return;
        }else {
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
                        print(stack);
                        stack.pop();

                    }
                    else{
                        if(current.getRightTree().equals(prev)){
                            stack.pop();
                        }else
                        if(current.getRightTree() != null) {
                            root = current.getRightTree();
                        }
                    }
                }
            }
        }

    }

    private void print(Stack<BinaryTree> stack) {
        Object[] nodes = stack.toArray();
        for (Object node : stack) {
            BinaryTree binaryTree = (BinaryTree) node;
            System.out.print(binaryTree.getData() + "\t");
        }
        System.out.println("");

    }

}
