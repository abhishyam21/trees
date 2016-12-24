package com.topviewoftree;

import com.TreesExamples.BinaryTree;

/**
 * Created by Rachana Rao on 2/7/2016.
 */
public class TopView {
    public void printTopView(BinaryTree root) {
        printLeft(root);
        printRight(root.getRightTree());
    }

    private void printRight(BinaryTree root) {
        if(root == null)
            return;
        else {
            printRight(root.getRightTree());
            System.out.println(root.getData());
        }

    }

    private void printLeft(BinaryTree root) {
        if(root == null)
            return;
        else {
            printLeft(root.getLeftNode());
            System.out.println(root.getData());
        }

    }
}
