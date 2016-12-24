package com.ancestorsofanode;

import com.TreesExamples.BinaryTree;
import com.pathfromroottoleafs.PathFromRootToNode;

/**
 * Created by Rachana Rao on 12/30/2015.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        BinaryTree Root = main.addNodesToTree();
        AncestorsOfNode ancestorsOfNode = new AncestorsOfNode();
        ancestorsOfNode.getAncestors(Root,10);

        AncestorOfNodeWithRecursion ancestorOfNodeWithRecursion = new AncestorOfNodeWithRecursion();
        ancestorOfNodeWithRecursion.ancestorOfNodeWithRecursion(Root,4);
    }


    public BinaryTree addNodesToTree(){
        BinaryTree Root = new BinaryTree(1);

        BinaryTree leftNode = new BinaryTree(2);
        
        Root.setLeftNode(leftNode);

        BinaryTree rightNode = new BinaryTree(3);
        Root.setRightTree(rightNode);

        BinaryTree leftleftNode = new BinaryTree(4);
        Root.getLeftNode().setLeftNode(leftleftNode);

        BinaryTree leftRightTree = new BinaryTree(5);
        Root.getLeftNode().setRightTree(leftRightTree);

        BinaryTree rightLeftNode = new BinaryTree(6);
        BinaryTree rightRightNode = new BinaryTree(7);

        Root.getRightTree().setLeftNode(rightLeftNode);
        Root.getRightTree().setRightTree(rightRightNode);

        BinaryTree leftLeftLeftNode = new BinaryTree(8);
        BinaryTree leftleftRightNode = new BinaryTree(9);

        Root.getLeftNode().getLeftNode().setLeftNode(leftLeftLeftNode);
        Root.getLeftNode().getLeftNode().setRightTree(leftleftRightNode);

        BinaryTree leftRightLeftNode = new BinaryTree(10);
        BinaryTree leftRightRightNode = new BinaryTree(11);

        Root.getLeftNode().getRightTree().setLeftNode(leftRightLeftNode);
        Root.getLeftNode().getRightTree().setRightTree(leftRightRightNode);

        BinaryTree rightLeftLeftNode = new BinaryTree(12);
        BinaryTree rightLeftRightNode = new BinaryTree(13);
        BinaryTree rightrRightLeftNode = new BinaryTree(14);
        BinaryTree rightRightRightNode = new BinaryTree(15);

        Root.getRightTree().getLeftNode().setLeftNode(rightLeftLeftNode);
        Root.getRightTree().getLeftNode().setRightTree(rightLeftRightNode);
        Root.getRightTree().getRightTree().setLeftNode(rightrRightLeftNode);
        Root.getRightTree().getRightTree().setRightTree(rightRightRightNode);

        return Root;
    }
}
