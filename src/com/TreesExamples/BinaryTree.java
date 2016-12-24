package com.TreesExamples;

/**
 * Created by Rachana Rao on 12/18/2015.
 */
public class BinaryTree {
    private Integer data;
    private BinaryTree leftNode;
    private BinaryTree rightTree;

    public BinaryTree(Integer data) {
        this.data = data;
        this.leftNode = null;
        this.rightTree = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTree leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTree getRightTree() {
        return rightTree;
    }

    public void setRightTree(BinaryTree rightTree) {
        this.rightTree = rightTree;
    }

}
