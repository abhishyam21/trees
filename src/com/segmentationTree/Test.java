package com.segmentationTree;

/**
 * Created by Rachana Rao on 2/21/2016.
 */
public class Test {
    Segmentree Root = null;
    public Segmentree createTree(int[] array,int start,int end) {
        if((end-start)==2) {
            return createRootFromTwoNodes(array,start);
        }else if((end-start) == 1) {
            return createRootFromOneNode(array,start);
        }else {
            int mid = (int) (Math.ceil((float)(end+start)/2));
            Segmentree root1 = createTree(array, start, mid);
            Segmentree root2 = createTree(array, mid, end);
            Root = new Segmentree(root1.getData()+root2.getData());
            Root.setRightNode(root2);
            Root.setLeftNode(root1);
            Root.setStart(root1.getStart());
            Root.setEnd(root2.getEnd());
        }
        return Root;
    }

    private Segmentree createRootFromOneNode(int[] array, int start) {
        Segmentree node1 = new Segmentree(array[start]);
        node1.setStart(start);
        node1.setEnd(start);
        return node1;
    }

    private Segmentree createRootFromTwoNodes(int[] array, int start) {
        Segmentree node1 = new Segmentree(array[start]);
        node1.setStart(start);
        node1.setEnd(start);
        Segmentree node2 = new Segmentree(array[start+1]);
        node2.setStart(start+1);
        node2.setEnd(start+1);
        Segmentree root = new Segmentree(node1.getData()+node2.getData());
        root.setLeftNode(node1);
        root.setRightNode(node2);
        root.setStart(start);
        root.setEnd(start+1);
        return root;
    }

    public boolean findElement(Segmentree root,int n){
        if(root == null) {
            return false;
        }else
        if(root.getData() == n){
                return true;
            }else {
                findElement(root.getLeftNode(),n);
                findElement(root.getRightNode(),n);
            }
        return false;
    }
}
