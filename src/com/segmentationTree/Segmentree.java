package com.segmentationTree;

/**
 * Created by Rachana Rao on 2/20/2016.
 */
public class Segmentree {
    int data;
    int start;
    int end;
    Segmentree leftNode;
    Segmentree rightNode;

    public Segmentree(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public Segmentree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Segmentree leftNode) {
        this.leftNode = leftNode;
    }

    public Segmentree getRightNode() {
        return rightNode;
    }

    public void setRightNode(Segmentree rightNode) {
        this.rightNode = rightNode;
    }
}
