package com.findingTheLargestNumberInTree;

import com.TreesExamples.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Rachana Rao on 12/26/2015.
 */
public class LargestNumberInTreeWithoutRecursion {
    protected int largestNumberWithoutRecursion(BinaryTree tree){
        int maxNumber = 0;
        Queue<BinaryTree> queue = new ArrayDeque<>();
        queue.add(tree);
        while (!queue.isEmpty()){
            BinaryTree current = queue.remove();
            if(maxNumber<current.getData()){
                maxNumber = current.getData();
            }
            if(current.getLeftNode()!=null){
                queue.add(current.getLeftNode());
            }
            if(current.getRightTree()!=null){
                queue.add(current.getRightTree());
            }
        }
        return maxNumber;
    }
}
