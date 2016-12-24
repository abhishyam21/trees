package com.sumofleftsubtreetoroot;

import com.TreesExamples.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Rachana Rao on 1/15/2016.
 *
 * This problem is from Geeksforgeeks.
 * http://geeksquiz.com/change-a-binary-tree-so-that-every-node-stores-sum-of-all-nodes-in-left-subtree/
 *
 */
public class ChangeTree {
    public BinaryTree ChangeTreeData(BinaryTree tree){
        BinaryTree tempTree = tree;
        Queue<BinaryTree> queue = new ArrayDeque<>();
        queue.add(tree);
        while (!queue.isEmpty()){
            BinaryTree tepmNode = queue.remove();
            tepmNode.setData(tepmNode.getData() + sum(tepmNode.getLeftNode()));
            if(tepmNode.getLeftNode() != null)
            queue.add(tepmNode.getLeftNode());
            if(tepmNode.getRightTree() != null)
            queue.add(tepmNode.getRightTree());
        }

        return tempTree;
    }

    private int sum(BinaryTree leftNode) {
        if(leftNode == null){
            return 0;
        }else {
            return leftNode.getData()+sum(leftNode.getLeftNode())+sum(leftNode.getRightTree());
        }
    }

}
