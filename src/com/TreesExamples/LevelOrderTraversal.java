package com.TreesExamples;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Rachana Rao on 12/26/2015.
 */
public class LevelOrderTraversal {


    BinaryTree tempNode = new BinaryTree(-1);
    public void levelOrderTraversal(BinaryTree tree){
        Queue<BinaryTree> queue = new ArrayDeque<>();
       if(tree==null){
           return;
       }
        else {
           queue.add(tree);
            queue.add(tempNode);
           while (queue.size()>1) {
               BinaryTree current = queue.remove();
               if (current.equals(tempNode)) {
                   System.out.println("\n");
                   queue.add(tempNode);
               } else {
                   System.out.print(current.getData() + "\t");
                   if (current.getLeftNode() != null) {
                       queue.add(current.getLeftNode());
                   }
                   if (current.getRightTree() != null) {
                       queue.add(current.getRightTree());
                   }
               }
           }
       }
    }
}
