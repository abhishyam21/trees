package com.treeconstructionfromlist;

import com.TreesExamples.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rachana Rao on 12/30/2015.
 */
public class TreeConstruction {

        public void treeConstruction(List inOrder, List preOrder,int i){
        if(inOrder.size()<=1){
            return;
        }else {
            int rootposition = getRootPosition(inOrder, (Integer) preOrder.get(i));
            treeConstruction( inOrder.subList(0,rootposition),preOrder,++i);





            BinaryTree LeftNode = new BinaryTree((Integer) inOrder.get(rootposition-1));
            BinaryTree RightNode = new BinaryTree((Integer) inOrder.get(rootposition+1));
            BinaryTree Root = new BinaryTree((Integer) inOrder.get(rootposition));
            /*treeConstruction( inOrder.subList(rootposition,inOrder.size()),preOrder,++i);
            print(inOrder);*/


        }

    }

    public int getRootPosition(List inorder,int data){
        for (int i = 0; i < inorder.size(); i++) {
            if(inorder.get(i).equals(data))
                return i;
        }
        return -1;
    }

    public void print(List<Integer> list){
        for (Integer lists :list){
            System.out.println(list);
        }
    }
    }
