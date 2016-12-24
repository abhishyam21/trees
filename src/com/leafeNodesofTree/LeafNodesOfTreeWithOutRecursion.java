package com.leafeNodesofTree;

import com.TreesExamples.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Rachana Rao on 12/28/2015.
 */
public class LeafNodesOfTreeWithOutRecursion {
    Queue<BinaryTree> queue = new ArrayDeque<>();
    public void leafNodes(BinaryTree root){
        if(root==null){
            return;
        }else {
            queue.add(root);
            while (!queue.isEmpty()){
                BinaryTree currentNode = queue.remove();
                if(currentNode.getRightTree()==null && currentNode.getLeftNode()==null){
                    System.out.print(currentNode.getData()+"\t");
                }
                else {
                    if(currentNode.getLeftNode()!=null)
                        queue.add(currentNode.getLeftNode());
                    if(currentNode.getRightTree()!=null)
                        queue.add(currentNode.getRightTree());
                }
            }
        }

    }
}
