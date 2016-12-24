package com.segmentationTree;

import com.TreesExamples.BinaryTree;


/**
 * Created by Rachana Rao on 2/17/2016.
 */
public class SegmentTreeExample {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i <= 2; i++) {
            array[i] = 1+i;
        }
        long start = System.currentTimeMillis();
       /* SegmentTree segmentTree = new SegmentTree();
        Segmentree Root = segmentTree.createTree(array,1);*/
        Test test = new Test();
        Segmentree Root = test.createTree(array,0,array.length);
        if(!test.findElement(Root,2))
            System.out.println("Not found!!!");

        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000);
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
       // levelOrderTraversal.levelOrderTraversal(Root);

        //BinaryTree updateTree = segmentTree.update(array,0,3);
    }
}
