package com.treeconstructionfromlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rachana Rao on 12/30/2015.
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> preOrder = new ArrayList<>();
        inOrder.add(8);    preOrder.add(1);
        inOrder.add(4);     preOrder.add(2);
        inOrder.add(9);     preOrder.add(4);
        inOrder.add(2);     preOrder.add(8);
        inOrder.add(10);    preOrder.add(9);
        inOrder.add(5);     preOrder.add(5);
        inOrder.add(11);    preOrder.add(10);
        inOrder.add(1);     preOrder.add(11);
        inOrder.add(12);    preOrder.add(3);
        inOrder.add(6);     preOrder.add(6);
        inOrder.add(13);    preOrder.add(12);
        inOrder.add(3);     preOrder.add(13);
        inOrder.add(14);    preOrder.add(7);
        inOrder.add(7);     preOrder.add(14);
        inOrder.add(15);    preOrder.add(15);


        TreeConstruction treeConstruction = new TreeConstruction();
        treeConstruction.treeConstruction(inOrder,preOrder,0);
    }
}
