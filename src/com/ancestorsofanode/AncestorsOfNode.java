package com.ancestorsofanode;

import com.TreesExamples.BinaryTree;

import java.util.Stack;

/**
 * Created by Rachana Rao on 1/6/2016.
 */
public class AncestorsOfNode {
    public void getAncestors(BinaryTree root,int data) {
        if(root==null)
            return;

        BinaryTree current = root;
        BinaryTree prev = current;
        Stack<BinaryTree> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.getLeftNode();
            }
            if (stack.isEmpty()) {
                return;
            } else {
                prev = current;
                current = stack.peek();

                if(current.getData()==data) {
                    print(stack);
                   // break;
                }

                if (current.getLeftNode() == null && current.getRightTree() == null) {

                    stack.pop();
                } else {
                    if (prev.equals(current.getRightTree())) {
                        stack.pop();
                    } else if (current.getRightTree() != null) {
                        root = current.getRightTree();
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
