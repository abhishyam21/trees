package com.segmentationTree;

import com.TreesExamples.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Rachana Rao on 2/20/2016.
 */public class LevelOrderTraversal {


    Segmentree tempNode = new Segmentree(-1);
    public void levelOrderTraversal(Segmentree tree){
        Queue<Segmentree> queue = new ArrayDeque<>();
        if(tree==null){
            return;
        }
        else {
            queue.add(tree);
            queue.add(tempNode);
            while (queue.size()>1) {
                Segmentree current = queue.remove();
                if (current.equals(tempNode)) {
                    System.out.println("\n");
                    queue.add(tempNode);
                } else {
                    System.out.print(current.getData()+"["+current.getStart()+","+current.getEnd()+"]" + "\t");
                    if (current.getLeftNode() != null) {
                        queue.add(current.getLeftNode());
                    }
                    if (current.getRightNode() != null) {
                        queue.add(current.getRightNode());
                    }
                }
            }
        }
    }
}
