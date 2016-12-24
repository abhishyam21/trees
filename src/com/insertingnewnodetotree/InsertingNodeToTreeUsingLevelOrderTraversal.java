package com.insertingnewnodetotree;

import com.TreesExamples.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Rachana Rao on 12/27/2015.
 */
public class InsertingNodeToTreeUsingLevelOrderTraversal {
    Queue<BinaryTree> queue = new ArrayDeque<>();
    public BinaryTree addNodeToTree(int data,BinaryTree tree){
        BinaryTree binaryTree = new BinaryTree(data);
        if(tree==null){
            tree = binaryTree;
            return tree;
        }else {
            queue.add(tree);
            while (!queue.isEmpty()){
                BinaryTree current = queue.remove();
                if(current.getLeftNode()!=null){
                    queue.add(current.getLeftNode());
                }else {
                    current.setLeftNode(binaryTree);
                    break;
                }
                if(current.getRightTree()!=null){
                    queue.add(current.getRightTree());
                }else {
                    current.setRightTree(binaryTree);
                    break;
                }
            }
        }
        return tree;
    }
}
