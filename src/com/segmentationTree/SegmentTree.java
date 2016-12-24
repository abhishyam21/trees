package com.segmentationTree;



import java.util.Arrays;

/**
 * Created by Rachana Rao on 2/17/2016.
 */
public class SegmentTree {

    Segmentree Root = null;

    public Segmentree createTree(int[] array,int count) {
        System.out.println(count);
        int size = array.length;
        if(size>2){
            Segmentree root2 =createTree(Arrays.copyOfRange(array, size / 2, size),++count);
            Segmentree root1 =createTree(Arrays.copyOfRange(array, 0, size / 2),++count);
            Root = new Segmentree(root1.getData()+root2.getData());
            Root.setRightNode(root2);
            Root.setLeftNode(root1);
            Root.setStart(0);
            Root.setEnd(array.length);

        }else {
            if(size ==2){
                Segmentree node1 = new Segmentree(array[0]);
                node1.setStart(count);
                node1.setEnd(count);
                Segmentree node2 = new Segmentree(array[1]);
                node2.setStart(count);
                node2.setEnd(count);
                Segmentree root = new Segmentree(array[0]+array[1]);
                root.setLeftNode(node1);
                root.setRightNode(node2);
                root.setStart(count);
                root.setEnd(count);
                return root;
            }else if(size==1){
                Segmentree node1 = new Segmentree(array[0]);
                node1.setStart(count);
                node1.setEnd(count);
                return node1;
            }
        }
        return Root;
    }
/*
    public Segmentree update(int[] array, int index, int val) {

    }*/
}
