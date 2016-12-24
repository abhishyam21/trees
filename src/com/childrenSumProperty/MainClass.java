package com.childrenSumProperty;

import com.TreesExamples.BinaryTree;
import com.TreesExamples.LevelOrderTraversal;

/**
 * Created by Rachana Rao on 12/28/2015.
 */
public class MainClass {
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        BinaryTree Root = mainClass.addNodesToTree();

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrderTraversal(Root);
        CheckChildSumProperty childSumProperty = new CheckChildSumProperty();
        childSumProperty.childSumProperty(Root);
    }

    protected BinaryTree addNodesToTree(){
        BinaryTree Root = null;
        Root = new BinaryTree(12);

        BinaryTree leftNode = new BinaryTree(8);
        Root.setLeftNode(leftNode);

        BinaryTree rightNode = new BinaryTree(4);
        Root.setRightTree(rightNode);

        BinaryTree leftleftNode = new BinaryTree(3);
        Root.getLeftNode().setLeftNode(leftleftNode);

        BinaryTree leftRightTree = new BinaryTree(5);
        Root.getLeftNode().setRightTree(leftRightTree);

        BinaryTree rightLeftNode = new BinaryTree(4);
      //  BinaryTree rightRightNode = new BinaryTree(1);

        Root.getRightTree().setLeftNode(rightLeftNode);
      //  Root.getRightTree().setRightTree(rightRightNode);
    /*
        BinaryTree rightLeftLeftNode = new BinaryTree(8);
        BinaryTree rightLeftRightNode = new BinaryTree(9);
        BinaryTree rightrRightLeftNode = new BinaryTree(10);
        BinaryTree rightRightRightNode = new BinaryTree(11);
        BinaryTree rightLeftRightLeftRightNode = new BinaryTree(12);

        Root.getRightTree().setLeftNode(rightLeftLeftNode);
        Root.getRightTree().getLeftNode().setRightTree(rightLeftRightNode);
        Root.getRightTree().getLeftNode().getRightTree().setLeftNode(rightrRightLeftNode);
        Root.getRightTree().getLeftNode().getRightTree().getLeftNode().setRightTree(rightRightRightNode);
        Root.getRightTree().getLeftNode().getRightTree().getLeftNode().getRightTree().setLeftNode(rightLeftRightLeftRightNode);
/*
                BinaryTree leftLeftLeftLeftNode = new BinaryTree(16);
                BinaryTree leftleftleftRightNode = new BinaryTree(17);
                BinaryTree leftleftRightLeftNode = new BinaryTree(18);
                BinaryTree leftLeftRightRightNode = new BinaryTree(19);
                BinaryTree leftRightleftleftNode = new BinaryTree(20);
                BinaryTree leftRightleftRightNode = new BinaryTree(21);
                BinaryTree leftRightRightLeftNode = new BinaryTree(22);
                BinaryTree leftRightRightRightNode = new BinaryTree(23);

                Root.getLeftNode().getLeftNode().getLeftNode().setLeftNode(leftLeftLeftLeftNode);
                Root.getLeftNode().getLeftNode().getLeftNode().setRightTree(leftleftleftRightNode);
                Root.getLeftNode().getLeftNode().getRightTree().setLeftNode(leftleftRightLeftNode);
                Root.getLeftNode().getLeftNode().getRightTree().setRightTree(leftLeftRightRightNode);
                Root.getLeftNode().getRightTree().getLeftNode().setLeftNode(leftRightleftleftNode);
                Root.getLeftNode().getRightTree().getLeftNode().setRightTree(leftRightleftRightNode);
                Root.getLeftNode().getRightTree().getRightTree().setLeftNode(leftRightRightLeftNode);
                Root.getLeftNode().getRightTree().getRightTree().setRightTree(leftRightRightRightNode);

                BinaryTree rightRightRightRightNode = new BinaryTree(50);
                Root.getRightTree().getRightTree().getRightTree().setRightTree(rightRightRightRightNode);*/
        return Root;
    }
}
