package com.TreesExamples;

import java.util.*;

/**
 * Created by Rachana Rao on 12/27/2015.
 */
public class LeveLOrderInReverseOrder {

    Queue<BinaryTree> queue = new ArrayDeque<>();

    BinaryTree temp = new BinaryTree(-1);

    public void prebinding(BinaryTree root){
        queue.add(root);
        queue.add(temp);
        levelOrderTraversal(queue.remove());
    }
    public void levelOrderTraversal(BinaryTree current){
        if(queue.isEmpty()){
            return;
        }else
        if(current.equals(temp)){
            queue.add(temp);
            System.out.println("");
        }else {
            System.out.print(current.getData()+"\t");
                if(current.getLeftNode()!=null){
                    queue.add(current.getLeftNode());
                }
                if(current.getRightTree()!=null){
                    queue.add(current.getRightTree());
                }
            }
        levelOrderTraversal(queue.remove());
        }

    private void print(Stack<BinaryTree> stack) {
        while (!stack.isEmpty()){
            System.out.print(stack.pop().getData()+"\t");
        }
    }
}
