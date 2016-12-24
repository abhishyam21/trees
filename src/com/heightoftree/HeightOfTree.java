package com.heightoftree;

import com.TreesExamples.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Rachana Rao on 12/28/2015.
 */
public class HeightOfTree {

    int height = 1;
    Queue<BinaryTree> queue = new ArrayDeque<>();
    Queue<BinaryTree> stack = new ArrayDeque<>();
    BinaryTree dummyNode = new BinaryTree(-1);

    public int height(BinaryTree root){
        if(root == null)
            return 0;
        else{
            queue.add(root);
            queue.add(dummyNode);
            while (!queue.isEmpty()){
                BinaryTree current = queue.element();
                if(current.equals(dummyNode) && queue.size()>1){
                    queue.remove();
                    height++;
                    queue.add(dummyNode);
                }else{
                    if(current.getLeftNode()!=null){
                        queue.add(current.getLeftNode());
                    }
                    if(current.getRightTree() != null){
                        queue.add(current.getRightTree());
                    }
                    queue.remove();
                }
            }
        }
        return height;
    }

    public void PrintLevelOrder(BinaryTree root){
        {
            if(root == null)
                return;
            else{
                queue.add(root);
                queue.add(dummyNode);
                while (!queue.isEmpty()){
                    BinaryTree current = queue.element();
                    stack.add(current);
                    if(current.equals(dummyNode) && queue.size()>1){
                        queue.remove();
                        height++;
                        queue.add(dummyNode);
                    }else{
                        if(current.getLeftNode()!=null){
                            queue.add(current.getLeftNode());
                        }
                        if(current.getRightTree() != null){
                            queue.add(current.getRightTree());
                        }
                        queue.remove();
                    }
                }
            }

            while (!stack.isEmpty()){
                BinaryTree current = stack.remove();
                if(current.getData()==-1){
                    System.out.println("");
                }else {
                    System.out.print(current.getData()+"\t");
                }
            }
        }
    }
}
